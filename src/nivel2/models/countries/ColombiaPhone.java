package nivel2.models.countries;

import nivel2.models.Phone;

public class ColombiaPhone implements Phone {

    private String number;

    public ColombiaPhone(String number) {
        this.number = number;
    }

        @Override
    public String getPhone() {
        return " phone +57" + number;
    }
}
