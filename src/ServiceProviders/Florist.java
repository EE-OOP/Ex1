package ServiceProviders;

import Products.*;
import java.util.List;

public class Florist {
    private String name;
    private List<String> clients;
    private Wholesaler ws;
    private FlowerArranger fa;
    private DeliveryPerson dp;

    public Florist (String name, Wholesaler ws, FlowerArranger fa, DeliveryPerson dp) {
        this.name = name;
        clients = null;
        this.ws = ws;
        this.fa = fa;
        this.dp = dp;
    }

    public String getName() {
        return name;
    }

    public void prepareOrder (List<String> flowersList, String sendTo) { //Combine all actions
        if (clients.contains(sendTo)) {
            List<Flower> flowers = getFlowers(flowersList);
            Bouquet dazzlingB = getFlowerArrangement(flowers);
            sendBouquet(dazzlingB, sendTo);
        }
        else {
            Florist florist = new Florist("Robin's Florist", ws, fa, dp);
            florist.prepareOrder(flowersList, sendTo);
        }
    }

    private List<Flower> getFlowers (List<String> flowersList) { //From Wholesaler
        System.out.println("Robin's florist forwards request to " + ws.getName());
        return ws.orderFlowers(flowersList);
    }

    private Bouquet getFlowerArrangement (List<Flower> flowersList) { //From Flower Arranger
        System.out.println("Robin’s Florist request flowers arrangement from " + fa.getName());
        return fa.makeBouquet(flowersList);
    }

    private void sendBouquet (Bouquet b, String sendTo) { //To Delivery Person
        System.out.println("Robin’s Florist forwards flowers to " + dp.getName());
        dp.makeDelivery(b, sendTo);
    }

    public boolean addClient (String name) {
        if (!clients.contains(name)) {
            clients.add(name);
            return true;
        }
        return false;
    }
}
