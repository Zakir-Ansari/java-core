package com.zakir.smtp.example;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailUtil {
	public static void sendMail(String recepient) {
		System.out.println("Preparing email..");
		Properties props = new Properties(); 
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
        //props.put("mail.smtp.host", "smtp.gmail.com");
        //props.put("mail.smtp.port", "465");
        
        
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");    
        
        String myGmailAccount = "xxxxxxxx@gmail.com";
        String password = "xxxxxxxx";
        
        Session session = Session.getInstance(props, new Authenticator() {
        	protected PasswordAuthentication getPasswordAuthentication() {
        		return new PasswordAuthentication(myGmailAccount, password);
        	}
		});
        
        Message message = prepareMessage(session, myGmailAccount, recepient);
        try {
			Transport.send(message);
			System.out.println("Message Sent Successfully to "+recepient);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

	private static Message prepareMessage(Session session, String userAccount, String recepient) {
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(userAccount));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
			message.setSubject("Test");
			message.setText("Hi There, \n\nMessage Received Successfully.. Yippieee...");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
		
		return message;
	}
}
