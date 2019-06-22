package com.inheritance.Inthertance1;

public class apple extends Fruit {

        private String shape;

        public void setShape(String colors, int s1,String Shape){

            shape = Shape;
            super.setColors("RedLine",123);

        }

        public void show(){
            super.show();
            System.out.println(shape);
        }



}
