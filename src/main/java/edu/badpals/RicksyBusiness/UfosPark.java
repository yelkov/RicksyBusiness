package edu.badpals.RicksyBusiness;

import java.util.ArrayList;
import java.util.List;

public class UfosPark implements GuestDispatcher{
    private List<String> flota = new ArrayList<>();
    public UfosPark() {
    }

    public void add(String ovni) {
        this.flota.add(ovni);
    }

    @Override
    public void dispatch(CreditCard creditCard) {

    }
}
