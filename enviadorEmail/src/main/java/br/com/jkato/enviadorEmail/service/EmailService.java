/**
 * 
 */
package br.com.jkato.enviadorEmail.service;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

/** 
 * DOCUMENTAÇÃO DA CLASSE <br>
 * ---------------------- <br>
 * FINALIDADE: <br>
 * Classe responsável pelo serviço de envio de email.
 * @Service - 
 * <br>
 * HISTÓRICO DE DESENVOLVIMENTO: <br>
 * 24 de set de 2018 - @author jorge - Primeira versão da classe. <br>
 *<br>
 *<br>
 * LISTA DE CLASSES INTERNAS: <br>
 */
@Service
public class EmailService {

    private static final int PORT = 465;
    private static final String HOST_NAME= "smtp.googlemail.com";
    private static final String USER_MAIL = "jkato2012@gmail.com";
    private static final String PASSWORD = "";//inserir a senha da conta.
    private static final String FROM = "jkato2012@gmail.com";//utilizar o email corporativo.
    private static final String SUBJECT = "Convite Lista Vip!(NÃO RESPONDER)";

    
    /**
     * 
     * Método que realiza o envio do email para o convidado.
     * @param nome
     * @param emailConvidado
     */
    public void sendMail(String nome, String emailConvidado) {
        try {
        Email email = new SimpleEmail();
        email.setHostName( HOST_NAME );
        email.setSmtpPort( PORT );
        email.setAuthenticator( new DefaultAuthenticator( USER_MAIL , PASSWORD ) );
        email.setSSLOnConnect( true );
        
        email.setFrom( FROM );
        email.setSubject( SUBJECT );
        email.setMsg( "Olá "+ nome + "! Você foi convidado pelo Lista Vip." );
        email.addTo( emailConvidado );
        
        email.send();
        
        } catch ( EmailException e ) {
            e.printStackTrace();
        }
        
    }
}
