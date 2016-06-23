package ozAndHisGameBoardProblem;

public class GameBoardProblem {

	public static void main(String[] args) {
		
		int inputArray[] = {34, 54, 846, -732, 374};
		
		int N = inputArray[0];
		int M = inputArray[1];
		int A = inputArray[2];
		int B = inputArray[3];
		int C = inputArray[4];
		
		
		
		int finalResult = findMaxGamePoint(N,M,A,B,C);
		
		System.out.println("Final Answer:: "+finalResult);

	}

	public static int findMaxGamePoint(int N, int M, int A, int B, int C)
	{
		
		int pointOfChange,pointOfNoChange;
		pointOfNoChange = N*A+M*B;
		int maxNoOfCoinsMoved = N>M?M:N;
		
		pointOfChange = ((N-maxNoOfCoinsMoved) * A) + ((M-maxNoOfCoinsMoved) * B) + (2 * maxNoOfCoinsMoved * C);
		
		return pointOfChange>pointOfNoChange?pointOfChange:pointOfNoChange;
	}
}
