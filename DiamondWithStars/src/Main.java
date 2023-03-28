import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a n value : ");
        int n = scanner.nextInt();
        //upside
         for(int i = 1; i <= n; i++){
           for (int j = 1; j <= (n - i); j++){
               System.out.print(" ");
           }
             for(int k = 1; k<=(2*i) - 1; k ++){
                 System.out.print("*");
             }
             System.out.println();
         }
        //downside
        for(int l = n; l >=1; l--){
          
            for (int m = (n - l); m >= 1; m--){
                System.out.print(" ");
            }
        
            for(int p = (2*l) - 1 ; p>= 1; p--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
