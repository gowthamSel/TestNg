package org.Authentication.java;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class WhatsAppTest{
//	public static final String AUTH_TOKEN = "my_token";
//	public static final String ACCOUNT_SID = "my_acc_SID";
	
	public static final String ACCOUNT_SID = "ACd82c70e2edfd0e5ea42c2f689a3a88dd ";
	public static final String AUTH_TOKEN ="419e69b72097aeb5f4134d02ba2ba87e";
	
	public static void main(String[] args) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message message = Message.creator(
				new com.twilio.type.PhoneNumber("+918374001467"),
				new com.twilio.type.PhoneNumber("+12482137642"),
				"Hello from your friendly neighborhood Java application!")
				.create();

		System.out.print(message.getDateSent().toString());
	}
}

