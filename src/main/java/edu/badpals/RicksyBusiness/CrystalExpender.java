package edu.badpals.RicksyBusiness;

import edu.badpals.RicksyBusiness.payment.PaymentMethod;

public class CrystalExpender implements GuestDispatcher {
    private int stock = 0;
    private double itemCost = 0d;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }
    public int stock(){
        return this.stock;
    }


    @Override
    public String toString() {
        return "stock: " + stock() + "\n"+
                "itemCost: " + itemCost;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void dispatch(PaymentMethod payment) {
        if(payment.credit()>50){
            payment.pay(50);
            setStock(this.stock - 1);
        };

    }
}
