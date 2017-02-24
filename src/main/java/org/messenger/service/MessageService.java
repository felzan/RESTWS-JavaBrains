package org.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages() {
		
		Message m1 = new Message(1, "hola mundo", "me");
		Message m2 = new Message(2, "adios", "others");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		
		return list;
	}

}
