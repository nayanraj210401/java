package com.inheritance;

public class Second extends inheritance{
    private int c;

   public void setValues(int x, int y , int z){
       c =z;
       super.setValue(x,y);

   }

   public void showValues(){
       super.showValue();
       System.out.println(c);
   }


}
