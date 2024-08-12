package com.apirestfull.response;

public record InscricaoEstadual(
	    String inscricaoEstadual,
	    boolean ativo,
	    String atualizadoEm,
	    Estado estado
	) {
	}
