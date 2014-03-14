package com.omegacode.test;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.ws.Endpoint;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omegacode.helloworldservice.schema.Mensagem;
import org.omegacode.helloworldservice.schema.NumeroCartao;
import org.omegacode.helloworldservice.wsdl.DigaOlaPortType;
import org.omegacode.helloworldservice.wsdl.HelloWorldService;
import org.omegacode.helloworldservice.wsdl.StatusException;

import com.omegacode.core.ws.MessageService;

public class ConsultaPagamentoAprovadoTest {
	
	private Logger log = Logger.getLogger(ConsultaPagamentoAprovadoTest.class.getName());
	
	private MessageService service;
	private String url;
	private String numeroCartao;
	
	@Before
	public void init() {
		this.service = new MessageService();
		url = "http://localhost:9292/HelloWorldService";
		numeroCartao = "11223344";
	}	
	
	@Test
	public void consultarTest() throws Exception {
		
		log.log(Level.INFO ,"INICIANDO O TESTE CONSULTAR PAGAMENTO APROVADO!");
		
		Endpoint.publish(url, service);
		HelloWorldService ss = new HelloWorldService(new URL(url));
		
		DigaOlaPortType port = ss.getHelloWorldServicePort();
		NumeroCartao numero = new NumeroCartao();
		
		try {
			numero.setConteudo(numeroCartao);
			Mensagem mensagem = port.message(numero);
			log.log(Level.INFO, "STATUS: " + mensagem.getConteudo());
		} catch (StatusException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		log.log(Level.INFO ,"FIM DO TESTE CONSULTAR PAGAMENTO APROVADO!");
	}
	
	@After
	public void end() {
		this.service = null;
		url = null;
	}
}
