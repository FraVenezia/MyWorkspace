package it.html.tutorial.library.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemPrincing {
	
	@JsonProperty("PKID")
	private int PKID;
	
	@JsonProperty("SizeName")
	private String sizeName;
	
	@JsonProperty("SizePrice")
	private double sizePrice;
	
	
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
	public double getSizePrice() {
		return sizePrice;
	}
	public void setSizePrice(double sizePrice) {
		this.sizePrice = sizePrice;
	}


}
