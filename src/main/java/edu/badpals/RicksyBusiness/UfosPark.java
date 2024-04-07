package edu.badpals.RicksyBusiness;

import java.util.*;
import java.util.stream.Collectors;

public class UfosPark implements GuestDispatcher{
    private final double fee = 500d;
    private Map<String, String> flota = new HashMap<>();
    public UfosPark() {
    }

    public void add(String ovni) {
        this.flota.put(ovni,"");
    }

    @Override
    public void dispatch(CreditCard creditCard) {
        if (!containsCard(creditCard.number())){
            for (Map.Entry<String, String> entry: flota.entrySet()){
                if(entry.getValue() == ""){
                    this.flota.replace(entry.getKey(), creditCard.number());
                    creditCard.setCredit(creditCard.credit() - fee);
                    break;
                }else{
                    ;
        }
            }
        }
    }
    public String getUfoOf(String number){
        for (Map.Entry<String, String> entry: flota.entrySet()){
            if (entry.getValue()== number){
                return entry.getKey();
            }
        }
        return "null";
    }

    @Override
    public String toString() {
        return flota.keySet()
                .stream()
                .sorted()
                .collect(Collectors.toList())
                .toString();
    }

    public List<String> cardNumbers() {
        List<String> numberList= new ArrayList<>();
        for ( String value : this.flota.values()){
            numberList.add(value);
        }
        return numberList;
    }
    boolean containsCard(String number){
        return this.flota.containsValue(number);
    }
}
