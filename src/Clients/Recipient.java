package Clients;

import Products.Bouquet;

public class Recipient {
    private String name;

    public Recipient(String name) {
        this.name = name;
    }

    public boolean beAmazed(Bouquet b){
        if(b.getFlowers().size()>=3){
            System.out.println(getName() + " is amazed form the beautiful bouquet");
            return true;
        }

        System.out.println("The bouquet has to little types of flowers and " + getName() + " is disappointed");
        return false;
    }

    public String getName() {
        return name;
    }
}
