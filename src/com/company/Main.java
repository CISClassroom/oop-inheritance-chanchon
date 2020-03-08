package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        Book book = new Book();

        System.out.println("1 เพื่อฝากเงิน \n2 เพื่อถอนเงิน \n3 ดูยอดเงินที่เหลือในบัญชี");
        System.out.println("***********************************");
        System.out.println("โปรดเลือกการใช้งานของท่าน");
        String Gold = number.nextLine();

        if (Gold.equals("1")){
            Poss poss = new Poss();
            System.out.println("1 บัญชีเงินฝากประจำ \n2 บัญชีเงินฝากออมทรัพย์");
            System.out.println("ท่านต้องการใช้บริการตัวเลือกใด ?");
            String Click = number.nextLine();
            if (Click.equals("1")){
                System.out.println("ระบุจำนวนเงิน : ");
                double money = number.nextDouble();
                poss.fixed_Click(money);
            } else if (Click.equals("2")){
                System.out.println("ระบุจำนวนเงิน : ");
                double money = number.nextDouble();
                poss.saving_Click(money);
            }
        }else if (Gold.equals("2")){
            Result result = new Result();
            System.out.println("1 บัญชีเงินฝากประจำ \n2 บัญชีเงินฝากออมทรัพย์");
            System.out.println("ท่านต้องการใช้บริการตัวเลือกใด ?");
            String money3 = number.nextLine();
            if (money3.equals("1")){
                System.out.println("ระบุจำนวนเงิน : ");
                double money =  number.nextDouble();
                result.fixed_Click(money);
            } else if (money3.equals("2")){
                System.out.println("ระบุจำนวนเงิน : ");
                double money = number.nextDouble();
                result.saving_Click(money);
            }
        }else if (Gold.equals("3")){
            System.out.println("1 ตรวจยอดเงินคงเหลือในบัญชีเงินฝากประจำ \n2 ตรวจยอดเงินคงเหลือในบัญชีเงินฝากออมทรัพย์");
            System.out.println("เลือกบรการของท่าน : ");
            String Ans = number.nextLine();
            if (Ans.equals("1")){
                book.fixed_Ans();
            }else if (Ans.equals("2")){
                book.saving_Ans();
            }
        }
    }

}