package nivel2;

import nivel2.countriesFactory.ColombiaAgenda;
import nivel2.countriesFactory.USAgenda;
import nivel2.models.countries.ColombiaAddress;
import nivel2.models.countries.ColombiaPhone;
import nivel2.models.countries.USAddresses;
import nivel2.models.countries.USPhone;

public class Main {
    public static void main(String[] args) {
        AgendaFactory colombiaAgenda = new ColombiaAgenda();

        ColombiaAddress colombiaAddress = (ColombiaAddress) colombiaAgenda.createAddress("32","Bogota","10045");
        ColombiaPhone colombiaPhone = (ColombiaPhone) colombiaAgenda.createPhone("2722142");

        AgendaFactory usAgenda = new USAgenda();

        USAddresses usAddresses = (USAddresses) usAgenda.createAddress("9","New York", "00001");
        USPhone usPhone = (USPhone) usAgenda.createPhone("2345678933");

        System.out.println("------colombia-------");
        System.out.println(colombiaAddress.getAddress());
        System.out.println(colombiaPhone.getPhone());

        System.out.println("-------USA----------");
        System.out.println(usAddresses.getAddress());
        System.out.println(usPhone.getPhone());
    }
}