import java.util.Scanner;

public class switchCases {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two  numbers ");
        int n = (new Scanner(System.in)).nextInt();//Anomonsly class (used to save memory while creating an object)
        int m = (new Scanner(System.in)).nextInt();
        System.out.println("1.add");
        System.out.println("2.mul");
        System.out.println("Choice");
        int c = (new Scanner(System.in)).nextInt();
        switch (c){
            case 1:
                System.out.println("Sum is "+(m+n));
                break;
            case 2:
                System.out.println("Mul is " +(m*n));
                break;

        }

    }

}
