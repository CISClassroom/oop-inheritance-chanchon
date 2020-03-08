package com.company;

public class Poss {
    Book money = new Book();

    public  void fixed_Click(double money2){
        if (money2 <= 5000){
            System.out.println("เงินฝากขั้นต่ำ 5000 บาท");
        } else if (money2 >= 5000){
            money.money_fixed += money2;
            money.fixed_Ans();
        }
    }

    public void saving_Click(double money2){
        money.money_saving += money2;
        money.saving_Ans();
    }
}