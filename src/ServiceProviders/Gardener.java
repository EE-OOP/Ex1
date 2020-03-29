package ServiceProviders;

import Products.Flower;
import java.util.ArrayList;
import java.util.List;

public class Gardener {
    private String name;

    public Gardener (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Flower> growFlowers (List<String> flowersList) {
        System.out.println(name + " prepares flowers");
        List<Flower> flowers = new ArrayList<>(flowersList.size());
        for (String flower : flowersList) {
            flowers.add(new Flower(flower));
        }
        System.out.println(name + " returns flowers to Grower");
        return flowers;
    }
}
