package it.html.tutorial.library.modelLoyalty;

import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonProperty;

public class PromoPaniereEsclusione {
	
	@JsonProperty("id_promo_condizione")
	private int idPromoCondizione;
	
	@Size(min = 1, max = 7, message = "ID_ARTICOLO out of lenght (min len=1 / max len=7) ")
	@JsonProperty(value="id_articolo")
	private String idArticolo;

	public int getIdPromoCondizione() {
		return idPromoCondizione;
	}

	public void setIdPromoCondizione(int idPromoCondizione) {
		this.idPromoCondizione = idPromoCondizione;
	}

	public String getIdArticolo() {
		return idArticolo;
	}

	public void setIdArticolo(String idArticolo) {
		this.idArticolo = idArticolo;
	}

	@Override
	public String toString() {
		return "PromoPaniereEsclusione [idPromoCondizione=" + idPromoCondizione + ", idArticolo=" + idArticolo + "]";
	}

}
