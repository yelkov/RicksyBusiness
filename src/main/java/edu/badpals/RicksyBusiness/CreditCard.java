package edu.badpals.RicksyBusiness;

public class CreditCard {
    private String owner = "";
    private String number = "";
    private double credit = 3000d;

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

    public String cardOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "owner:" + owner + '\n' +
                "number:" + number + '\n' +
                "credit:" + credit + "EZI" + '\n';
    }
}
