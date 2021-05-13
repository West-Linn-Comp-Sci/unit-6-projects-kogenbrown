import java.util.ArrayList;

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
        double[] averages = new double[nums.length];
        for(int i=0;i<nums[0].length;i++) {
            double colTotal=0;
            for(int j=0;nums.length;j++) {
                colTotal+=nums[j][i];
            }
            averages[i]=colTotal/averages[0].length;
        }
        return averages;
    }

    public int smallEven(int[][] matrix) {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++) {
            for(int n:matrix[i]) if(n%2==0) evens.add(n); 
        }
        int min = evens.get(0);
        for(int n:evens) if(n<min) min = n;
        return min;
    }

    public static int biggestRow(int[][] nums) {
        int largestRowSum = 0, largestRowIndex = 0;
        for(int i=0;i<nums.length;i++) {
            int sum = 0;
            for(int n:nums[i]) sum+=n;
            if(sum>largestRowSum) {
                largestRowSum=sum; 
                largestRowIndex=i;
            }
        }
        return largestRowIndex;
    }

}