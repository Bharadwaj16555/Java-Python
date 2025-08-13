package F13class;

import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        
        //Addition of the string to the existing string by Append
        sb.append(" World");


        //Character accessing
        System.out.println(sb.charAt(0));


        //set the char at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);


        //Inserting the char in the existing string
        sb.insert(0, 'I');
        System.out.println(sb);


        //Deleting the char in the String
        sb.delete(0, 1);
        System.out.println(sb);

        //Deleting the char index
        sb.deleteCharAt(0);
        System.out.println(sb);

        //Scanner class in the string builder
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        StringBuilder sb2 = new StringBuilder(input);
        System.out.println("You entered: " + sb2);



        //Length of the string
        System.out.println("Length of the original string: " + sb2.length());

        //Capacity of the string
        System.out.println("Capacity of the original string: " + sb2.capacity());

        //Reverse of the string
        sb2.reverse();
        System.out.println("Reversed string: " + sb2);


        //Reverse of the string

        for(int i=0;i<sb2.length()/2;i++) {
           int front = i;
           int back = sb2.length() - 1 - i;

           char frontChar = sb2.charAt(front);
           char backChar = sb2.charAt(back);

           sb2.setCharAt(front, backChar);
           sb2.setCharAt(back, frontChar);
           // sb2.setCharAt(i, back);
           // sb2.setCharAt(sb2.length()-i-1, front);


        }







        scanner.close();
    }
    
}
