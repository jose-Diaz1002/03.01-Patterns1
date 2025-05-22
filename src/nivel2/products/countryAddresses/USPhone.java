package nivel2.products.countryAddresses;

import nivel2.products.Phone;

public class USPhone implements Phone {
    private String number;

    public USPhone(String number) {
        this.number = number;
    }

    @Override
    public String getPhone() {
        return "+1 " + number;
    }
}
