
final class MyRole{//final means constant the members inside the class is constant
    public void aboutMe(){
        System.out.println("This is Software Developer");
    }
}

public class FinalClass {

    public static void main(String[] args) {

        MyRole role= new MyRole();
        role.aboutMe();
    }

}
