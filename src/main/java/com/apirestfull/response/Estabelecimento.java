package com.apirestfull.response;

import java.util.List;

public record Estabelecimento(
    String cnpj,
    List<Atividade> atividadesSecundarias,
    String cnpjRaiz,
    String cnpjOrdem,
    String cnpjDigitoVerificador,
    String tipo,
    String nomeFantasia,
    String situacaoCadastral,
    String dataSituacaoCadastral,
    String dataInicioAtividade,
    String nomeCidadeExterior,
    String tipoLogradouro,
    String logradouro,
    String numero,
    String complemento,
    String bairro,
    String cep,
    String ddd1,
    String telefone1,
    String ddd2,
    String telefone2,
    String dddFax,
    String fax,
    String email,
    String situacaoEspecial,
    String dataSituacaoEspecial,
    String atualizadoEm,
    Atividade atividadePrincipal,
    Pais pais,
    Estado estado,
    Cidade cidade,
    String motivoSituacaoCadastral,
    List<InscricaoEstadual> inscricoesEstaduais
) {
}

