package nivel2.products.countryAddresses;

import nivel2.products.Address;

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
        return street + ", " + postalCode + " " + city + ", Colombia";
    }
}
