/**
 * 
 */
package br.com.jkato.conf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    
    /** 
     * Construtor padrão da classe
     */
    public Convidado () { }
    
    
    /** 
     * Construtor alternativo da classe
     * @param nome
     * @param email
     * @param telefone
     */
    public Convidado ( String nome , String email , String telefone ) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }


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


    /** 
     * TODO Descrição do Método
     * @return
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( email == null ) ? 0 : email.hashCode() );
        result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
        result = prime * result + ( ( nome == null ) ? 0 : nome.hashCode() );
        result = prime * result + ( ( telefone == null ) ? 0 : telefone.hashCode() );
        return result;
    }


    /** 
     * TODO Descrição do Método
     * @param obj
     * @return
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals ( Object obj ) {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        Convidado other = ( Convidado ) obj;
        if ( email == null ) {
            if ( other.email != null )
                return false;
        } else if ( ! email.equals( other.email ) )
            return false;
        if ( id == null ) {
            if ( other.id != null )
                return false;
        } else if ( ! id.equals( other.id ) )
            return false;
        if ( nome == null ) {
            if ( other.nome != null )
                return false;
        } else if ( ! nome.equals( other.nome ) )
            return false;
        if ( telefone == null ) {
            if ( other.telefone != null )
                return false;
        } else if ( ! telefone.equals( other.telefone ) )
            return false;
        return true;
    }


    /** 
     * TODO Descrição do Método
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString () {
        return "Convidado [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
    }
    
    
    

}
