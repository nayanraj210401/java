public class StringExample {

    public static void main(String[] args) {

        String s1="Hello";
        String s2 = "World";
        System.out.println(s1+" "+s2);
        System.out.println(s1+" "+s1.hashCode() );
        System.out.println(s2+" "+s2.hashCode() );


        s1 = "HELLO";//HashCOde of the two String reams same when this are same with there cases.
        s2 = "HELLO";
        System.out.println(s1+" "+s1.hashCode() );
        System.out.println(s2+" "+s2.hashCode() );





    }

}
