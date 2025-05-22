package nivel2.products.countryAddresses;

import nivel2.products.Phone;

public class ColombiaPhone implements Phone {

    private String number;

    public ColombiaPhone(String number) {
        this.number = number;
    }

        @Override
    public String getPhone() {
        return "+57" + number;
    }
}
