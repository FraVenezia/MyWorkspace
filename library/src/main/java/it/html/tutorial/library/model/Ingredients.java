package it.html.tutorial.library.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ingredients {
	
	@JsonProperty("PKID")
	private int PKID;
	
	@JsonProperty("IngName")
	private String ingName;
	
	@JsonProperty("Included")
	private boolean included;
	
	@JsonProperty("ExtraPrice")
	private double extraPrice;
	
	public int getPKID() {
		return PKID;
	}
	public void setPKID(int PKID) {
		this.PKID = PKID;
	}
	public String getIngName() {
		return ingName;
	}
	public void setIngName(String ingName) {
		this.ingName = ingName;
	}
	public boolean isIncluded() {
		return included;
	}
	public void setIncluded(boolean included) {
		this.included = included;
	}
	public double getExtraPrice() {
		return extraPrice;
	}
	public void setExtraPrice(double extraPrice) {
		this.extraPrice = extraPrice;
	}
	
	

}
