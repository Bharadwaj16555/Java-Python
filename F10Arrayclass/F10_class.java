package F10Arrayclass;

import java.util.*;

public class F10_class {
    public static void main(String[] args) {
        // Example usage of the F10_class
       // int[] array = {1, 2, 3, 4, 5};
        int[] array = new int[3];
        int flag = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element to be searched:");
        int x = s.nextInt();
        System.out.println("Enter 3 elements in the array:");
        for (int i = 0; i < 3; i++) {
            array[i] = s.nextInt();
        }

        System.out.println("You entered the following elements:");
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < 3; i++) {
            if (array[i] == x) {
                flag = 1;
                break;
        }
    }
        if (flag == 1) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
    
        s.close();
        
    }
}
