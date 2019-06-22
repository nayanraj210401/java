public class Stringhandling1 {

    public static void main(String[] args) {


        String s1 ="Hello World";
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.append("new"));
        System.out.println(sb.length());
        System.out.println(sb.insert(6,"my new"));
        System.out.println(sb.delete(6,10));
        System.out.println(sb.reverse());
        System.out.println(sb.length());

    }



}
