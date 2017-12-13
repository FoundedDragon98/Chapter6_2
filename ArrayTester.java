
public class ArrayTester
{
    public static void main(String[] args) {
        int[][] arr1 = {{1, 1, 1,},
                        {1, 1, 1,}
                        };
                        
        int[][] arr2 = {{1, 4, 2,},
                        {6, 3, 7,}
                        };
                        
        ArrayCalculation ac = new ArrayCalculation();
        double avg = ac.averageArray(arr1);
        System.out.println("Average is: " + avg);
        
        int[] result = ac.sumColumns(arr1);
        
        for(int thing : result) {
            System.out.print(thing + ", ");
        }
        
        int[][] squared = ac.squareArray(arr2);
        
        for(int[] row : squared) {
            for(int num : row) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }
    }
}
