package harsha;

import java.util.*;

public class Market {

	private String marketName;
	private Map<String, Technology> technologyMap;
	
	public Market(String marketName) {
		this.marketName = marketName;
		technologyMap = new HashMap<String, Technology>();
	}
	
	public String getMarketName(){
		return marketName;
	}
	
	public void addTechnolgy(Technology technology){
		technologyMap.put(technology.getTechnologyType(), technology);
	}
	
	public Technology getTechnologyByType(String technologyType){
		return technologyMap.get(technologyType);
	}

	@Override
	public String toString() {

        String result = "MARKET{" +
                "NAME='" + marketName + '\'' +
                ", contents of Technologies: ";

        for (Map.Entry<String, Technology> entry : this.technologyMap.entrySet())
        {
            result += "\n" + entry.getValue();
        }
        return result;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Market market = (Market) o;
        
        if (!this.marketName.equals(market.getMarketName()))
            return false;

        return true;
	}
	
	@Override
	public int hashCode() {
		return marketName.hashCode();
	}
	
}
