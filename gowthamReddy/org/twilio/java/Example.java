//package org.twilio.java;
//
//import java.util.stream.Stream;
//import java.util.stream.StreamSupport;
//
//import com.twilio.Twilio;
//import com.twilio.base.ResourceSet;
//import com.twilio.rest.api.v2010.account.Message;
////import com.twilio.twiml.voice.Stream;
//
//public class Example {
//	// Find your Account SID and Auth Token at twilio.com/console
//	// and set the environment variables. See http://twil.io/secure
//	public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
//	public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
//
//	public static void main(String[] args) {
//		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//		Message message = Message.creator(
//				new com.twilio.type.PhoneNumber("+14159352345"),
//				new com.twilio.type.PhoneNumber("+14158141829"),
//				"Where's Wallace?")
//				.create();
//
//		System.out.println(message.getSid());
//	}
//
//	public static String getMessage() {
//		return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND)==0)
//				.filter(m -> m.getTo().equals("+12482137642")).map(Message::getBody).findFirst()
//				.orElseThrow(IllegalStateException :: new);
//	}
//
//	private static Stream<Message> getMessages() {
//		ResourceSet<Message> message=Message.reader(ACCOUNT_SID).read();
//		return StreamSupport.stream(message.spliterator(),false);
//	}
//	
//	
//}
//
//
