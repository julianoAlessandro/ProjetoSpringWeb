package com.educaweb.olamundo.entidades;

import java.io.Serializable;

public class Usuarios implements Serializable {
    private static final long serialVersiouUID = 1L;
    private long id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;

    public Usuarios() {

    }

    public Usuarios(long id, String nome, String email, String telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Usuarios usuarios = (Usuarios) o;
        return id == usuarios.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}
