
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(30, 12, 2015);

        System.out.println(date);
        date.advance();
        System.out.println(date);
        date.advance(7);
        System.out.println(date);
    }
}
