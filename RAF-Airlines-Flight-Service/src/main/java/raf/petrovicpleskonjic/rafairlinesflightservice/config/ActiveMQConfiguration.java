package raf.petrovicpleskonjic.rafairlinesflightservice.config;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Queue;

import airline.buyTicket.roles.Flight;
import airline.buyTicket.roles.Ticket;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.scribble.runtime.session.MSEndpoint;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class ActiveMQConfiguration {


	@Value("${activemq.broker-url}")
	public String brokerUrl;

	@Bean
	public Queue flightDeletedUserQueue() {
		return new ActiveMQQueue("flight-deleted.user.queue");
	}
	
	@Bean
	public Queue flightDeletedTicketQueue() {
		return new ActiveMQQueue("flight-deleted.ticket.queue");
	}

	@Bean
	public ActiveMQConnectionFactory activeMQConnectionFactory() {
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
		factory.setBrokerURL(brokerUrl);
		return factory;
	}
	
	@Bean
	public JmsTemplate jmsTemplate() {
		return new JmsTemplate(activeMQConnectionFactory());
	}

	@Bean
	public MSEndpoint<Flight> msEndpoint(){
		try {
			activeMQConnectionFactory().setTrustAllPackages(true);
			Connection connection = activeMQConnectionFactory().createConnection();
			connection.start();

			MSEndpoint<Flight> msEndpoint = new MSEndpoint<>(Flight.Flight, connection);
			msEndpoint.connect(Ticket.Ticket);
			return msEndpoint;
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}
}
