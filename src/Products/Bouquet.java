package Products;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers;
    private boolean isArranged;

    //Single flower constructor
    public Bouquet(Flower flower) {
        if (flower != null) {
            this.flowers.add(flower);
            this.isArranged = true;
        } else {
            this.flowers = new ArrayList<>();
        }
    }

    //Multiple flower constructor
    public Bouquet(List<Flower> flowers) {
        if (flowers == null)
            this.flowers = new ArrayList<>();

        this.flowers = new ArrayList<>();
        for (Flower f : flowers) {
            if (f != null)
                addFlower(f);
        }

        this.isArranged = true;
    }

    //Adding a single flower to the flowers list field
    public void addFlower(Flower f) {
        if (f == null)
            return;

        if (flowers.contains(f)) {
            System.out.println(f.getType() + " are already in the bouquet");
            return;
        }
        getFlowers().add(f);
    }

    //adding multiple flowers to the flower list field
    public void addFlowers(List<Flower> f) {
        for (Flower flower : f)
            addFlower(flower);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

}