import java.util.Scanner;

public class loops {

    public static void main(String[] args) {

        int rem;
        int max =0;
        System.out.println("Enter any numbers");
        int n =(new Scanner(System.in)).nextInt();

        if(String.valueOf(n).length()==5){
//
//            int rev =0;
//            int temp =n;
//            while(temp>0){
//                rev = rev*10+temp%10;
//                temp /=10;
//            }
//            System.out.println("Reverse of the number is "+rev);

            int temp = n ;
            for(;temp>0;) {
                rem = temp % 10;
                if (rem % 2 == 0) {
                    System.out.println(rem);
                    if(max<rem){
                        max = rem;

                    }
                }
                temp /= 10;
            }
            System.out.println(max);

      }
        else
        {
            System.out.println("Enter 5 digit number");
        }


    }

}
