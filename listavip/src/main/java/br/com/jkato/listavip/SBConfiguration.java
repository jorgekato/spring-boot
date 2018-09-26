/**
 * 
 */
package br.com.jkato.listavip;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/** 
 * DOCUMENTAÇÃO DA CLASSE <br>
 * ---------------------- <br>
 * FINALIDADE: <br>
 * Classe de configuração do spring boot para inicializar a aplicação. 
 * <br>
 * HISTÓRICO DE DESENVOLVIMENTO: <br>
 * 20 de set de 2018 - @author jorge - Primeira versão da classe. <br>
 *<br>
 *<br>
 * LISTA DE CLASSES INTERNAS: <br>
 */

@SpringBootApplication
public class SBConfiguration {

    /** 
     * Método principal de inicialização da aplicação.
     * @param args
     */
    public static void main ( String[] args ) {

        SpringApplication.run( SBConfiguration.class , args );
    }
    
}
