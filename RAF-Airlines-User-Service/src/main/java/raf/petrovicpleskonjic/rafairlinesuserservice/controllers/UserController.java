package raf.petrovicpleskonjic.rafairlinesuserservice.controllers;

import static raf.petrovicpleskonjic.rafairlinesuserservice.security.SecurityConstants.HEADER_STRING;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import raf.petrovicpleskonjic.rafairlinesuserservice.UtilityMethods;
import raf.petrovicpleskonjic.rafairlinesuserservice.forms.requests.user.RegistrationRequest;
import raf.petrovicpleskonjic.rafairlinesuserservice.forms.requests.user.UpdateRequest;
import raf.petrovicpleskonjic.rafairlinesuserservice.models.User;
import raf.petrovicpleskonjic.rafairlinesuserservice.repositories.AdministratorRepository;
import raf.petrovicpleskonjic.rafairlinesuserservice.repositories.UserRepository;

@RestController
@RequestMapping("")
public class UserController {

	private BCryptPasswordEncoder encoder;
	private UserRepository userRepo;

	@Autowired
	public UserController(BCryptPasswordEncoder encoder, UserRepository userRepo, AdministratorRepository adminRepo) {
		this.encoder = encoder;
		this.userRepo = userRepo;
	}

	@GetMapping("/admin-verification")
	public ResponseEntity<Boolean> getProfile(Authentication authentication) {
		boolean isAdmin = false;
		for (GrantedAuthority a : authentication.getAuthorities())
			if (a.getAuthority().equals("ROLE_ADMIN"))
				isAdmin = true;
		
		return new ResponseEntity<>(isAdmin, HttpStatus.ACCEPTED);			

	}
	
	@GetMapping("/profile-by-id")
	public ResponseEntity<User> getUserById(Authentication authentication, @RequestParam long userId) {
		try {
			boolean isAdmin = false;
			for (GrantedAuthority a : authentication.getAuthorities())
				if (a.getAuthority().equals("ROLE_ADMIN"))
					isAdmin = true;
			
			if (!isAdmin)
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			
			Optional<User> user = userRepo.findById(userId);
			if (!user.isPresent())
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

			return new ResponseEntity<>(user.get(), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/my-profile")
	public ResponseEntity<User> getUserById(Authentication authentication) {
		try {		
			User user = userRepo.findByEmail(authentication.getName());
			
			if (user == null)
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

			return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/register")
	public ResponseEntity<Void> register(@RequestBody RegistrationRequest request) {

		try {
			User user = new User(0, request.getName(), request.getSurname(), request.getEmail(),
					encoder.encode(request.getPassword()), request.getPassport());

			userRepo.saveAndFlush(user);

			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update")
	public ResponseEntity<User> update(@RequestBody UpdateRequest request,
			@RequestHeader(value = HEADER_STRING) String token) {
		try {

			User user = userRepo.findByEmail(UtilityMethods.getUsernameFromToken(token));
			if (user == null)
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

			user.setEmail(request.getEmail());
			user.setName(request.getName());
			user.setSurname(request.getSurname());
			user.setPassport(request.getPassport());
			user.setPassword(encoder.encode(request.getPassword()));

			userRepo.save(user);

			return new ResponseEntity<>(user, HttpStatus.ACCEPTED);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
