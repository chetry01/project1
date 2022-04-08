import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// int matrix[][] = { { 0, 1, 2 }, { 3, 0, 1 }, { 4, 3, 0 }, { 5, 4, 3 } };
		// int matrix1[][] = { { 0, 1 }, { 3, 0 }, { 4, 3 }, { 5, 4 } };
		//
		// for (int i : Matrix.diagonalArraySize(matrix)) {
		// System.out.print(i + " ");
		// }
		//
		// System.out.println();
		// System.out.println();
		// for (int i : Matrix.headArray(matrix)) {
		// System.out.print(i + " ");
		// }
		//
		// System.out.println();
		// System.out.println();
		//
		// for (int[] i : matrix) {
		// for (int temp : i) {
		// System.out.print(temp + " ");
		// }
		// System.out.println();
		// }
		//
		// System.out.println();
		//
		// System.out.println(Matrix.fullArrayList(matrix));

	}

	public static List<List<Integer>> applicationPairs(int deviceCapacity, List<List<Integer>> foregroundAppList,
			List<List<Integer>> backgroundAppList) {
		
		int max=deviceCapacity;

		List<List<Integer>> l = new ArrayList<List<Integer>>();

		for (int i = 0; i < foregroundAppList.size(); i++) {

			for (int j = 0; i < backgroundAppList.size(); j++) {
				
				int tempMax=foregroundAppList.get(i).get(2)+backgroundAppList.get(j).get(2);
				
				if(max<tempMax && tempMax<=max) {
					
					max=tempMax;
					//list to zero
					
				}
				else if(max==tempMax) {
					//save in list
				}
				else(){
					//do nothing
				}
				
				//return list saved;
				
				

			}

		}

	}

}
