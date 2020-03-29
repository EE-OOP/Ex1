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
        System.out.println(getName() + " returns a beautiful bouquet of " + dazzlingB.getFlowers().toString() + " to the florist");
        return dazzlingB;
    }
}
