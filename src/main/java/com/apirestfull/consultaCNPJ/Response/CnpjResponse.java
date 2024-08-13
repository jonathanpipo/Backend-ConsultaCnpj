package com.apirestfull.consultaCNPJ.Response;

import java.time.LocalDateTime;

public class CnpjResponse {
    private String cnpjRaiz;
    private String razaoSocial;
    private String nomeFantasia;
    private String capitalSocial;
    private String naturezaJuridica;
    private String atividadePrincipal;
    private String telefone;
    private String email;
    

    public CnpjResponse() {
	}
    
	public CnpjResponse(String cnpjRaiz, 
			String razaoSocial, 
			String nomeFantasia, 
			String capitalSocial, 
			String naturezaJuridica, 
			String atividadePrincipal,
			String telefone, 
			String email) {
		super();
		this.cnpjRaiz = cnpjRaiz;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.capitalSocial = capitalSocial;
		this.naturezaJuridica = naturezaJuridica;
		this.atividadePrincipal = atividadePrincipal;
		this.telefone = telefone;
		this.email = email;
	}
	// Getters e Setters
    public String getCnpjRaiz() { return cnpjRaiz; }
    public void setCnpjRaiz(String cnpjRaiz) { this.cnpjRaiz = cnpjRaiz; }

    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }

    public String getNomeFantasia() { return nomeFantasia; }
    public void setNomeFantasia(String nomeFantasia) { this.nomeFantasia = nomeFantasia; }

    public String getCapitalSocial() { return capitalSocial; }
    public void setCapitalSocial(String capitalSocial) { this.capitalSocial = capitalSocial; }

    public String getNaturezaJuridica() { return naturezaJuridica; }
    public void setNaturezaJuridica(String naturezaJuridica) { this.naturezaJuridica = naturezaJuridica; }

    public String getAtividadePrincipal() { return atividadePrincipal; }
    public void setAtividadePrincipal(String atividadePrincipal) { this.atividadePrincipal = atividadePrincipal; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

	@Override
	public String toString() {
		return "CnpjResponse [cnpjRaiz=" + cnpjRaiz + ", razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia
				+ ", capitalSocial=" + capitalSocial + ", naturezaJuridica=" + naturezaJuridica
				+ ", atividadePrincipal=" + atividadePrincipal + ", telefone=" + telefone + ", email=" + email + "]";
	}
 
    
}

