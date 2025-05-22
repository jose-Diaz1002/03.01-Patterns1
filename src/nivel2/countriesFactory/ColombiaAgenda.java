package nivel2.countriesFactory;

import nivel2.AgendaFactory;
import nivel2.products.Address;
import nivel2.products.Phone;
import nivel2.products.countryAddresses.ColombiaAddress;
import nivel2.products.countryAddresses.ColombiaPhone;

public class ColombiaAgenda implements AgendaFactory {
    @Override
    public Address createAddress(String street, String city, String postalCode) {
        return new ColombiaAddress(street,city,postalCode);
    }

    @Override
    public Phone createPhone(String number) {
        return new ColombiaPhone(number);
    }
}
