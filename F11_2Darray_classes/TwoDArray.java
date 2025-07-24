package F11_2Darray_classes;
import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        // Example usage of the TwoDArray class
        int row ;
        int col ;
        int flag = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element to be searched:");
        int x = s.nextInt();
        System.out.println("Enter the number of rows and columns for the 2D array:");
        row=s.nextInt();
        col=s.nextInt();
        int[][] array = new int[row][col];
        System.out.println("Enter elements in the 2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = s.nextInt();
            }
        }
        System.out.println("You entered the following elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] == x) {
                    flag = 1;
                    break;
                }
            }
        }

 if (flag == 1) {
                System.out.println("Element found in the 2D array.");
            }
            else {
                System.out.println("Element not found in the 2D array.");
            }


        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(array[i][j] == x){
                   System.out.println("Element found at position: (" + i + ", " + j + ")");
                }
            }
        }
s.close();
    }

}

