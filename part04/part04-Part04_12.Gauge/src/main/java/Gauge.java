public class Gauge {
    private int value;

    public Gauge() {
        this.value = value;
    }

    public void increase() { // grows the value instance variables's value by one
        if (this.value < 5) {
            this.value += 1;
        }
    }

    public void decrease() { // decrease the value instance variable's by one.
        if (this.value > 0) {
            this.value -= 1;
        }
    }

    public int value() { // return the value variable's value.
        return this.value;
    }

    public boolean full () { // true if the instance variable value has the value five, otherwise false
        if (this.value == 5) {
            return true;
        } else {
            return false;
        }
    }
}
