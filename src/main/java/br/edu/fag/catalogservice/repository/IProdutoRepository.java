package br.edu.fag.catalogservice.repository;

import br.edu.fag.catalogservice.service.domain.ProdutoDomain;
import br.edu.fag.catalogservice.repository.entity.ProdutoEntity;

public interface IProdutoRepository {

    public ProdutoDomain criar(ProdutoEntity produtoEntity);
}
