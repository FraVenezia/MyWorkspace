package it.begear.serviceRest.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Menu {
	
	@JsonProperty("MenuID")
	private int menuID;
	
	@JsonProperty("MenuVersion")
	private int menuVersion;
	
	@JsonProperty("MenuName")
	private String menuName;
	
	@JsonProperty("MenuItems")
	private List<MenuItems> menuItems;

	public int getMenuID() {
		return menuID;
	}

	public void setMenuID(int menuID) {
		this.menuID = menuID;
	}

	public int getMenuVersion() {
		return menuVersion;
	}

	public void setMenuVersion(int menuVersion) {
		this.menuVersion = menuVersion;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public List<MenuItems> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuItems> menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public String toString() {
		return "Menu [menuID=" + menuID + ", menuVersion=" + menuVersion + ", menuName=" + menuName + ", menuItems="
				+ menuItems + "]";
	}
	
	
}
