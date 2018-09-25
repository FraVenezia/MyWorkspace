package it.html.tutorial.library.modelLoyalty;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

public class PromoCondizione {
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("id_promo_scaglione")
	private int idPromoScaglione;
	
	@Size(min = 1, max = 500, message = "DESCRIZIONE out of lenght (min len=1 / max len=500) ")
	@JsonProperty(value="descrizione")
	private String descrizione;
	
	@JsonProperty("id_modalita_di_pagamento")
	private int idModalitaDiPagamento;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("valore_condizione")
	private float valoreCondizione;
	
	@JsonProperty("id_variabile")
	private int idVariabile;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("qta_variabile")
	private float qtaVariabile;
	
	@Size(min = 1, max = 20, message = "MOMENTO_DI_VERIFICA out of lenght (min len=1 / max len=20) ")
	@JsonProperty(value="momento_di_verifica")
	private String momentoDiVerifica;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("spesa_minima")
	private float spesaMinima;
	
	@Size(min = 1, max = 16, message = "CONTINUITA out of lenght (min len=1 / max len=16) ")
	@JsonProperty(value="continuita")
	private String continuita;
	
	@Size(min = 1, max = 10, message = "ID_SETTORE out of lenght (min len=1 / max len=10) ")
	@JsonProperty(value="id_settore")
	private String idSettore;
	
	@Size(min = 1, max = 10, message = "ID_REPARTO out of lenght (min len=1 / max len=10) ")
	@JsonProperty(value="id_reparto")
	private String idReparto;
	
	@Size(min = 1, max = 10, message = "ID_GRUPPO_FAMIGLIA out of lenght (min len=1 / max len=10) ")
	@JsonProperty(value=".id_gruppo_famiglia")
	private String idGruppoFamiglia;
	
	@Size(min = 1, max = 10, message = "ID_FAMIGLIA out of lenght (min len=1 / max len=10) ")
	@JsonProperty(value="id_famiglia")
	private String idFamiglia;
	
	@Size(min = 1, max = 40, message = "UTENTE_INSERIMENTO out of lenght (min len=1 / max len=40) ")
	@JsonProperty("utente_inserimento")
	private String utenteInserimento;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("data_inserimento")
	private Date dataInserimento;
	
	@Size(min = 1, max = 40, message = "UTENTE_AGGIORNAMENTO out of lenght (min len=1 / max len=40) ")
	@JsonProperty("utente_aggiornamento")
	private String utenteAggiornamento;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("data_aggiornamento")
	private Date dataAggiornamento;
	
	@Size(min = 1, max = 50, message = "TIPO out of lenght (min len=1 / max len=50) ")
	@JsonProperty("tipo")
	private String tipo;
	
	@Size(min = 1, max = 4, message = "UNITA'_DI_MISURA out of lenght (min len=1 / max len=4) ")
	@JsonProperty("unit‡_di_misura")
	private String unit‡DiMisura;
	
	@Size(min = 1, max = 50, message = "APPLICA_TRIGGER out of lenght (min len=1 / max len=50) ")
	@JsonProperty("applica_trigger")
	private String applicaTrigger;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("valore_minimo")
	private float valoreMinimo;
	
	@JsonProperty("promo_paniere")
    private List<PromoPaniere> listPromoPaniere;
	
	@JsonProperty("promo_paniere_esclusione")
    private List<PromoPaniereEsclusione> listPromoPaniereEsclusione;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPromoScaglione() {
		return idPromoScaglione;
	}

	public void setIdPromoScaglione(int idPromoScaglione) {
		this.idPromoScaglione = idPromoScaglione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getIdModalitaDiPagamento() {
		return idModalitaDiPagamento;
	}

	public void setIdModalitaDiPagamento(int idModalitaDiPagamento) {
		this.idModalitaDiPagamento = idModalitaDiPagamento;
	}

	public float getValoreCondizione() {
		return valoreCondizione;
	}

	public void setValoreCondizione(float valoreCondizione) {
		this.valoreCondizione = valoreCondizione;
	}

	public int getIdVariabile() {
		return idVariabile;
	}

	public void setIdVariabile(int idVariabile) {
		this.idVariabile = idVariabile;
	}

	public float getQtaVariabile() {
		return qtaVariabile;
	}

	public void setQtaVariabile(float qtaVariabile) {
		this.qtaVariabile = qtaVariabile;
	}

	public String getMomentoDiVerifica() {
		return momentoDiVerifica;
	}

	public void setMomentoDiVerifica(String momentoDiVerifica) {
		this.momentoDiVerifica = momentoDiVerifica;
	}

	public float getSpesaMinima() {
		return spesaMinima;
	}

	public void setSpesaMinima(float spesaMinima) {
		this.spesaMinima = spesaMinima;
	}

	public String getContinuita() {
		return continuita;
	}

	public void setContinuita(String continuita) {
		this.continuita = continuita;
	}

	public String getIdSettore() {
		return idSettore;
	}

	public void setIdSettore(String idSettore) {
		this.idSettore = idSettore;
	}

	public String getIdReparto() {
		return idReparto;
	}

	public void setIdReparto(String idReparto) {
		this.idReparto = idReparto;
	}

	public String getIdGruppoFamiglia() {
		return idGruppoFamiglia;
	}

	public void setIdGruppoFamiglia(String idGruppoFamiglia) {
		this.idGruppoFamiglia = idGruppoFamiglia;
	}

	public String getIdFamiglia() {
		return idFamiglia;
	}

	public void setIdFamiglia(String idFamiglia) {
		this.idFamiglia = idFamiglia;
	}

	public String getUtenteInserimento() {
		return utenteInserimento;
	}

	public void setUtenteInserimento(String utenteInserimento) {
		this.utenteInserimento = utenteInserimento;
	}

	public Date getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public String getUtenteAggiornamento() {
		return utenteAggiornamento;
	}

	public void setUtenteAggiornamento(String utenteAggiornamento) {
		this.utenteAggiornamento = utenteAggiornamento;
	}

	public Date getDataAggiornamento() {
		return dataAggiornamento;
	}

	public void setDataAggiornamento(Date dataAggiornamento) {
		this.dataAggiornamento = dataAggiornamento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUnit‡DiMisura() {
		return unit‡DiMisura;
	}

	public void setUnit‡DiMisura(String unit‡DiMisura) {
		this.unit‡DiMisura = unit‡DiMisura;
	}

	public String getApplicaTrigger() {
		return applicaTrigger;
	}

	public void setApplicaTrigger(String applicaTrigger) {
		this.applicaTrigger = applicaTrigger;
	}

	public float getValoreMinimo() {
		return valoreMinimo;
	}

	public void setValoreMinimo(float valoreMinimo) {
		this.valoreMinimo = valoreMinimo;
	}

	public List<PromoPaniere> getListPromoPaniere() {
		return listPromoPaniere;
	}

	public void setListPromoPaniere(List<PromoPaniere> listPromoPaniere) {
		this.listPromoPaniere = listPromoPaniere;
	}

	public List<PromoPaniereEsclusione> getListPromoPaniereEsclusione() {
		return listPromoPaniereEsclusione;
	}

	public void setListPromoPaniereEsclusione(List<PromoPaniereEsclusione> listPromoPaniereEsclusione) {
		this.listPromoPaniereEsclusione = listPromoPaniereEsclusione;
	}

	@Override
	public String toString() {
		return "PromoCondizione [id=" + id + ", idPromoScaglione=" + idPromoScaglione + ", descrizione=" + descrizione
				+ ", idModalitaDiPagamento=" + idModalitaDiPagamento + ", valoreCondizione=" + valoreCondizione
				+ ", idVariabile=" + idVariabile + ", qtaVariabile=" + qtaVariabile + ", momentoDiVerifica="
				+ momentoDiVerifica + ", spesaMinima=" + spesaMinima + ", continuita=" + continuita + ", idSettore="
				+ idSettore + ", idReparto=" + idReparto + ", idGruppoFamiglia=" + idGruppoFamiglia + ", idFamiglia="
				+ idFamiglia + ", utenteInserimento=" + utenteInserimento + ", dataInserimento=" + dataInserimento
				+ ", utenteAggiornamento=" + utenteAggiornamento + ", dataAggiornamento=" + dataAggiornamento
				+ ", tipo=" + tipo + ", unit‡DiMisura=" + unit‡DiMisura + ", applicaTrigger=" + applicaTrigger
				+ ", valoreMinimo=" + valoreMinimo + ", listPromoPaniere=" + listPromoPaniere
				+ ", listPromoPaniereEsclusione=" + listPromoPaniereEsclusione + "]";
	}
	
}
