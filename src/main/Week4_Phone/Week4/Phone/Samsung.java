package Week4.Phone;

import Week4.Phone.AbstractPhone;

public class Samsung extends AbstractPhone {
    private final String BRAND = "Samsung";

    public Samsung(String color, int baterrylife, String IMEI) {
        super(color, baterrylife, IMEI);
    }
}
