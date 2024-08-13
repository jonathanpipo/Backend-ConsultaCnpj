package com.apirestfull.consultaCNPJ.Response;

import java.time.LocalDateTime;

public class CnpjResponse {
    private String cnpjRaiz;
    private String razaoSocial;
    private String nomeFantasia;
    private String capitalSocial;
    private LocalDateTime atualizadoEm;
    private String porte;
    private String naturezaJuridica;
    private String atividadePrincipal;
    private String telefone;
    private String email;

    // Getters e Setters
    public String getCnpjRaiz() { return cnpjRaiz; }
    public void setCnpjRaiz(String cnpjRaiz) { this.cnpjRaiz = cnpjRaiz; }

    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }

    public String getNomeFantasia() { return nomeFantasia; }
    public void setNomeFantasia(String nomeFantasia) { this.nomeFantasia = nomeFantasia; }

    public String getCapitalSocial() { return capitalSocial; }
    public void setCapitalSocial(String capitalSocial) { this.capitalSocial = capitalSocial; }

    public LocalDateTime getAtualizadoEm() { return atualizadoEm; }
    public void setAtualizadoEm(LocalDateTime atualizadoEm) { this.atualizadoEm = atualizadoEm; }

    public String getPorte() { return porte; }
    public void setPorte(String porte) { this.porte = porte; }

    public String getNaturezaJuridica() { return naturezaJuridica; }
    public void setNaturezaJuridica(String naturezaJuridica) { this.naturezaJuridica = naturezaJuridica; }

    public String getAtividadePrincipal() { return atividadePrincipal; }
    public void setAtividadePrincipal(String atividadePrincipal) { this.atividadePrincipal = atividadePrincipal; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

