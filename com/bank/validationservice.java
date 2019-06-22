package com.bank;

public abstract class validationservice {//The class must be everytime abstract whenever ther is an abstrct method present in it.

    private String serviceCode;

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public abstract boolean validateService();//Calling the function again to get the serviceCodes

}
