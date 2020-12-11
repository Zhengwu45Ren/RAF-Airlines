package raf.petrovicpleskonjic.rafairlinesuserservice;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import static raf.petrovicpleskonjic.rafairlinesuserservice.security.SecurityConstants.SECRET;
import static raf.petrovicpleskonjic.rafairlinesuserservice.security.SecurityConstants.TOKEN_PREFIX;

public class UtilityMethods {

	public static ResponseEntity<Integer> sendGet(String url) {

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<Integer> response = restTemplate.exchange(url, HttpMethod.GET, entity, Integer.class);

		return response;
	}

	public static ResponseEntity<Integer> sendPost(String url, Object body) {

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();

		HttpEntity<Object> entity = new HttpEntity<Object>(body, headers);

		ResponseEntity<Integer> response = restTemplate.exchange(url, HttpMethod.POST, entity, Integer.class);

		return response;
	}

	public static String getUserFromToken(String token) {
		return JWT.require(Algorithm.HMAC512(SECRET.getBytes())).build()
				.verify(token.replace(TOKEN_PREFIX, "")).getSubject();
	}
}
