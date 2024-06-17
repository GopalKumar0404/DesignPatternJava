package org.gopal.AdapterCharger;

public class AndroidPhone implements  AndroidCharger{
    @Override
    public void chargePhone() {
        System.out.println("Charging my Android Phone ");
    }
}
