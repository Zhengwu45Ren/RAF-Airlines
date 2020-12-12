package raf.petrovicpleskonjic.rafairlinesuserservice.controllers;

import static raf.petrovicpleskonjic.rafairlinesuserservice.security.SecurityConstants.HEADER_STRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public ResponseEntity<User> update(@RequestBody UpdateRequest request, @RequestHeader(value = HEADER_STRING) String token) {
		try {
		
		User user = userRepo.findByEmail(UtilityMethods.getUserFromToken(token));
		if (user == null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		user.setEmail(request.getEmail());
		user.setName(request.getName());
		user.setSurname(request.getSurname());
		user.setPassport(request.getPassport());
		user.setPassword(encoder.encode(request.getPassword()));
		
		userRepo.save(user);
		
		return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
		
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
