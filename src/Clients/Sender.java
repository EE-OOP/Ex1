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
        System.out.print(getName() + " orders flowers for " + sendTo + " from " + getServer().getName() + ": ");
        String fl = "";
        for(String flower : flowers)
            fl += flower + ", ";
        System.out.print(fl.substring(0, fl.length()-2));

        System.out.println();
        getServer().prepareOrder(flowers, sendTo);
    }

    public Florist getServer() {
        return server;
    }

    public String getName() {
        return name;
    }
}