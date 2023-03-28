import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a n value : ");
        int n = scanner.nextInt();
         for(int i = 1; i <= n; i++){
           for (int j = 1; j <= (n - i); j++){
               System.out.print(" ");
           }
             for(int k = 1; k<=(2*i) - 1; k ++){
                 System.out.print("*");
             }
             System.out.println();
         }
        for(int i = 1; i <= n; i++){
            // the reason why we subtract -1 is that it was giving us unnecessary spaces.
            for (int l = n - 1; l >= (n - i); l--){
                System.out.print(" ");
            }
            // the reason why we add +2 is that if we don't we won't be able to get the 4th line from the end
            for(int m = n + 2; m>=(2*i) - 1; m--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}