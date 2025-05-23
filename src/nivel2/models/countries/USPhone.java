package nivel2.models.countries;

import nivel2.models.Phone;

public class USPhone implements Phone {
    private String number;

    public USPhone(String number) {
        this.number = number;
    }

    @Override
    public String getPhone() {
        return "phone +1 " + number;
    }
}
