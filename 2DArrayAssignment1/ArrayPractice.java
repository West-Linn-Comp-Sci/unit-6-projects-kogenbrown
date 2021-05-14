public class ArrayPractice {
	public static void main(String[] args) {
		int[][] array = {{5,4,2,1,0},{523,63,2342,586,1,6534,0},{10,9,2,0}};
		fixArray(array, 0, 4, array[0].length);
		fixArray(array, 1, 6, array[1][0]+array[1][5]);
		fixArray(array, 2, 3, array.length);
		print(array);
	}
	public static void fixArray(int[][] arr, int row, int col, int val) {
		arr[row][col]=val;
	}
	public static void print(int[][] arr) {
		for(int[] row : arr) {
			for(int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}