package com.apirestfull.response;

import java.util.List;

public record Usuario(
    String cnpjRaiz,
    String razaoSocial,
    String capitalSocial,
    String responsavelFederativo,
    String atualizadoEm,
    Porte porte,
    NaturezaJuridica naturezaJuridica,
    QualificacaoResponsavel qualificacaoDoResponsavel,
    List<Socio> socios,
    Simples simples,
    Estabelecimento estabelecimento
) {
}

