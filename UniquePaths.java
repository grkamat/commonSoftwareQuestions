/**
 * Class which contains method to count unique paths 
 * to the end of a grid
 * 
 * @author grkamat
 *
 */
public class UniquePaths {
/**
 * Method finds number of unique paths to 
 * the End of the grid by storing results in the matrix
 * as we pass by
 * @param m number of rows
 * @param n number of columns
 * @return number of unique paths from (0,0)
 */
public int uniquePaths(int m, int n) {
	//matrix to store results on the way
	int [][]grid = new int[m][n];
	
	//Finding number of paths for each piece in the grid.
	for(int i=0;i<m;i++)
		for(int j=0;j<n;j++) {
			if(i==0 || j==0)
				grid[i][j]=1;
			else
				grid[i][j]= grid[i-1][j] + grid[i][j-1];
		}
	  
	
	return grid[m-1][n-1];
    }




}
