package edu.badpals.RicksyBusiness;

import edu.badpals.RicksyBusiness.payment.PaymentMethod;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Receptivo {
    private Set<GuestDispatcher> observers = new HashSet<>();

    public Receptivo() {
    }

    public void registra(GuestDispatcher guestDispatcher) {
        this.observers.add(guestDispatcher);
    }

    public void dispatch(PaymentMethod payment) {
        Iterator<GuestDispatcher> observerIterator = observers.iterator();
        while(observerIterator.hasNext()){
            GuestDispatcher observer = observerIterator.next();
            observer.dispatch(payment);
        }
    }
}
