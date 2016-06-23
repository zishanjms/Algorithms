package harsha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Technology {

	private String technologyType ;

	private Map<String, SAPCProfile> profileMap;

	public Technology(String technologyType) {
		this.technologyType = technologyType;
		profileMap = new HashMap<String, SAPCProfile>();
	}
	
	public String getTechnologyType(){
		return technologyType;
	}
	
	public void addSAPCProfile(SAPCProfile profile){
		profileMap.put(profile.getID(), profile);
	}
	
	public SAPCProfile getSAPCProfileByID(String ID){
		return profileMap.get(ID);
	}
	
	public ArrayList<SAPCProfile> getAllSAPCProfiles(){
		ArrayList<SAPCProfile> sapcProfileList = new ArrayList<>();
		for(Entry<String, SAPCProfile> entry : profileMap.entrySet()){
			sapcProfileList.add(entry.getValue());
		}
		return sapcProfileList;
	}
	
	public SAPCProfile getTechnologyByType(String proileType){
		return profileMap.get(proileType);
	}

	@Override
	public String toString() {

        String result = "\n Technology{" +
                "Type='" + technologyType + '\'' +
                ", contents=";

        for (Entry<String, SAPCProfile> entry : this.profileMap.entrySet())
        {
            result += entry.getValue();
        }
        return result;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Technology technology = (Technology) o;
        
        if (!this.technologyType.equals(technology.getTechnologyType()))
            return false;

        return true;
	}
	
	@Override
	public int hashCode() {
		return technologyType.hashCode();
	}
}
