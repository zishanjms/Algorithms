package challenge.optymyze.level1;

public class OfficeSetUpInBangalore {

	public static void main(String[] args) {
		
		String input = "-1@10@-1#10@2@10#-1@10@-1";
		minimumpossiblecost(input);

	}

	
	public static int minimumpossiblecost(String input1)
    {
        int result=0;
        
        String[] rows = input1.split("#");
        String[][] colms = new String[rows.length][];
        for (int i = 0; i < rows.length; i++) {
			colms[i] = rows[i].split("@");
		}
        
        int[][] inputArray = new int[rows.length][colms.length];
        
        for (int i = 0; i < rows.length; i++) {
			for (int j = 0; j < colms.length; j++) {
				inputArray[i][j] = Integer.parseInt(colms[i][j]);
			}
		}
        
        for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray[0].length; j++) {
				System.out.print("\t"+inputArray[i][j]);
			}
			System.out.println();
		}
        
        return result;
    }
}
