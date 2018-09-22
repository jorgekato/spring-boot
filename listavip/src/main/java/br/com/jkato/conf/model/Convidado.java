/**
 * 
 */
package br.com.jkato.conf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * DOCUMENTAÇÃO DA CLASSE <br>
 * ---------------------- <br>
 * FINALIDADE: <br>
 * Classe de domínio convidado. <br>
 * <br>
 * HISTÓRICO DE DESENVOLVIMENTO: <br>
 * 21 de set de 2018 - @author jorge - Primeira versão da classe. <br>
 * <br>
 * <br>
 * LISTA DE CLASSES INTERNAS: <br>
 */
@Entity ( name = "convidado" )
public class Convidado {
    
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    
    /**
     * Método de recuperação do campo id
     *
     * @return valor do campo id
     */
    public Long getId () {
        return id;
    }
    /**
     * Valor de id atribuído a id
     *
     * @param id Atributo da Classe
     */
    public void setId ( Long id ) {
        this.id = id;
    }
    /**
     * Método de recuperação do campo nome
     *
     * @return valor do campo nome
     */
    public String getNome () {
        return nome;
    }
    /**
     * Valor de nome atribuído a nome
     *
     * @param nome Atributo da Classe
     */
    public void setNome ( String nome ) {
        this.nome = nome;
    }
    /**
     * Método de recuperação do campo email
     *
     * @return valor do campo email
     */
    public String getEmail () {
        return email;
    }
    /**
     * Valor de email atribuído a email
     *
     * @param email Atributo da Classe
     */
    public void setEmail ( String email ) {
        this.email = email;
    }
    /**
     * Método de recuperação do campo telefone
     *
     * @return valor do campo telefone
     */
    public String getTelefone () {
        return telefone;
    }
    /**
     * Valor de telefone atribuído a telefone
     *
     * @param telefone Atributo da Classe
     */
    public void setTelefone ( String telefone ) {
        this.telefone = telefone;
    }
    
    
    

}
