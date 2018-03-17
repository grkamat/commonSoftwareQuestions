import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Class which contains method to produce a Pascal's Triangle 
 * up to a given input level.
 * 
 * @author grkamat
 *
 */
public class PascalsTriangle {
	/**
	 * Time Complexity : O(n^2) Space Complexity : O(n^2)
	 * 
	 * @param numRows
	 *            levels of Pascal's tree
	 * @return Pascal's Triangle
	 */
	public List<List<Integer>> generate(int numRows) {
		// Initializing the triangle
		List<List<Integer>> triangle = new LinkedList<List<Integer>>();

		//If numRows = 0, return empty DS
		if(numRows == 0)
            return triangle;

		
		// level 1
		triangle.add(new LinkedList<Integer>());
		triangle.get(0).add(1);

		// Other levels
		for (int i = 1; i < numRows; i++) {
			LinkedList<Integer> level = new LinkedList<Integer>();

			// Getting previous level to count the next level
			List<Integer> prevLevel = triangle.get(i - 1);

			/**
			 * Sandwich
			 */
			level.add(1);
			// Calculating middle values of List.
			for (int j = 1; j < i; j++) {
				level.add(prevLevel.get(j) + prevLevel.get(j - 1));
			}
			level.add(1);

			// Adding level to triangle
			triangle.add(level);
		}

		return triangle;

	}

}
