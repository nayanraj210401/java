package com.student;

public class Studentmain {


    public static void main(String[] args) {

       // Marks m = new Marks(12,"nayan",78,79);
        Result m =new Result(12,"nayanraj",12,34);
        System.out.println("Sno is = "+m.getSlno());
        System.out.println("name is  = "+m.getName());
        System.out.println("sub 1 = "+m.getSub1()+"Sub 2 = "+m.getSub2());
        m.showResult();
            Sports s =new Sports(123,"Ajay","Soccer");
        System.out.println("S no + "+ s.getSlno());
        System.out.println("name  = "+s.getName());
        System.out.println("Sports = "+s.getSp());

        Marks mark = new Result(1,"human",44,44); // upward casting
        System.out.println(mark.getSlno()+" "+mark.getSub1()+""+mark.getSub2());



        //Dowarcasting
         Result r = (Result)(mark);//Incorrect format is Result r = (Result)(new Marks()
        r.showResult();

        System.out.println(mark instanceof Student);//Always true
       // System.out.println(marks instanceof Student);//Always false





    }


}
