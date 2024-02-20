package com.exercicio.meusgastos.domain.service;

import java.util.List;

import com.exercicio.meusgastos.dto.usuario.UsuarioRequestDto;
import com.exercicio.meusgastos.dto.usuario.UsuarioResponseDto;

public class UsuarioService implements ICRUDService<UsuarioRequestDto, UsuarioResponseDto> {

    @Override
    public List<UsuarioResponseDto> obterTodos() {
        return null;
    }

    @Override
    public UsuarioResponseDto obterPorId(Long id) {
        return null;
    }

    @Override
    public UsuarioResponseDto cadastrar(UsuarioRequestDto dto) {
        return null;
    }

    @Override
    public UsuarioResponseDto atualizar(Long id, UsuarioRequestDto dto) {
        return null;
    }

    @Override
    public void deletar(Long id) {
    }

}
