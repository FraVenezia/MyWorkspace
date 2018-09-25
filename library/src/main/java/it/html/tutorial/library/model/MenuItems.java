package it.html.tutorial.library.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MenuItems {
	
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Description")
	private String description;
	
	@JsonProperty("PKID")
	private int PKID;
	
	@JsonProperty("ParentID")
	private int parentID;
	
	@JsonProperty("Ingredients")
	private List<Ingredients> ingredients;
	
	@JsonProperty("ItemPricing")
	private List<ItemPrincing> itemPrincing;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPKID() {
		return PKID;
	}
	public void setPKID(int PKID) {
		this.PKID = PKID;
	}
	public int getParentID() {
		return parentID;
	}
	public void setParentID(int parentID) {
		this.parentID = parentID;
	}
	public List<Ingredients> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}
	public List<ItemPrincing> getItemPrincing() {
		return itemPrincing;
	}
	public void setItemPrincing(List<ItemPrincing> itemPrincing) {
		this.itemPrincing = itemPrincing;
	}
	@Override
	public String toString() {
		return "MenuItems [name=" + name + ", description=" + description + ", PKID=" + PKID + ", parentID=" + parentID
				+ ", ingredients=" + ingredients + ", itemPrincing=" + itemPrincing + "]";
	}

	

}
