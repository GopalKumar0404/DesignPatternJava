package org.gopal.AdapterCharger;

public class ChargerAdapter implements IphoneCharger{
    AndroidCharger androidCharger = new AndroidPhone();
    // using implementation of already defined classes.
    @Override
    public void chargePhone() {
        System.out.println("Charging Adapter charging the phone.");
        androidCharger.chargePhone();
    }
}
