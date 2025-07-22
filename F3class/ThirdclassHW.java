package F3class;
import java.util.*;
 public class ThirdclassHW {
    public static void main(String[] args) {

        System.out.println("This is ThirdclassHW");
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a variable");
        int a=sc.nextInt();
        System.out.println("Enter the b variable");
        int b=sc.nextInt();
        int Add = a + b;
        int Sub = a - b;
        int Mult = a * b;
        int Div = a / b;
        System.out.println("Enter the button");
         int button=sc.nextInt();
         switch(button){
            case 1:System.out.println(Add);
            break;
            case 2:System.out.println(Sub);
            break;
            case 3:System.out.println(Mult);
            break;
            case 4:System.out.println(Div);
            default:System.out.println("Default case");
            break;}
            sc.close();
        System.out.println("End of ThirdclassHW");
    }
}
