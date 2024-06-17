package org.gopal.AdapterCharger;

public class IPhoneMobile implements IphoneCharger {

    IphoneCharger charger = new ChargerAdapter();
    @Override
    public void chargePhone() {
        charger.chargePhone();
    }
}
