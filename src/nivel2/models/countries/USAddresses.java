package nivel2.models.countries;

import nivel2.models.Address;

public class USAddresses implements Address {
    private String street;
    private String city;
    private String  postalCode;


    public USAddresses(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;

    }

    @Override
    public String getAddress() {
        return "Street " + street + ", postal code " + postalCode + ", city " + city + " country  United State";
    }
}
