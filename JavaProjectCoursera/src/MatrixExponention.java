import java.util.Scanner;


public class MatrixExponention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[][] A={{0,1},{1,1}};
		long[][] holdingMatrix=A;
		
		Scanner inp=new Scanner(System.in);
		int term=inp.nextInt();
		
		if(term%2==0){
		
			for(int i=0;i<term/2;i++){
				
				holdingMatrix=multiply(holdingMatrix);
			}
		}
		long solution=result(holdingMatrix);
		System.out.println(solution);
		
		

	}
	
	
	public static long[][] multiply(long[][] holdingMatrix){
		
		long[][] result=new long[2][2];
		
			result[0][0]=holdingMatrix[0][0]*holdingMatrix[0][0]+holdingMatrix[0][1]*holdingMatrix[1][0];
			result[0][1]=holdingMatrix[0][0]*holdingMatrix[0][1]+holdingMatrix[0][1]*holdingMatrix[1][1];
			result[1][0]=holdingMatrix[1][0]*holdingMatrix[0][0]+holdingMatrix[1][1]*holdingMatrix[1][0];
			result[1][1]=holdingMatrix[1][0]*holdingMatrix[0][1]+holdingMatrix[1][1]*holdingMatrix[1][1];
		return result;
	}

	public static long result(long[][] holdingMatrix){
		
		long[] answer=new long[2];
		int [] matrix1={1,1};
		answer[0]=holdingMatrix[0][0]*matrix1[0]+holdingMatrix[0][1]*matrix1[1];
		answer[1]=holdingMatrix[1][0]*matrix1[0]+holdingMatrix[1][1]*matrix1[1];
		
		return answer[1];
	}
}
