package com.student;


interface  Message{
    String sendMessage(String user);
    String invite(String user,String location);

}

interface calculate{

int add(int a,int b);

}

public class Intface implements Message,calculate{


    @Override
    public String sendMessage(String user){


        return "HElLO"+user;

    }

@Override
    public String invite(String user ,String location){
        return "Hi "+user +"Your Invite to join us at"+location;
    }

    public static void main(String[] args) {

        Intface i = new Intface();
        System.out.println(i.sendMessage("Nayan"));
        System.out.println(i.invite("Nayan","Hi-Tech city"));

    }


    @Override
    public int add(int a, int b) {
        return (a+b);
    }
}
