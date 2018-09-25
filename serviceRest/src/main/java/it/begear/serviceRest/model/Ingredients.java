package it.begear.serviceRest.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ingredients {
	
	@JsonProperty("PKID")
	private int PKID;
	
	@JsonProperty("IngName")
	private String ingName;
	
	@JsonProperty("Included")
	private boolean included;
	
	@JsonProperty("ExtraPrice")
	private float extraPrice;
	
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
	public float getExtraPrice() {
		return extraPrice;
	}
	public void setExtraPrice(float extraPrice) {
		this.extraPrice = extraPrice;
	}
	@Override
	public String toString() {
		return "Ingredients [PKID=" + PKID + ", ingName=" + ingName + ", included=" + included + ", extraPrice="
				+ extraPrice + "]";
	}

}
