package it.html.tutorial.library.modelLoyalty;

import java.util.Date;

import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

public class PromoOffertaPdv {

	@JsonProperty("id_promo_offerta")
	private int idPromoOfferta;
	
	@Size(min = 1, max = 10, message = "ID_FORMATO out of lenght (min len=1 / max len=10) ")
	@JsonProperty(value="id_formato")
	private String idFormato;

	@Size(min = 1, max = 40, message = "UTENTE_INSERIMENTO out of lenght (min len=1 / max len=40) ")
	@JsonProperty(value="utente_inserimento")
	private String utenteInserimento;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("data_inserimento")
	private Date dataInserimento;
	
	@Size(min = 1, max = 40, message = "UTENTE_AGGIORNAMENTO out of lenght (min len=1 / max len=40) ")
	@JsonProperty(value="utente_aggiornamento")
	private String utenteAggiornamento;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("data_aggiornamento")
	private Date dataAggiornamento;
	
	@Size(min = 1, max = 10, message = "ID_PDV out of lenght (min len=1 / max len=10) ")
	@JsonProperty(value="id_pdv")
	private String idPdv;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("data_inizio")
	private Date dataInizio;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("data_fine")
	private Date dataFine;
	
	@JsonProperty("sospeso")
	private int sospeso;
	
	@Size(min = 1, max = 10, message = "CODICE_REMA out of lenght (min len=1 / max len=10) ")
	@JsonProperty(value="codice_rema")
	private String codiceRema;

	public int getIdPromoOfferta() {
		return idPromoOfferta;
	}

	public void setIdPromoOfferta(int idPromoOfferta) {
		this.idPromoOfferta = idPromoOfferta;
	}

	public String getIdFormato() {
		return idFormato;
	}

	public void setIdFormato(String idFormato) {
		this.idFormato = idFormato;
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

	public String getIdPdv() {
		return idPdv;
	}

	public void setIdPdv(String idPdv) {
		this.idPdv = idPdv;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public int getSospeso() {
		return sospeso;
	}

	public void setSospeso(int sospeso) {
		this.sospeso = sospeso;
	}

	public String getCodiceRema() {
		return codiceRema;
	}

	public void setCodiceRema(String codiceRema) {
		this.codiceRema = codiceRema;
	}

	@Override
	public String toString() {
		return "PromoOffertaPdv [idPromoOfferta=" + idPromoOfferta + ", idFormato=" + idFormato + ", utenteInserimento="
				+ utenteInserimento + ", dataInserimento=" + dataInserimento + ", utenteAggiornamento="
				+ utenteAggiornamento + ", dataAggiornamento=" + dataAggiornamento + ", idPdv=" + idPdv
				+ ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + ", sospeso=" + sospeso + ", codiceRema="
				+ codiceRema + "]";
	}
	
}
