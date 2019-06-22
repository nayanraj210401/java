public class SH2index {

    public static void main(String[] args) {
        String str ="Welcome to new World";
        System.out.println(str.indexOf('W'));
        System.out.println(str.indexOf('W',5));
        System.out.println(str.lastIndexOf('W'));
        System.out.println(str.lastIndexOf('W',10));
        System.out.println("Character at this index" +" "+str.charAt(3));


        String s1 = "hello";
        String s2  = "Hello";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));


    }

}
