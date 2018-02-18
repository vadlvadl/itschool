package com.lizogub;

public class Bank {
    private int credit = 0;
    private int ballance = 0;
    private int term = 0;
    private int month = 0;

    public void setCredit(int money){
        this.credit = money;
    }

    // Установить количество месяцев для погашения кредита
    public void setMonthAmount(int month) {
        if(month > 0) {
            this.term = month;
        }
    }

    public void pay(int money){
        if(money < 0){
            System.out.println("Вы не можете брать в долг");
        }

        this.ballance = this.ballance + money;
        this.month++;
    }

    private void notifyToPay(){
        System.out.println("Кредитный период близится к концу.\nВаш долг: " + (this.credit - this.ballance));
        System.out.println("У вас осталось " + (this.term - this.month) + " месяцев для оплаты");
    }

    public void getStatus(){
        if(this.month > (this.term - 2)){
            this.notifyToPay();
        }
        if(this.ballance >= this.credit){
            System.out.println("Поздравляем! Вы погасили кредит.");
        } else {
            System.out.println("Вы взяли кредит в размере: " + this.credit);
            System.out.println("Вы выплатили: " + this.ballance);
            System.out.println("Остаток по платежу: " + (this.credit - this.ballance));
        }
    }

    public boolean isDiluted(){
        if(this.ballance >= this.credit) {
            return true;
        } else {
            return false;
        }
    }
}
