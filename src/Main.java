import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //first we need to the sth with the columns.
        // 5 spaces at the beginning and for
        // the next lines the number of spaces decrease n - i
        // 1 3 5 7 9 11 +2 2i -1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a n value : ");
        int n = scanner.nextInt();
        System.out.println("*********************");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= (n-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=(2*i) - 1; k ++){
                System.out.print("*");
            }
            // the reason we wrote this is that if we didn't the triangle wouldn't be shaped.
            System.out.println();
        }

    }
}