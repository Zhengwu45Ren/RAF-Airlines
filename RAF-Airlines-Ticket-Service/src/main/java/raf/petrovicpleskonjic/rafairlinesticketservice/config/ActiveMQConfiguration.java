package raf.petrovicpleskonjic.rafairlinesticketservice.config;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Queue;

import air.buyTicketError.roles.F;
import air.buyTicketError.roles.T;
import air.buyTicketError.roles.U;
import airline.buyTicket.roles.Flight;
import airline.buyTicket.roles.Ticket;
import airline.buyTicket.roles.User;
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
	public Queue flightAssignedUserQueue() {
		return new ActiveMQQueue("flight-assigned.user.queue");
	}
	
	@Bean
	public Queue flightAssignedFlightQueue() {
		return new ActiveMQQueue("flight-assigned.flight.queue");
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
	public MSEndpoint<Ticket> msEndpoint(){
		try {
			activeMQConnectionFactory().setTrustAllPackages(true);
			Connection connection = activeMQConnectionFactory().createConnection();
			connection.start();

			MSEndpoint<Ticket> msEndpoint = new MSEndpoint<>(Ticket.Ticket, connection);
			msEndpoint.connect(Flight.Flight);
			msEndpoint.connect(User.User);
			return msEndpoint;
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}

	@Bean
	public MSEndpoint<T> msEndpointT(){
		try {
			activeMQConnectionFactory().setTrustAllPackages(true);
			Connection connection = activeMQConnectionFactory().createConnection();
			connection.start();

			MSEndpoint<T> msEndpoint = new MSEndpoint<>(T.T, connection);
			msEndpoint.connect(U.U);
			msEndpoint.connect(F.F);
			return msEndpoint;
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}
}
