package it.begear.serviceRest.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemPrincing {
	
	@JsonProperty("PKID")
	private int PKID;
	
	@JsonProperty("SizeName")
	private String sizeName;
	
	@JsonProperty("SizePrice")
	private float sizePrice;
	
	
	public int getPKID() {
		return PKID;
	}
	public void setPKID(int PKID) {
		this.PKID = PKID;
	}
	public String getSizeName() {
		return sizeName;
	}
	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}
	public float getSizePrice() {
		return sizePrice;
	}
	public void setSizePrice(float sizePrice) {
		this.sizePrice = sizePrice;
	}
	@Override
	public String toString() {
		return "ItemPrincing [PKID=" + PKID + ", sizeName=" + sizeName + ", sizePrice=" + sizePrice + "]";
	}
	
}
