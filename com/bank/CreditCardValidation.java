package com.bank;

public class CreditCardValidation extends validationservice {
    @Override
    public boolean validateService() {
        String bankCode[] = {"1234","8903","4567"};

        String ServiceCode =getServiceCode();
        boolean flag =false;
        if(ServiceCode.length()==16){
            for(String code: bankCode){
                if(code.equals(ServiceCode.substring(0,4)))
                {
                    flag= true;
                }

            }

        }

        return flag;

    }


    public static void main(String[] args) {

        CreditCardValidation c =new CreditCardValidation();

        c.setServiceCode("1234567901234561");
        System.out.println("Card is validated ="+c.validateService());
    }

}
