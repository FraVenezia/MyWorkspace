package it.html.tutorial.library.modelLoyalty;

import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonProperty;

public class PromoSegmentiLocali {
	
	@JsonProperty("id_promo_offerta")
	private int idPromoOfferta;
	
	@JsonProperty("id_segmento")
	private int idSegmento;
	
	@JsonProperty("sequenza")
	private int sequenza;
	
	@Size(min = 1, max = 3, message = "OPERATORE_LOGICO out of lenght (min len=1 / max len=3) ")
	@JsonProperty(value="operatore_logico")
	private String operatoreLogico;

	public int getIdPromoOfferta() {
		return idPromoOfferta;
	}

	public void setIdPromoOfferta(int idPromoOfferta) {
		this.idPromoOfferta = idPromoOfferta;
	}

	public int getIdSegmento() {
		return idSegmento;
	}

	public void setIdSegmento(int idSegmento) {
		this.idSegmento = idSegmento;
	}

	public int getSequenza() {
		return sequenza;
	}

	public void setSequenza(int sequenza) {
		this.sequenza = sequenza;
	}

	public String getOperatoreLogico() {
		return operatoreLogico;
	}

	public void setOperatoreLogico(String operatoreLogico) {
		this.operatoreLogico = operatoreLogico;
	}

	@Override
	public String toString() {
		return "PromoSegmentiLocali [idPromoOfferta=" + idPromoOfferta + ", idSegmento=" + idSegmento + ", sequenza="
				+ sequenza + ", operatoreLogico=" + operatoreLogico + "]";
	}
	
}
