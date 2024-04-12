package edu.badpals.RicksyBusiness;

import edu.badpals.RicksyBusiness.payment.PaymentMethod;

public interface GuestDispatcher {
    public void dispatch(PaymentMethod payment);
}
