package com.flightbooking.UserRegistration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.flightbooking.UserRegistration.dao.RegistrationRepository;

@Service
public class EmailServiceImpl implements EmailService {
	
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	
	

	@Override
	public void sendSimpleMessage(String phoneNo,String toMail, String subject, String text) {
		
		
		SimpleMailMessage mailMessage= new SimpleMailMessage();
		
		mailMessage.setTo(toMail);
		mailMessage.setSubject(subject);
		mailMessage.setText(text);
		
		javaMailSender.send(mailMessage);
		
	}

}
