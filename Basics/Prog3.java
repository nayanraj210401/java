import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int n =sc.nextInt();
        System.out.println("THe number is "+n);

        MyData data = new MyData();//Intanstation
        data.n = sc.nextInt();
        data.mesasge ="HELLO MESSAGE";
        System.out.println(data.n+" "+data.mesasge);

    }

}


 class MyData{//we can Declare only one public class in a java file

    int n;
    String mesasge;


}
