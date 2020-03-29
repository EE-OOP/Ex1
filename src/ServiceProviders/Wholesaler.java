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

    public List<Flower> orderFlowers (List<String> flowersList) { //to Grower
        System.out.println(getName() + " forwards request to " + gr.getName());
        List<Flower> flowers = gr.requestGardener(flowersList);
        System.out.println(getName() + " returns flowers");
        return flowers;
    }
}
