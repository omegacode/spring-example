package com.omegacode.core.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pagamento")
public class Pagamento {

	private int numeroCartao;
	private String nomeCliente;
	private String status;
	
	public Pagamento() {
		super();
	}

	@XmlAttribute(name="numeroCartao")
	public int getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
	@XmlElement(name = "nomeCliente")
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	@XmlElement(name = "status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pagamento [numeroCartao=" + numeroCartao + ", nomeCliente="
				+ nomeCliente + ", status=" + status + "]";
	}
}