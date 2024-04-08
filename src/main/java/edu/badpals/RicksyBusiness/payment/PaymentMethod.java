package edu.badpals.RicksyBusiness.payment;

public interface PaymentMethod {
    void pay(int i);
     String number();
     double credit();
     void setCredit(double credit);

}
