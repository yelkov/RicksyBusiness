package edu.badpals.RicksyBusiness.payment;

public interface PaymentMethod {
    void pay(int i);
    public String number();
    public double credit();
    public void setCredit(double credit);

}
