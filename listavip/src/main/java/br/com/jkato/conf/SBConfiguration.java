/**
 * 
 */
package br.com.jkato.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
@Controller
public class SBConfiguration {

    /** 
     * Método principal de inicialização da aplicação.
     * @param args
     */
    public static void main ( String[] args ) {

        SpringApplication.run( SBConfiguration.class , args );
    }
    
    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

}
