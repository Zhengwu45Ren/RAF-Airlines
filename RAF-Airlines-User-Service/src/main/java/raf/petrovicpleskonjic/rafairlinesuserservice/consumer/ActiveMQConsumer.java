package raf.petrovicpleskonjic.rafairlinesuserservice.consumer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import raf.petrovicpleskonjic.rafairlinesuserservice.utils.EmailService;
import raf.petrovicpleskonjic.rafairlinesuserservice.messages.FlightAssignedMessage;
import raf.petrovicpleskonjic.rafairlinesuserservice.messages.FlightDeletedMessage;
import raf.petrovicpleskonjic.rafairlinesuserservice.models.User;
import raf.petrovicpleskonjic.rafairlinesuserservice.repositories.UserRepository;

@Component
public class ActiveMQConsumer {

	private EmailService emailService;
	private UserRepository userRepo;

	@Autowired
	public ActiveMQConsumer(EmailService emailService, UserRepository userRepo) {
		this.emailService = emailService;
		this.userRepo = userRepo;
	}

	@JmsListener(destination = "flight-deleted.user.queue")
	public void consumeFlightDeletion(String jsonMessage) {
		try {
			FlightDeletedMessage message = new ObjectMapper().readValue(jsonMessage, FlightDeletedMessage.class);

			Optional<User> user = userRepo.findById(message.getPassengerId());
			if (!user.isPresent())
				return;

			user.get().setMiles(user.get().getMiles() - message.getDistance());

			userRepo.save(user.get());

			StringBuilder body = new StringBuilder();
			body.append("Hello, ");
			body.append(user.get().getName());
			body.append("!\n\n");
			body.append("We're sending this message to let you know that your flight #");
			body.append(message.getFlightId());
			body.append(" has been canceled due to unforeseen circumstances.\n");
			body.append("Your funds in value of ");
			body.append(message.getPrice());
			body.append(" EUR have been refunded to your card\n\n");
			body.append("We're very sorry for the caused inconvenience!\n\nSincerely,\nRAF Airlines");

			emailService.sendSimpleMessage(user.get().getEmail(), "RAF Airlines - Profile update", body.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@JmsListener(destination = "flight-assigned.user.queue")
	public void consumeFlightAssign(String jsonMessage) {
		try {
			FlightAssignedMessage message = new ObjectMapper().readValue(jsonMessage, FlightAssignedMessage.class);

			Optional<User> user = userRepo.findById(message.getPassengerId());
			if (!user.isPresent())
				return;

			user.get().setMiles(user.get().getMiles() + message.getDistance());

			userRepo.save(user.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
