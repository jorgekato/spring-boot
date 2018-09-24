/**
 * 
 */
package br.com.jkato.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.jkato.conf.model.Convidado;
import br.com.jkato.conf.repository.ConvidadoRepository;
       
/**
 * DOCUMENTAÇÃO DA CLASSE <br>
 * ---------------------- <br>
 * FINALIDADE: <br>
 * Classe controladora para convidados <br>
 * HISTÓRICO DE DESENVOLVIMENTO: <br>
 * 21 de set de 2018 - @author jorge - Primeira versão da classe. <br>
 * <br>
 * <br>
 * LISTA DE CLASSES INTERNAS: <br>
 */

@Controller
public class ConvidadoController {
    

    @Autowired
    private ConvidadoRepository repository;

    /**
     * 
     * Método que mapeia a url / para index.html
     * 
     * @return
     */
    @RequestMapping ( "/" )
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView( "index" );
        return modelAndView;
    }

    /**
     * Método que retorna a lista de convidados.
     */
    @RequestMapping ( "listaconvidados" )
    public ModelAndView listaconvidados () {
        Iterable < Convidado > convidados = repository.findAll();
        
        ModelAndView modelAndView = new ModelAndView( "listaconvidados" );
        modelAndView.addObject( "convidados" , convidados );
        
        return modelAndView;
    }
    
    /**
     * 
     * Método que cadastra um novo convidado.
     * @param nome
     * @param email
     * @param telefone
     * @return
     */
    @RequestMapping ( value = "salvar" , method = RequestMethod.POST )
    public ModelAndView salvar ( @RequestParam ( "nome" ) String nome , @RequestParam ( "email" ) String email , @RequestParam ( "telefone" ) String telefone ) {

        Convidado novoConvidado = new Convidado( nome , email , telefone );
        repository.save( novoConvidado );

        ModelAndView modelAndView = new ModelAndView( "listaconvidados" );
        Iterable < Convidado > convidados = repository.findAll();
        modelAndView.addObject( "convidados" , convidados );

        return modelAndView;
    }

}
