package com.company;

public class Result {
    Book money = new Book();

    public  void fixed_Click(double money3){
        money.money_fixed -= money3;
        money.fixed_Ans();

    }

    public void saving_Click(double money3){
        money.money_saving -= money3;
        money.saving_Ans();
    }
}