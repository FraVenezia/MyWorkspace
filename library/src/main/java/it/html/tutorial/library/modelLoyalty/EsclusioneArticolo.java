package it.html.tutorial.library.modelLoyalty;

import java.util.Date;

import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

public class EsclusioneArticolo {
	
	@JsonProperty("id_promo_offerta")
	private int idPromoOfferta;
	
	@Size(min = 1, max = 7, message = "ID_ARTICOLO out of lenght (min len=1 / max len=7) ")
	@JsonProperty(value="id_articolo")
	private String idArticolo;

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

	public int getIdPromoOfferta() {
		return idPromoOfferta;
	}

	public void setIdPromoOfferta(int idPromoOfferta) {
		this.idPromoOfferta = idPromoOfferta;
	}

	public String getIdArticolo() {
		return idArticolo;
	}

	public void setIdArticolo(String idArticolo) {
		this.idArticolo = idArticolo;
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
		return "EsclusioneArticolo [idPromoOfferta=" + idPromoOfferta + ", idArticolo=" + idArticolo
				+ ", utenteInserimento=" + utenteInserimento + ", dataInserimento=" + dataInserimento
				+ ", utenteAggiornamento=" + utenteAggiornamento + ", dataAggiornamento=" + dataAggiornamento + "]";
	}
	
}
