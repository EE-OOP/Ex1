package Products;

import java.util.List;

public class Bouquet {
    private List<Flower> flowers;
    private boolean isArranged;

    //Single flower constructor
    public Bouquet(Flower flower) {
        this.flowers.add(flower);
        this.isArranged = true;
    }

    public Bouquet(List<Flower> flowers) {
        this.flowers = flowers;
        this.isArranged = true;
    }

    //Adding a single flower to the flowers list field
    public void addFlower(Flower f){
        if(flowers.contains(f)){
            System.out.println(f.getType() + " are already in the bouquet");
            return;
        }
        getFlowers().add(f);
    }

    //adding multiple flowers to the flower list field
    public void addFlowers(List<Flower> f){
        for(Flower flower: f)
            addFlower(flower);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public boolean isArranged() {
        return isArranged;
    }

}
