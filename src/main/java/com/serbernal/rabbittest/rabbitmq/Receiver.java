package com.serbernal.rabbittest.rabbitmq;

import org.springframework.stereotype.Component;

import com.serbernal.rabbittest.dto.PersonaDTO;

@Component
public class Receiver {

	  public static final String RECEIVE_METHOD_NAME = "receiveMessage";
	  public void receiveMessage(PersonaDTO message) {
	    System.out.println("Received <" + message.getNombre() + ">");
	  }

	  
}
