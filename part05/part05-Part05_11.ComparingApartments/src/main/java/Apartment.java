import java.lang.Math;

public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare; // pricePerSquare

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan (Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int priceThis = this.princePerSquare * this.squares;
        int priceCompared = compared.princePerSquare * compared.squares;
        return Math.abs(priceThis - priceCompared);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.princePerSquare > compared.princePerSquare;
    }

}
