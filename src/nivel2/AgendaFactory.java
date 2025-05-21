package nivel2;

import nivel2.products.Address;
import nivel2.products.Phone;

public interface AgendaFactory {

    Address createAddress(String street, String city, String postalCode);
    Phone createPhone(String number);

}
