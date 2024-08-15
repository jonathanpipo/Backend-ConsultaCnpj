package com.apirestfull.consultaCNPJ.dto;

import com.apirestfull.consultaCNPJ.model.*;

import java.util.ArrayList;

//TODO Fix: Null returns in json
public record CnpjDTO( String cnpj_raiz,
                       String razao_social,
                       String capital_social,
                       Porte porte,
                       NaturezaJuridica natureza_juridica,
                       ArrayList<Socio> socios,
                       Simples simples,
                       Estabelecimento estabelecimento) {
}
