package hu.progmatic;

public class Ingredients {

    private String name;
    private int quantity;
    private String quality;
    private boolean vegan;

    public Ingredients(String name, int quantity, String quality, boolean vegan) {
        this.name = name;
        this.quantity = quantity;
        this.quality = quality;
        this.vegan = vegan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", quality='" + quality + '\'' +
                ", vegan=" + vegan +
                '}';
    }
}
