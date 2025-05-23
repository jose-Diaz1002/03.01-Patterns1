package nivel2;

import nivel2.models.Address;
import nivel2.models.Phone;

public interface AgendaFactory {

    Address createAddress(String street, String city, String postalCode);
    Phone createPhone(String number);

}
