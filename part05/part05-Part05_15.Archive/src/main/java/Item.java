import java.util.Objects;

public class Item {
    private String identifier;

    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    /*

    * the equals method considers two Item objects equal only if their identifier are the same.
    * The hashCode method is calculated using only the hash code of identifier.
    * By doing this, two Person objects with the same identifier
    * will always have the same hash code,
    * satisfying the contract between equals and hashCode.
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return identifier.equals(item.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }

    @Override
    public String toString() {
        return identifier + ": " + name;
    }
}
