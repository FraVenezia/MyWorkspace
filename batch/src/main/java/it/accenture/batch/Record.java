package it.accenture.batch;

public class Record {
	private String permalink;
	private String company;
	private String numEmps;
	private String category;
	private String city;
	private String state;
	//@DateTimeFormat(pattern = "dd-MM-yy")
	private String fundedDate;
	private int raisedAmt;
	private String raisedCurrency;
	private String round;
	
	public Record() {
	}

	public Record(String permalink, String company, String numEmps, String category, String city, String state,
			String fundedDate, int raisedAmt, String raisedCurrency, String round) {
		super();
		this.permalink = permalink;
		this.company = company;
		this.numEmps = numEmps;
		this.category = category;
		this.city = city;
		this.state = state;
		this.fundedDate = fundedDate;
		this.raisedAmt = raisedAmt;
		this.raisedCurrency = raisedCurrency;
		this.round = round;
	}

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getNumEmps() {
		return numEmps;
	}

	public void setNumEmps(String numEmps) {
		this.numEmps = numEmps;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFundedDate() {
		return fundedDate;
	}

	public void setFundedDate(String fundedDate) {
		this.fundedDate = fundedDate;
	}

	public int getRaisedAmt() {
		return raisedAmt;
	}

	public void setRaisedAmt(int raisedAmt) {
		this.raisedAmt = raisedAmt;
	}

	public String getRaisedCurrency() {
		return raisedCurrency;
	}

	public void setRaisedCurrency(String raisedCurrency) {
		this.raisedCurrency = raisedCurrency;
	}

	public String getRound() {
		return round;
	}

	public void setRound(String round) {
		this.round = round;
	}

	@Override
	public String toString() {
		return "Record [permalink=" + permalink + ", company=" + company + ", numEmps=" + numEmps + ", category="
				+ category + ", city=" + city + ", state=" + state + ", fundedDate=" + fundedDate + ", raisedAmt="
				+ raisedAmt + ", raisedCurrency=" + raisedCurrency + ", round=" + round + "]";
	}
	
}
