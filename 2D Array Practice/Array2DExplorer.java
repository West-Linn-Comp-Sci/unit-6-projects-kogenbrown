import java.util.ArrayList;

public class Array2DExplorer {
    public static void main(String[] args) {

        //I deleted a few lines because they called on methods that were not asked for in the Google Classroom assignment


        int[][] array = {  {4,1,8,5},
                           {0,2,3,4},
                           {6,6,2,2} };
        System.out.print("Test minRow: \n Expecting: 0 \n Actual: " + minRow(array, 1) + "\n");

        System.out.print("Test colMax: \n Expecting: {6 6 8 5} \n Actual: {");
        int [] colMaxs = colMaxs(array);
        for(int i = 0; i < colMaxs.length; i++){
            System.out.print(colMaxs[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
        int [] sum = allRowSums(array);
        for(int i = 0; i < sum.length; i++){
            System.out.print(sum[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
        double [] avg = averageCol(array);
        for(int i = 0; i < avg.length; i++){
            System.out.print(avg[i] + " ");
        }
        System.out.print("}");


        System.out.println();
        System.out.println();

        System.out.print("Test smallEven: \n Expecting: 0 \n Actual: ");
        System.out.println(smallEven(array));

        System.out.println();
        System.out.println();

        System.out.print("Test biggestRow: \n Expecting: 0 \n Actual: ");
        System.out.println(biggestRow(array));

        System.out.println();
    }
    public static int minRow(int[][] nums, int row) {
        int min = nums[row][0];
        for(int n:nums[row]) if(n<min) min=n;
        return min;
    }

    public static int[] colMaxs(int[][] matrix) {
        int[] maximums = new int[matrix[0].length];
        for(int i=0;i<matrix[0].length;i++) {
            int colMax=0;
            for(int j=0;j<matrix.length;j++) {
                if(matrix[j][i]>colMax) colMax=matrix[j][i];
            }
            maximums[i]=colMax;
        }
        return maximums;
    }

    public static int[] allRowSums(int[][] data) {
        int[] sums = new int[data.length];
        for(int i=0;i<data.length;i++) {
            int rowSum=0;
            for(int n:data[i]) rowSum+=n;
            sums[i]=rowSum;
        }        
        return sums;
    }

    public static double[] averageCol(int[][] nums) {
        double[] averages = new double[nums[0].length];
        for(int i=0;i<nums[0].length;i++) {
            double colTotal=0;
            for(int j=0;j<nums.length;j++) {
                colTotal+=nums[j][i];
            }
            averages[i]=colTotal/nums.length;
        }
        return averages;
    }

    public static int smallEven(int[][] matrix) {
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