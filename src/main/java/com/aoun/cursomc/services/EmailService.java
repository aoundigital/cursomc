package com.aoun.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.aoun.cursomc.domain.Cliente;
import com.aoun.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}