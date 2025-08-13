import java.util.Scanner;
public class Forthclass {
    public static void main(String[] args) {
        // Loops Examples and Scanner usage
        System.out.println("This is Forthclass");
        Scanner src = new Scanner(System.in);
        int counter=src.nextInt();
        
        //For loop example
        for(int i=0; i<counter; i++) {
            System.out.println("For loop iteration: ");
            System.out.println(i);
        }

        //While loop example
        int i=0;
        while(i<counter) {
            System.out.println("While loop iteration: ");
            System.out.println(i);
            i++;
        }


        //Do-while loop example
        int j=1;
        do{
            System.out.println("Do while loop iteration: ");
            System.out.println(j);
            j++;
        }
        while(j<counter);
        int sum = 0;
        for(int k=0;k<counter;k++) {
            sum += k;
            System.out.println(sum);
        }
        src.close();
}
}