
package org.omegacode.helloworldservice.wsdl;

import javax.xml.bind.annotation.XmlRegistry;

import org.omegacode.helloworldservice.schema.Mensagem;
import org.omegacode.helloworldservice.schema.NumeroCartao;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.omegacode.helloworldservice.wsdl package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.omegacode.helloworldservice.wsdl
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

}
