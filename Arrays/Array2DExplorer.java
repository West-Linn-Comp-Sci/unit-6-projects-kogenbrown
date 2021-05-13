public class Array2DExplorer {
    public Array2DExplorer(){}
    public int minRow(int[][] nums, int row) {
        int min = nums[row][0];
        for(int n:nums[row]) if(n<min) min=n;
        return min;
    }

    public int[] colMaxs(int[][] matrix) {
        int[] maximums = new int[matrix.length];
        for(int i=0;i<matrix[0].length;i++) {
            int colMax=0;
            for(int j=0;j<matrix.length;j++) {
                if(matrix[j][i]>colMax) colMax=matrix[j][i];
            }
            maximums[i]=colMax;
        }
        return maximums;
    }

    public int[] allRowSums(int[][] data) {
        int[] sums = new int[data.length];
        for(int i=0;i<data.length;i++) {
            int rowSum=0;
            for(int n:data[i]) rowSum+=n;
            sums[i]=rowSum;
        }        
        return sums;
    }

    public double[] averageCol(int[][] nums) {

    }

    public int smallEven(int[][] matrix) {

    }

    public static int biggestRow(int[][] nums) {

    }

}