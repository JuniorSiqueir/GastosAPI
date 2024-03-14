package com.exercicio.meusgastos.dto.usuario;

import java.sql.Date;

public class UsuarioResponseDto {
    
    private Long id;

    private String nome;

    private String email;

    private String foto;

    private Date dataInativacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getDataInaticacao() {
        return dataInativacao;
    }

    public void setDataInaticacao(Date dataInaticacao) {
        this.dataInativacao = dataInaticacao;
    }

}
