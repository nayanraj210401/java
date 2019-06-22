package com.student;

public class Result extends Marks{
    private int total;
    private double avg;

    public Result(int slno, String name, int sub1, int sub2) {
        super(slno, name, sub1, sub2);
        total = sub1+sub2;
        avg =total/2;

    }

    public void showResult()
    {
        System.out.println("Total "+total +"Aver"+avg);
    }

}
