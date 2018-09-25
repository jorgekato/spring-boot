/**
 * 
 */
package br.com.jkato.listavip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jkato.listavip.model.Convidado;
import br.com.jkato.listavip.repository.ConvidadoRepository;

/** 
 * DOCUMENTAÇÃO DA CLASSE <br>
 * ---------------------- <br>
 * FINALIDADE: <br>
 * Classe de serviços para convidado.
 * <br>
 * HISTÓRICO DE DESENVOLVIMENTO: <br>
 * 24 de set de 2018 - @author jorge - Primeira versão da classe. <br>
 *<br>
 *<br>
 * LISTA DE CLASSES INTERNAS: <br>
 */
@Service
public class ConvidadoService {

    @Autowired
    private ConvidadoRepository repository;
    
    /**
     * 
     * Método que busca todos os convidados.
     * @return
     */
    public Iterable < Convidado > findAll(){
        Iterable < Convidado > convidados = repository.findAll();
        
        return convidados;
    }
    
    /**
     * 
     * Método que salva o convidado no banco.
     * @param convidado
     */
    public void save(Convidado convidado) {
        repository.save( convidado );
    }
}
