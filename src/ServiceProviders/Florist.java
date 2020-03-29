package ServiceProviders;

import Products.*;

import java.util.ArrayList;
import java.util.List;

public class Florist {
    private String name;
    private List<String> clients;
    private Wholesaler ws;
    private FlowerArranger fa;
    private DeliveryPerson dp;

    public Florist(String name, Wholesaler ws, FlowerArranger fa, DeliveryPerson dp) {
        this.name = name;
        clients = new ArrayList<>();
        this.ws = ws;
        this.fa = fa;
        this.dp = dp;
    }

    public String getName() {
        return name;
    }

    public void prepareOrder(List<String> flowersList, String sendTo) { //Combine all actions
        if (clients.contains(sendTo)) {
            List<Flower> flowers = getFlowers(flowersList);
            Bouquet dazzlingB = getFlowerArrangement(flowers);
            sendBouquet(dazzlingB, sendTo);
        } else {
            System.out.println(sendTo + " is not a client of " + getName() + "'s");
            System.out.println(getName() + " forewords order to a colleague");
            Florist florist = new Florist(sendTo + "'s Florist", ws, fa, dp);
            florist.addClient(sendTo);
            florist.prepareOrder(flowersList, sendTo);
        }
    }

    private List<Flower> getFlowers(List<String> flowersList) { //From Wholesaler
        System.out.println(getName() + " forwards request to " + ws.getName());
        return ws.orderFlowers(flowersList);
    }

    private Bouquet getFlowerArrangement(List<Flower> flowersList) { //From Flower Arranger
        System.out.println(getName() +" request flowers arrangement from " + fa.getName());
        return fa.makeBouquet(flowersList);
    }

    private void sendBouquet(Bouquet b, String sendTo) { //To Delivery Person
        System.out.println(getName() + " forwards flowers to " + dp.getName());
        dp.makeDelivery(b, sendTo);
    }

    public boolean addClient(String name) {
        if (!clients.contains(name)) {
            clients.add(name);
            return true;
        }
        return false;
    }
}
