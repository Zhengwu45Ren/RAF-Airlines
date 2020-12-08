package raf.petrovicpleskonjic.rafairlinesuserservice.security;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import raf.petrovicpleskonjic.rafairlinesuserservice.repositories.UserRepository;

import static raf.petrovicpleskonjic.rafairlinesuserservice.security.SecurityConstants.*;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

	private UserRepository userRepo;

	@Autowired
	public JWTAuthorizationFilter(AuthenticationManager authManager, UserRepository userRepo) {
		super(authManager);
		this.userRepo = userRepo;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		String token = req.getHeader(HEADER_STRING);

		UsernamePasswordAuthenticationToken authentication = getAuthentication(req, token);

		SecurityContextHolder.getContext().setAuthentication(authentication);
		chain.doFilter(req, res);
	}

	private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request, String token) {

		if (token != null) {
			DecodedJWT jwt = JWT.require(Algorithm.HMAC512(SECRET.getBytes())).build()
					.verify(token.replace(TOKEN_PREFIX, ""));

			String email = jwt.getSubject();

			if (userRepo.existsByEmail(email) == false)
				return null;

			if (email != null)
				return new UsernamePasswordAuthenticationToken(email, null, new ArrayList<>());
			
			return null;
		}
		return null;
	}
}
