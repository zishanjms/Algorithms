package harsha;

public class SAPCProfile {

	private String key;	
	private String ID ;
	private String CumulativeQuotaGreaterThan ;
	private String QuotaUnit ;
	private String CumulativeQuotalessThan ;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCumulativeQuotaGreaterThan() {
		return CumulativeQuotaGreaterThan;
	}
	public void setCumulativeQuotaGreaterThan(String cumulativeQuotaGreaterThan) {
		CumulativeQuotaGreaterThan = cumulativeQuotaGreaterThan;
	}
	public String getQuotaUnit() {
		return QuotaUnit;
	}
	public void setQuotaUnit(String quotaUnit) {
		QuotaUnit = quotaUnit;
	}
	public String getCumulativeQuotalessThan() {
		return CumulativeQuotalessThan;
	}
	public void setCumulativeQuotalessThan(String cumulativeQuotalessThan) {
		CumulativeQuotalessThan = cumulativeQuotalessThan;
	}
	
	@Override
	public String toString() {
		 String result = "\n SAPCProfile {" +
	                "id ='" + ID + '\'' +
	                ", CumulativeQuotaGreaterThan='" + CumulativeQuotaGreaterThan + '\'' +
	                ", QuotaUnit='" + QuotaUnit + '\'' +
	                ", KEY='"+ key + '\'' +
	                ", CumulativeQuotalessThan='" + CumulativeQuotalessThan + '\'' +
	                "}";
	                
		return result;
	}
	
}
