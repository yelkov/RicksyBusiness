package edu.badpals.RicksyBusiness.payment;

import edu.badpals.RicksyBusiness.payment.PaymentMethod;

public class CreditCard implements PaymentMethod {
    private String owner = "";
    private String number = "";
    private double credit = 3000d;
    private final String SYMBOL = "EZI";

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public String number() {
        return number;
    }

    public double credit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String cardOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "owner:" + owner + '\n' +
                "number:" + number + '\n' +
                "credit:" + credit + SYMBOL;
    }

    @Override
    public void pay(int i) {
        if(credit < i){
            setCredit(0.0);
        }else{
        setCredit(credit() - i);
    }
    }
}
