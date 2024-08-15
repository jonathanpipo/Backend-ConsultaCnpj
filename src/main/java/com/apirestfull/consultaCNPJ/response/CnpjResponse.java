package com.apirestfull.consultaCNPJ.response;
//TODO If you can't refactor, delete
/*

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonPropertyOrder({ "cnpjRaiz", "razaoSocial", "capitalSocial", "porte", "naturezaJuridica", "socios", "simples", "estabelecimento" })
public class CnpjResponse {

    @JsonProperty("cnpj_raiz")
    private String cnpjRaiz;

    @JsonProperty("razao_social")
    private String razaoSocial;

    @JsonProperty("capital_social")
    private String capitalSocial;

    @JsonProperty("porte")
    private Porte porte;

    @JsonProperty("natureza_juridica")
    private NaturezaJuridica naturezaJuridica;

    @JsonProperty("socios")
    private List<Socio> socios;

    @JsonProperty("simples")
    private Simples simples;

    @JsonProperty("estabelecimento")
    private Estabelecimento estabelecimento;

    // Getters e Setters...

    @Override
    public String toString() {
        return "CnpjResponse{" +
                "cnpjRaiz='" + cnpjRaiz + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", capitalSocial='" + capitalSocial + '\'' +
                ", porte=" + porte +
                ", naturezaJuridica=" + naturezaJuridica +
                ", socios=" + socios +
                ", simples=" + simples +
                ", estabelecimento=" + estabelecimento +
                '}';
    }

    public String getCnpjRaiz() {
        return cnpjRaiz;
    }

    public void setCnpjRaiz(String cnpjRaiz) {
        this.cnpjRaiz = cnpjRaiz;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(String capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    public NaturezaJuridica getNaturezaJuridica() {
        return naturezaJuridica;
    }

    public void setNaturezaJuridica(NaturezaJuridica naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }

    public List<Socio> getSocios() {
        return socios;
    }

    public void setSocios(List<Socio> socios) {
        this.socios = socios;
    }

    public Simples getSimples() {
        return simples;
    }

    public void setSimples(Simples simples) {
        this.simples = simples;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }
}

// Classes adicionais

class Porte {
    @JsonProperty("id")
    private String id;

    @JsonProperty("descricao")
    private String descricao;

    // Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Porte{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

class NaturezaJuridica {
    @JsonProperty("id")
    private String id;

    @JsonProperty("descricao")
    private String descricao;

    // Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "NaturezaJuridica{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

class Socio {
    @JsonProperty("cpf_cnpj_socio")
    private String cpfCnpjSocio;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("data_entrada")
    private String dataEntrada;

    @JsonProperty("pais")
    private Pais pais;

    @JsonProperty("qualificacao_socio")
    private Qualificacao qualificacaoSocio;

    // Getters e Setters

    public String getCpfCnpjSocio() {
        return cpfCnpjSocio;
    }

    public void setCpfCnpjSocio(String cpfCnpjSocio) {
        this.cpfCnpjSocio = cpfCnpjSocio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Qualificacao getQualificacaoSocio() {
        return qualificacaoSocio;
    }

    public void setQualificacaoSocio(Qualificacao qualificacaoSocio) {
        this.qualificacaoSocio = qualificacaoSocio;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "cpfCnpjSocio='" + cpfCnpjSocio + '\'' +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", dataEntrada='" + dataEntrada + '\'' +
                ", pais=" + pais +
                ", qualificacaoSocio=" + qualificacaoSocio +
                '}';
    }
}

class Simples {
    @JsonProperty("simples")
    private String simples;

    @JsonProperty("data_opcao_simples")
    private String dataOpcaoSimples;

    @JsonProperty("data_exclusao_simples")
    private String dataExclusaoSimples;

    @JsonProperty("mei")
    private String mei;

    @JsonProperty("data_opcao_mei")
    private String dataOpcaoMei;

    @JsonProperty("data_exclusao_mei")
    private String dataExclusaoMei;


    // Getters e Setters

    public String getSimples() {
        return simples;
    }

    public void setSimples(String simples) {
        this.simples = simples;
    }

    public String getDataOpcaoSimples() {
        return dataOpcaoSimples;
    }

    public void setDataOpcaoSimples(String dataOpcaoSimples) {
        this.dataOpcaoSimples = dataOpcaoSimples;
    }

    public String getDataExclusaoSimples() {
        return dataExclusaoSimples;
    }

    public void setDataExclusaoSimples(String dataExclusaoSimples) {
        this.dataExclusaoSimples = dataExclusaoSimples;
    }

    public String getMei() {
        return mei;
    }

    public void setMei(String mei) {
        this.mei = mei;
    }

    public String getDataOpcaoMei() {
        return dataOpcaoMei;
    }

    public void setDataOpcaoMei(String dataOpcaoMei) {
        this.dataOpcaoMei = dataOpcaoMei;
    }

    public String getDataExclusaoMei() {
        return dataExclusaoMei;
    }

    public void setDataExclusaoMei(String dataExclusaoMei) {
        this.dataExclusaoMei = dataExclusaoMei;
    }

    @Override
    public String toString() {
        return "Simples{" +
                "simples='" + simples + '\'' +
                ", dataOpcaoSimples='" + dataOpcaoSimples + '\'' +
                ", dataExclusaoSimples='" + dataExclusaoSimples + '\'' +
                ", mei='" + mei + '\'' +
                ", dataOpcaoMei='" + dataOpcaoMei + '\'' +
                ", dataExclusaoMei='" + dataExclusaoMei + '\'' +
                '}';
    }
}

class Estabelecimento {
    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("nome_fantasia")
    private String nomeFantasia;

    @JsonProperty("situacao_cadastral")
    private String situacaoCadastral;

    @JsonProperty("data_situacao_cadastral")
    private String dataSituacaoCadastral;

    @JsonProperty("data_inicio_atividade")
    private String dataInicioAtividade;

    @JsonProperty("logradouro")
    private String logradouro;

    @JsonProperty("numero")
    private String numero;

    @JsonProperty("complemento")
    private String complemento;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("telefone_1")
    private String telefone1;

    @JsonProperty("email")
    private String email;

    @JsonProperty("atividade_principal")
    private AtividadePrincipal atividadePrincipal;

    // Getters e Setters

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setSituacaoCadastral(String situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    public String getDataSituacaoCadastral() {
        return dataSituacaoCadastral;
    }

    public void setDataSituacaoCadastral(String dataSituacaoCadastral) {
        this.dataSituacaoCadastral = dataSituacaoCadastral;
    }

    public String getDataInicioAtividade() {
        return dataInicioAtividade;
    }

    public void setDataInicioAtividade(String dataInicioAtividade) {
        this.dataInicioAtividade = dataInicioAtividade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AtividadePrincipal getAtividadePrincipal() {
        return atividadePrincipal;
    }

    public void setAtividadePrincipal(AtividadePrincipal atividadePrincipal) {
        this.atividadePrincipal = atividadePrincipal;
    }

    @Override
    public String toString() {
        return "Estabelecimento{" +
                "cnpj='" + cnpj + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", situacaoCadastral='" + situacaoCadastral + '\'' +
                ", dataSituacaoCadastral='" + dataSituacaoCadastral + '\'' +
                ", dataInicioAtividade='" + dataInicioAtividade + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", telefone1='" + telefone1 + '\'' +
                ", email='" + email + '\'' +
                ", atividadePrincipal=" + atividadePrincipal +
                '}';
    }
}

class AtividadePrincipal {
    @JsonProperty("id")
    private String id;

    @JsonProperty("descricao")
    private String descricao;

    // Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "AtividadePrincipal{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

class Pais {
    @JsonProperty("id")
    private String id;

    @JsonProperty("nome")
    private String nome;

    // Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}

class Qualificacao {
    @JsonProperty("id")
    private String id;

    @JsonProperty("descricao")
    private String descricao;

    // Getters e Setters

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Qualificacao{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
*/
