package com.company;

public class Book {
    //เงินเริ่มต้น 10000
    public double money_fixed = 10000;
    public double money_saving = 200;

    public void fixed_Ans(){
        System.out.println("ยอดเงินคงเหลือในบัญชีเงินฝากประจำของท่าน : "+money_fixed);
    }

    public void saving_Ans(){
        System.out.println("ยอดเงินคงเหลือในบัญชีเงินฝากประจำของท่าน : "+money_saving);
    }
}