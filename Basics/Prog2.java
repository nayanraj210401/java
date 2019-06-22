import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {



        System.out.println("Enter name");
        String name ;

        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Name of your JOB");
       String job =sc.nextLine();
        System.out.println("Welcome "+name);
        System.out.println("Your Job is "+job);

    }


}
