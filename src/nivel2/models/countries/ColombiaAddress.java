package nivel2.models.countries;

import nivel2.models.Address;

public class ColombiaAddress implements Address {
    private String street;
    private String city;
    private String  postalCode;

    public ColombiaAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getAddress() {
        return "Stree " + street + ", postal code " + postalCode + ", city " + city + ", country  Colombia";
    }
}
