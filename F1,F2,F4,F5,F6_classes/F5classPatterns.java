public class F5classPatterns {
   public static void main(String args[]) {
       int n = 5;
       int m = 4;
       
       //Solid Rectangle Pattern
         for(int i=0; i<n; i++) {
              for(int j=0; j<m; j++) {
                    System.out.print("*");
              }
                System.out.println();
            }
       
           
       //Hollow Rectangle Pattern
       for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               if(i == 0 || i == n-1 || j == 0 || j == m-1) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }

 
       //Half pyramid Pattern
         for(int i=0; i<n; i++) {
                for(int j=0; j<=i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
         }
          

        //Inverted Half Pyramid Pattern 
        for(int i=n; i>=1; i--) {
            for(int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        


        //Inverted Half Pyramid 180 degrees Pattern
        n=4;
        for(int i=1; i<=n;i++) {
            
            for(int j=1;j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Right triangled pyramid Pattern with numbers
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Inverted Right Triangled Half Pyramid Pattern with numbers
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        // Floyd pattern with numbers
        int count = 1;
        n=5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                 System.out.print(count + " ");
                    count++;
            }
            System.out.println();
        }


        // 0-1 Triangle Pattern
        n=5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        // Butterfly Pattern
        
}
}

