import java.util.Stack;

/**
 * 
 * @author grkamat
 *
 */
public class SetZeroes {

	public void setZeroes(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		//Stack rows
		Stack<Integer> rowStack = new Stack<Integer>();
		
		//Stack columns
		Stack<Integer> colStack = new Stack<Integer>();
		
		//Detect squares with 0s and puch in col & row stacks
		for (int row = 0; row < rows; row++)
			for (int col = 0; col < cols; col++) {
				if (matrix[row][col] == 0) {
					rowStack.add(row);
					colStack.add(col);
				}
			}

		//Pop elements from both stacks and 
		//make the entire rows and columns 0
		while (!colStack.isEmpty()) {
			int row = rowStack.pop();
			int col = colStack.pop();
			
			for(int i=0;i<matrix[0].length;i++)
	            matrix[row][i]=0;
	        
	        for(int j=0;j<matrix.length;j++)
	            matrix[j][col]=0;
	        

		}
	}

}
