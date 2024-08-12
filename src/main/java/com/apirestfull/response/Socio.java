package com.apirestfull.response;

import java.util.Optional;

public record Socio(
    String cpfCnpjSocio,
    String nome,
    String tipo,
    String dataEntrada,
    String cpfRepresentanteLegal,
    Optional<String> nomeRepresentante,
    String faixaEtaria,
    String atualizadoEm,
    String paisId,
    Qualificacao qualificacaoSocio,
    Optional<String> qualificacaoRepresentante,
    Pais pais
) {
}

