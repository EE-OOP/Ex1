package ServiceProviders;

import Products.Flower;
import java.util.List;

public class Grower {
    private String name;
    private Gardener gd;

    public Grower (String name, Gardener gd) {
        this.name = name;
        this.gd = gd;
    }

    public String getName() {
        return name;
    }

    public List<Flower> requestGardener (List<String> flowersList) {
        System.out.println(getName() + " forwards order to " + gd.getName());
        List<Flower> flowers = gd.growFlowers(flowersList);
        System.out.println(getName() + " returns flowers to the wholesaler");
        return flowers;
    }
}
