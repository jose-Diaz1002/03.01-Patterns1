package nivel2.countriesFactory;

import nivel2.AgendaFactory;
import nivel2.models.Address;
import nivel2.models.Phone;
import nivel2.models.countries.USAddresses;
import nivel2.models.countries.USPhone;

public class USAgenda implements AgendaFactory {
    @Override
    public Address createAddress(String street, String city, String postalCode) {
        return new USAddresses(street,city,postalCode);
    }

    @Override
    public Phone createPhone(String number) {
        return new USPhone(number);
    }
}
