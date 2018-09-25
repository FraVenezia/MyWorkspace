package it.html.tutorial.library.modelLoyalty;

import java.util.Date;

import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

public class ApplicazioneMerceologica {
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("id_promo_offerta")
	private int idPromoOfferta;
	
	@Size(min = 1, max = 10, message = "ID_SETTORE out of lenght (min len=1 / max len=10) ")
	@JsonProperty(value="id_settore")
	private String idSettore;
	
	@Size(min = 1, max = 10, message = "ID_REPARTO out of lenght (min len=1 / max len=10) ")
	@JsonProperty(value="id_reparto")
	private String idReparto;

	@Size(min = 1, max = 10, message = "ID_GRUPPO_FAMIGLIA out of lenght (min len=1 / max len=10) ")
	@JsonProperty(value="id_gruppo_famiglia")
	private String idGruppoFamiglia;
	
	@Size(min = 1, max = 10, message = "ID_FAMIGLIA out of lenght (min len=1 / max len=10) ")
	@JsonProperty(value="id_famiglia")
	private String idFamiglia;
	
	@Size(min = 1, max = 15, message = "ID_SOTTOFAMIGLIA out of lenght (min len=1 / max len=15) ")
	@JsonProperty(value="id_sottofamiglia")
	private String idSottoFamiglia;
	
	@JsonProperty("concorre_per_offerta")
	private int concorrePerOfferta;
	
	@JsonProperty("concorre_per_ventilazione")
	private int concorrePerVentilazione;
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPromoOfferta() {
		return idPromoOfferta;
	}

	public void setIdPromoOfferta(int idPromoOfferta) {
		this.idPromoOfferta = idPromoOfferta;
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

	public String getIdSottoFamiglia() {
		return idSottoFamiglia;
	}

	public void setIdSottoFamiglia(String idSottoFamiglia) {
		this.idSottoFamiglia = idSottoFamiglia;
	}

	public int getConcorrePerOfferta() {
		return concorrePerOfferta;
	}

	public void setConcorrePerOfferta(int concorrePerOfferta) {
		this.concorrePerOfferta = concorrePerOfferta;
	}

	public int getConcorrePerVentilazione() {
		return concorrePerVentilazione;
	}

	public void setConcorrePerVentilazione(int concorrePerVentilazione) {
		this.concorrePerVentilazione = concorrePerVentilazione;
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

	@Override
	public String toString() {
		return "ApplicazioneMerceologica [id=" + id + ", idPromoOfferta=" + idPromoOfferta + ", idSettore=" + idSettore
				+ ", idReparto=" + idReparto + ", idGruppoFamiglia=" + idGruppoFamiglia + ", idFamiglia=" + idFamiglia
				+ ", idSottoFamiglia=" + idSottoFamiglia + ", concorrePerOfferta=" + concorrePerOfferta
				+ ", concorrePerVentilazione=" + concorrePerVentilazione + ", utenteInserimento=" + utenteInserimento
				+ ", dataInserimento=" + dataInserimento + ", utenteAggiornamento=" + utenteAggiornamento
				+ ", dataAggiornamento=" + dataAggiornamento + "]";
	}
	
}
