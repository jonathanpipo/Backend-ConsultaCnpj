package com.apirestful.consultacnpj.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

//TODO Fix: Null returns in json
public record CnpjDTO(@JsonProperty("cnpj_raiz") String cnpjRaiz,
                      @JsonProperty("razao_social")String razaoSocial,
                      @JsonProperty("capital_social")String capitalSocial) {
}
