import java.util.ArrayList;
public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maximumWeight = 0;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<Item>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = this.items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }

    @Override
    public String toString() {
        int total = this.totalWeight();
        if (items.size() == 1) {
            return this.items.size() + " item " + "(" + total + " kg)";
        } else if (items.size() > 1) {
            return this.items.size() + " items " + "(" + total + " kg)";
        }
        return "no items (" + total + " kg)";
    }
}
