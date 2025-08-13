package F3class;
/*import java.util.Scanner;
public class Thirdclass2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        if(number%2 == 0) {   
            System.out.println("Even");
         }
         else
         {
            System.out.println("Odd");
         }
        sc.close();
}

}
*/
import java.util.Scanner;
public class Thirdclass2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        if(number1==number2) {   
            System.out.println("Equal");
         }
         else if(number1 > number2)
         {
            System.out.println("Number1 is greater than Number2");
         }
         else
         {
            System.out.println("Number2 is greater than Number1");
         }
        sc.close();
}

}
