package F3class;
import java.util.*;
public class Thirdclass3 {
        public static void main(String[] args) {
        System.out.println("This is Thirdclass3");
        //switch
         Scanner sc = new Scanner(System.in);
         int button=sc.nextInt();
         switch(button){
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("World");
            break;
            case 3:System.out.println("Java");
            break;
            default:System.out.println("Default case");
            break;}
            sc.close();
        }
}
