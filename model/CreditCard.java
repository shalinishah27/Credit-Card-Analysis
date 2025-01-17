package model;

/**
 * Holds all the details of a credit card.
 * @author yugapriya
 */
public class CreditCard { 
	
	private String name;
	private String link;
	
	public CreditCard(String name, String link) {
		this.name = name;
		this.link = link;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
