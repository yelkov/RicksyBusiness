package edu.badpals.RicksyBusiness;

import edu.badpals.RicksyBusiness.payment.CreditCard;
import edu.badpals.RicksyBusiness.payment.PaymentMethod;

import java.util.Arrays;

public class RickMenu implements GuestDispatcher{
    private int stock = 100;
    private double precioMenu = 10d;
    private String SYMBOL = "EZI";
    private CreditCard[] clientes = null;

    public RickMenu(CreditCard[] clientes) {
        this.clientes = clientes;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void dispatch(PaymentMethod payment) {
        if(payment.credit()>10 && stock > 0){
            payment.pay(10);
            setStock(this.stock - 1);
        };

    }

    public Integer getPedidos() {
        Integer numPedidos = 0;
        for (CreditCard cliente : clientes){
            if (cliente.credit() > 10d){
                numPedidos++;
            }else{
                ;
            }
        }
        return numPedidos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stock menús: ").append(stock).append('\n')
                .append("Precio del menu: ").append(precioMenu).append(SYMBOL).append('\n')
                .append("Numero de pedidos: ").append(getPedidos()).append('\n')
                .append("Clientes: \n");

        for (CreditCard cliente : clientes){
            sb.append(cliente.cardOwner()).append('\n');
        }
        return sb.toString();
    }
}
