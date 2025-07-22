import java.util.*;
// This file is F7classFunMeth1.java
// It contains a method to calculate the sum of two integers and prints the result.
public class F7classFunMeth1 {
    public static int Sum(int a, int b) {
        int Sum = a + b;
        return Sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = Sum(a, b);
        System.out.println("The sum is: " + sum);
        sc.close();
    }
  
}
