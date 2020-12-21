package raf.petrovicpleskonjic.rafairlinesuserservice.consumer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import raf.petrovicpleskonjic.rafairlinesuserservice.messages.FlightDeletedMessage;
import raf.petrovicpleskonjic.rafairlinesuserservice.models.Tier;
import raf.petrovicpleskonjic.rafairlinesuserservice.models.User;
import raf.petrovicpleskonjic.rafairlinesuserservice.repositories.TierRepository;
import raf.petrovicpleskonjic.rafairlinesuserservice.repositories.UserRepository;

@Component
public class ActiveMQConsumer {
	
	private TierRepository tierRepo;
	private UserRepository userRepo;
	
	@Autowired
	public ActiveMQConsumer(TierRepository tierRepo, UserRepository userRepo) {
		this.tierRepo = tierRepo;
		this.userRepo = userRepo;
	}

	@JmsListener(destination = "flight-deleted.user.queue")
	public void consume(String jsonMessage) {
		try {
			FlightDeletedMessage message = new ObjectMapper().readValue(jsonMessage, FlightDeletedMessage.class);
			
			Optional<User> user = userRepo.findById(message.getPassengerId());
			if (!user.isPresent())
				return;
			
			user.get().setMiles(user.get().getMiles() - message.getDistance());
			
			List<Tier> tiers = tierRepo.findAll();
			Tier newTier = null;
			
			for (Tier tier : tiers) {
				if (user.get().getMiles() > tier.getThreshold())
					if (newTier == null || newTier.getThreshold() < tier.getThreshold())
						newTier = tier;
			}
			
			user.get().setTier(newTier);
			userRepo.save(user.get());
			
			// TODO: Send email
			System.out.println("Sending mail to: " + user.get().getEmail());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
