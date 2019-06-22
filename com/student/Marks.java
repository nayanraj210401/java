package com.student;

public class Marks extends Student {
    protected int sub1,sub2;

  public Marks(int slno, String name , int sub1 ,int sub2){
      super(slno,"human");
      this.sub1 =sub1;
      this.sub2 = sub2;

  }

    public int getSub1() {
        return sub1;
    }

    public void setSub1(int sub1) {
        this.sub1 = sub1;
    }

    public int getSub2() {
        return sub2;
    }

    public void setSub2(int sub2) {
        this.sub2 = sub2;
    }
}
