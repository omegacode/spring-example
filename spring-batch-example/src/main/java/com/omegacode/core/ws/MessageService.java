package com.omegacode.core.ws;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.omegacode.helloworldservice.schema.Mensagem;
import org.omegacode.helloworldservice.schema.NumeroCartao;
import org.omegacode.helloworldservice.wsdl.DigaOlaPortType;
import org.omegacode.helloworldservice.wsdl.StatusException;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.omegacode.core.CacheService;
import com.omegacode.core.model.Pagamento;

@javax.jws.WebService(serviceName = "HelloWorldService", portName = "HelloWorldService_Port", targetNamespace = "http://helloworldservice.omegacode.org/wsdl/", endpointInterface = "org.omegacode.helloworldservice.wsdl.DigaOlaPortType")
public class MessageService extends CacheService implements DigaOlaPortType {

	private Logger log = Logger.getLogger(MessageService.class.getName());
	
	@Override
	public Mensagem message(NumeroCartao parametro) throws StatusException {

		log.log(Level.INFO, "INICIANDO A BUSCA DO STATUS DO CARTAO");
		
		Mensagem mensagem = new Mensagem();

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"app-config.xml");

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("myJob");

		try {

			JobExecution execution = jobLauncher.run(job, new JobParameters());
			
			Pagamento pagamento = getCache(Integer.parseInt(parametro.getConteudo()));

			if (pagamento == null) {
				mensagem.setConteudo("NAO EXISTE ESTE NUMERO DE CARTAO!");
			} else {
				mensagem.setConteudo(pagamento.getStatus().replace(";", " "));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mensagem;
	}
}
