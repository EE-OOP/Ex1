package ServiceProviders;

import Products.*;
import java.util.List;

public class FlowerArranger {
    private String name;

    public FlowerArranger (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Bouquet makeBouquet (List<Flower> flowers) {
        System.out.println(name + " arranges flowers");
        Bouquet dazzlingB = new Bouquet(flowers);
        System.out.println(name + " returns arranged flowers");
        return dazzlingB;
    }
}
