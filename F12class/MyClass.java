package F12class;
import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

//Strings Methods


       String s1="Hello";
       String s2="World";
       String s3=s1+"@"+s2;
       System.out.println("Concatenated String: " + s3);


      //The length of the String
      System.out.println("Length of s3:"+s3.length());

      //Accessing Characters
      System.out.println("First character of s3: " + s3.charAt(0));
      System.out.println("Last character of s3: " + s3.charAt( 1));

      for(int i=0;i<s3.length();i++){
          System.out.println("Character at index " + i + ": " + s3.charAt(i));
      }

      //Compare Strings
      //s1>s2 --> +ve value
      //s1==s2 --> 0
      //s1<s2 --> -ve value


      System.out.println("Comparing s1 and s2: " + s1.compareTo(s2));
      System.out.println("Comparing s2 and s1: " + s2.compareTo(s1));

      if(s1.compareTo(s2)==0){
        System.out.println("Strings are equal!");
      } else{
        System.out.println("Strings are not equal!");
      }

      if(new String("Hello!")==new String("world!")){
        System.out.println("Strings are equal!");
      } else{
        System.out.println("Strings are not equal!");
      }

      //Substring
      //substring(int beginning index,int ending index)
      String s4="Hello World";
      String s5=s4.substring(5,s4.length());
      System.out.println("Substring: " + s5);



      scanner.close();
    }
}
