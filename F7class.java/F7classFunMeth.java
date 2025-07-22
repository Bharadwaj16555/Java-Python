import java.util.Scanner;
public class F7classFunMeth {
    
    public static void greet(String name) {
        System.out.println(name);
        return; 
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the person:");
        String name = sc.nextLine();
        greet(name);
        sc.close();
    }

}



