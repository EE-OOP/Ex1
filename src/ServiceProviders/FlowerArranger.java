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
        System.out.println(getName() + " arranges flowers");
        Bouquet dazzlingB = new Bouquet(flowers);
        System.out.println(getName() + " returns a Beautiful bouquet of " + dazzlingB.getFlowers().toString());
        return dazzlingB;
    }
}
