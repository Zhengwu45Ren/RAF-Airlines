package raf.petrovicpleskonjic.rafairlinesuserservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import raf.petrovicpleskonjic.rafairlinesuserservice.forms.requests.RegistrationRequest;
import raf.petrovicpleskonjic.rafairlinesuserservice.models.User;
import raf.petrovicpleskonjic.rafairlinesuserservice.repositories.AdministratorRepository;
import raf.petrovicpleskonjic.rafairlinesuserservice.repositories.UserRepository;

@RestController
@RequestMapping("")
public class Controller {

	private BCryptPasswordEncoder encoder;
	private UserRepository userRepo;
	private AdministratorRepository adminRepo;

	@Autowired
	public Controller(BCryptPasswordEncoder encoder, UserRepository userRepo, AdministratorRepository adminRepo) {
		this.encoder = encoder;
		this.userRepo = userRepo;
		this.adminRepo = adminRepo;
	}
	
	@PostMapping("/register")
	public ResponseEntity<Void> register(@RequestBody RegistrationRequest request) {

		try {			
			User user = new User(request.getName(), request.getSurname(), request.getEmail(),
					encoder.encode(request.getPassword()), request.getPassport());

			userRepo.saveAndFlush(user);

			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
