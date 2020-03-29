import Clients.Sender;
import ServiceProviders.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gardener grd = new Gardener("Jimmy the Gardener");
        Grower gro = new Grower("James the Grower", grd);
        Wholesaler ws = new Wholesaler("John the Wholesaler", gro);
        FlowerArranger fa = new FlowerArranger("Tony the Flower Arranger");
        DeliveryPerson dp = new DeliveryPerson("Oscar the Delivery Person");
        Florist fred = new Florist("Fred", ws, fa, dp);
        Sender chris = new Sender("Chris", fred);

        List<String> flowerList = new ArrayList<>();
        flowerList.add("Roses");
        flowerList.add("Violets");
        flowerList.add("Gladiolus");
        chris.sendFlowers(flowerList, "Robin");
    }
}
