
public class MainProgram {

    public static void main(String[] args) {
       Money firstMoneyObject = new Money(1, 0);
       Money secondMoneyObject = new Money(1, 50);
       Money thirdMoneyObject = new Money(-3,5);
       Money fourthMoneyObject = new Money(2,0);

       System.out.println(firstMoneyObject.lessThan(secondMoneyObject));
    }
}
