/**
 * 
 */
package br.com.jkato.listavip.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.jkato.listavip.model.Convidado;

/** 
 * DOCUMENTAÇÃO DA CLASSE <br>
 * ---------------------- <br>
 * FINALIDADE: <br>
 * Interface que contém os métodos para persistência dos dados.
 * <br>
 * HISTÓRICO DE DESENVOLVIMENTO: <br>
 * 21 de set de 2018 - @author jorge - Primeira versão da classe. <br>
 *<br>
 *<br>
 * LISTA DE CLASSES INTERNAS: <br>
 */

public interface ConvidadoRepository extends CrudRepository < Convidado , Long > {

}
