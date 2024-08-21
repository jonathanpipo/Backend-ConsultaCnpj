package com.apirestfull.consultaCNPJ.model;

import java.util.ArrayList;

public class Root {
    public String cnpj_raiz;
    public String razao_social;
    public String capital_social;
    public Porte porte;
    public NaturezaJuridica natureza_juridica;
    public ArrayList<Socio> socios;
    public Simples simples;
    public Estabelecimento estabelecimento;
}
