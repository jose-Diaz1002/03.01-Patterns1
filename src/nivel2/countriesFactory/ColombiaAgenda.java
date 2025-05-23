package nivel2.countriesFactory;

import nivel2.AgendaFactory;
import nivel2.models.Address;
import nivel2.models.Phone;
import nivel2.models.countries.ColombiaAddress;
import nivel2.models.countries.ColombiaPhone;

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
