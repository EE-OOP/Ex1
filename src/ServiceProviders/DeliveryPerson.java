package ServiceProviders;

import Clients.Recipient;
import Products.Bouquet;

public class DeliveryPerson {
    private String name;

    public DeliveryPerson (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Object makeDelivery (Object o, String sendTo) {
        Recipient client = new Recipient(sendTo);
        System.out.println(name + " delivers flowers to " + sendTo);
        return client.beAmazed((Bouquet)o);
    }
}
