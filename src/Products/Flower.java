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
        return type.equals((String) obj);
    }
}