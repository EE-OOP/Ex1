import Clients.Sender;
import ServiceProviders.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gardener grd = new Gardener("jimmy the Gardener");
        Grower gro = new Grower("james the Grower", grd);
        Wholesaler ws = new Wholesaler("john the Wholesaler", gro);
        FlowerArranger fa = new FlowerArranger("tony the Flower Arranger");
        DeliveryPerson dp = new DeliveryPerson("oscar the Delivery Person");
        Florist fred = new Florist("fred", ws, fa, dp);
        Sender chris = new Sender("Chris", fred);

        List<String> flowerList = new ArrayList<>();
        flowerList.add("roses");
        flowerList.add("lilys");
        flowerList.add("violets");
        flowerList.add("lilys");
        chris.sendFlowers(flowerList, "Robin");
    }
}
