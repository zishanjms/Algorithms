package random;

public class SplitString {

	public static void main(String[] args) {
		String iLPN = "DTCW01_AAT_LPN_00001|D07";
		 String[] parts = iLPN.split("|");
         String caseNbr = parts[0];
         String putwyType = parts[1];

         System.out.println("Ilpn "+caseNbr+ " of PutawayType:: "+ putwyType);
	}

}
