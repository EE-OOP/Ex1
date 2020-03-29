package Products;

public class Flower {
    private String type;

    public Flower(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Flower))
            return false;
        return type.equals(obj.toString());
    }

    @Override
    public String toString() {
        return getType();
    }
}