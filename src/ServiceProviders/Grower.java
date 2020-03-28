package ServiceProviders;

import Products.Flower;
import java.util.List;

public class Grower {
    private String name;
    private Gardener gd;

    public Grower (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Flower> requestGardener (List<String> flowersList) {
        System.out.println(name + " forwards order to " + gd.getName());
        List<Flower> flowers = gd.growFlowers(flowersList);
        System.out.println(name + " returns flowers to Wholesaler");
        return flowers;
    }
}
