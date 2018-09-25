package it.html.tutorial.library.modelLoyalty;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PromoTestata {

	@Size(min = 1, max = 25, message = "ID out of lenght (min len=1 / max len=25) ")
	@NotNull
	@JsonProperty(value="id")
	private String id;
	
	@Size(min = 1, max = 10, message = "CODICE_PROMO out of lenght (min len=1 / max len=10) ")
	@JsonProperty("codice_promo")
	private String codicePromo;
	
	@Size(min = 1, max = 6, message = "ID_SOCIETA out of lenght (min len=1 / max len=6) ")
	@JsonProperty("id_societa")
	private String idSocieta;
	
	@Size(min = 1, max = 40, message = "PROMO out of lenght (min len=1 / max len=40) ")
	@JsonProperty("promo")
	private String promo;
	
	@Size(min = 1, max = 10, message = "ID_TIPO_PROMO out of lenght (min len=1 / max len=10) ")
	@NotNull
	@JsonProperty("id_tipo_promo")
	private int idTipoPromo;
	
	@JsonProperty("id_stato_promo")
	private int idStatoPromo;

	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("sellout_da")
	private Date selloutDa;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("sellout_a")
	private Date selloutA;
	
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
	
	@JsonProperty("flag_attiva")
	private int flagAttiva;
	
	@JsonProperty("flag_annullata")
	private int flagAnnullata;
	
	@Size(min = 1, max = 10, message = "ID_ESTERNO_TIPO_PROMO out of lenght (min len=1 / max len=10) ")
	@JsonProperty("id_esterno_tipo_promo")
	private String idEsternoTipoPromo;
	
	@JsonProperty("promo_offerta")
    private List<PromoOfferta> listPromoOfferta;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodicePromo() {
		return codicePromo;
	}

	public void setCodicePromo(String codicePromo) {
		this.codicePromo = codicePromo;
	}

	public String getIdSocieta() {
		return idSocieta;
	}

	public void setIdSocieta(String idSocieta) {
		this.idSocieta = idSocieta;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public int getIdTipoPromo() {
		return idTipoPromo;
	}

	public void setIdTipoPromo(int idTipoPromo) {
		this.idTipoPromo = idTipoPromo;
	}

	public int getIdStatoPromo() {
		return idStatoPromo;
	}

	public void setIdStatoPromo(int idStatoPromo) {
		this.idStatoPromo = idStatoPromo;
	}

	public Date getSelloutDa() {
		return selloutDa;
	}

	public void setSelloutDa(Date selloutDa) {
		this.selloutDa = selloutDa;
	}

	public Date getSelloutA() {
		return selloutA;
	}

	public void setSelloutA(Date selloutA) {
		this.selloutA = selloutA;
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

	public int getFlagAttiva() {
		return flagAttiva;
	}

	public void setFlagAttiva(int flagAttiva) {
		this.flagAttiva = flagAttiva;
	}

	public int getFlagAnnullata() {
		return flagAnnullata;
	}

	public void setFlagAnnullata(int flagAnnullata) {
		this.flagAnnullata = flagAnnullata;
	}

	public String getIdEsternoTipoPromo() {
		return idEsternoTipoPromo;
	}

	public void setIdEsternoTipoPromo(String idEsternoTipoPromo) {
		this.idEsternoTipoPromo = idEsternoTipoPromo;
	}

	public List<PromoOfferta> getListPromoOfferta() {
		return listPromoOfferta;
	}

	public void setListPromoOfferta(List<PromoOfferta> listPromoOfferta) {
		this.listPromoOfferta = listPromoOfferta;
	}

	@Override
	public String toString() {
		return "PromoTestata [id=" + id + ", codicePromo=" + codicePromo + ", idSocieta=" + idSocieta + ", promo="
				+ promo + ", idTipoPromo=" + idTipoPromo + ", idStatoPromo=" + idStatoPromo + ", selloutDa=" + selloutDa
				+ ", selloutA=" + selloutA + ", utenteInserimento=" + utenteInserimento + ", dataInserimento="
				+ dataInserimento + ", utenteAggiornamento=" + utenteAggiornamento + ", dataAggiornamento="
				+ dataAggiornamento + ", flagAttiva=" + flagAttiva + ", flagAnnullata=" + flagAnnullata
				+ ", idEsternoTipoPromo=" + idEsternoTipoPromo + ", listPromoOfferta=" + listPromoOfferta + "]";
	}
	
}
