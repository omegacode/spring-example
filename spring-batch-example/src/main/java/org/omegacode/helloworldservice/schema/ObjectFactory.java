
package org.omegacode.helloworldservice.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.omegacode.helloworldservice.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Erro_QNAME = new QName("http://helloworldservice.omegacode.org/schema/", "Erro");
    private final static QName _NumeroCartao_QNAME = new QName("http://helloworldservice.omegacode.org/schema/", "NumeroCartao");
    private final static QName _Mensagem_QNAME = new QName("http://helloworldservice.omegacode.org/schema/", "Mensagem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.omegacode.helloworldservice.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Mensagem }
     * 
     */
    public Mensagem createMensagem() {
        return new Mensagem();
    }

    /**
     * Create an instance of {@link NumeroCartao }
     * 
     */
    public NumeroCartao createNumeroCartao() {
        return new NumeroCartao();
    }

    /**
     * Create an instance of {@link Erro }
     * 
     */
    public Erro createErro() {
        return new Erro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Erro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://helloworldservice.omegacode.org/schema/", name = "Erro")
    public JAXBElement<Erro> createErro(Erro value) {
        return new JAXBElement<Erro>(_Erro_QNAME, Erro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumeroCartao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://helloworldservice.omegacode.org/schema/", name = "NumeroCartao")
    public JAXBElement<NumeroCartao> createNumeroCartao(NumeroCartao value) {
        return new JAXBElement<NumeroCartao>(_NumeroCartao_QNAME, NumeroCartao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mensagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://helloworldservice.omegacode.org/schema/", name = "Mensagem")
    public JAXBElement<Mensagem> createMensagem(Mensagem value) {
        return new JAXBElement<Mensagem>(_Mensagem_QNAME, Mensagem.class, null, value);
    }

}
