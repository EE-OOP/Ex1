package Clients;

import ServiceProviders.Florist;
import java.util.List;

public class Sender {
    private String name;
    private Florist server;

    public Sender(String name, Florist florist) {
        this.name = name;
        this.server = florist;
    }

    public void sendFlowers(List<String> flowers, String sendTo) {
        System.out.println(getName() + "orders flowers for " + sendTo + " from" + getServer().getName() + ": ");
        for(String flower : flowers)
            System.out.print(flower + " ");

        getServer().prepareOrder(flowers, sendTo);
    }

    public Florist getServer() {
        return server;
    }

    public String getName() {
        return name;
    }
}