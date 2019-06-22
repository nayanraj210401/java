package com.student;

public class Sports extends Student {
    private String sp;

    public Sports(int slno, String name, String sp) {
        super(slno, name);
        this.sp = sp;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }




}
