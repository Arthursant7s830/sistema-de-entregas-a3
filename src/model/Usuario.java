package model;

import java.time.LocalDate;

// Classe abstrata que representa um usuário genérico (cliente ou restaurante)
public abstract class Usuario {

    // Atributos principais do usuário
    protected String id;
    protected String nome;
    protected String email;
    protected String senha;
    protected String telefone;
    protected String endereco;
    protected LocalDate dataCadastro;

    // Construtor usado para criar um novo usuário
    public Usuario(String id, String nome, String email, String senha, String telefone, String endereco,
            LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
    }

    // Métodos getters para acessar os atributos
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    // Método simples para validar login
    public boolean login(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    // Mostra o nome e o e-mail do usuário
    @Override
    public String toString() {
        return nome + " <" + email + ">";
    }
}
