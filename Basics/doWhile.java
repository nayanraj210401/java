public class doWhile {
    public static void main(String[] args) {


        int n = -100;
        do{
            System.out.println("value" +n);
            n++;
        }while(n<10);

        String str =  "India";
        for(int i =0 ; i<str.length();i++){ // normal for
            System.out.println(str.charAt(i));
        }

        for(char ch : str.toCharArray()){ ///for ecah for loop
            System.out.println(ch);
        }


        String message = "Hello everyone";
        String words[]  =  message.split(" ");

        for(String word : words ){//enhanced for loop{In this case it automatically increments or decrements}
            System.out.println(word);
        }

    }

}
