package raf.petrovicpleskonjic.rafairlinesuserservice.config;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Queue;

import air.buyTicketError.roles.T;
import air.buyTicketError.roles.U;
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
	public Queue flightDeletedUserQueue() {
		return new ActiveMQQueue("flight-deleted.user.queue");
	}
	
	@Bean
	public Queue flightAssignedUserQueue() {
		return new ActiveMQQueue("flight-assigned.user.queue");
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
	public MSEndpoint<User> msEndpoint(){
		try {
			activeMQConnectionFactory().setTrustAllPackages(true);
			Connection connection = activeMQConnectionFactory().createConnection();
			connection.start();

			MSEndpoint<User> msEndpoint = new MSEndpoint<>(User.User, connection);
			msEndpoint.connect(Ticket.Ticket);
			return msEndpoint;
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}

	@Bean
	public MSEndpoint<U> msEndpointU(){
		try {
			activeMQConnectionFactory().setTrustAllPackages(true);
			Connection connection = activeMQConnectionFactory().createConnection();
			connection.start();

			MSEndpoint<U> msEndpoint = new MSEndpoint<>(U.U, connection);
			msEndpoint.connect(T.T);
			return msEndpoint;
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}
}
