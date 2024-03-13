
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(3);
        System.out.println(counter);

        counter.increase();
        System.out.println(counter);

        counter.increase(3);
        System.out.println(counter);

        counter.decrease();
        System.out.println(counter);

        counter.decrease(2);
        System.out.println(counter);
    }
}
