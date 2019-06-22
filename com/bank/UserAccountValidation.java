package com.bank;

public class UserAccountValidation extends validationservice{


    @Override
    public boolean validateService() {
        if(getServiceCode().charAt(0)>='A' && getServiceCode().charAt(0)<='Z' && getServiceCode().length()==8 ){
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        UserAccountValidation user= new UserAccountValidation();
        user.setServiceCode("User2019");//false because the fisrt letter is not capital
        System.out.println("UserAccount is ="+user.validateService());
    }



}
