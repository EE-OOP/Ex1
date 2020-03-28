package ServiceProviders;

import Products.Flower;
import java.util.List;

public class Wholesaler {
    private String name;
    private Grower gr;

    public Wholesaler (String name, Grower gr) {
        this.name = name;
        this.gr = gr;
    }

    public String getName() {
        return name;
    }

    public List<Flower> orderFlowers (List<String> flowersList) {
        System.out.println(name + " forwards request to Grower");
        List<Flower> flowers = gr.requestGardener(flowersList);
        System.out.println(name + " returns flowers to Robin's Florist");
        return flowers;
    }
}
