
public class Money {

    private final int euros;
    private final int cents;
    private int value;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
        this.value = (euros * 100) + cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newCents = 0;
        int newEuros = 0;

        int cents = addition.cents() + this.cents();
        int euros = addition.euros() + this.euros();

        if (cents >= 100) {
            euros++;
            cents -= 100;
        }

        Money afterAddition = new Money(euros, cents);
        return afterAddition;
    }

    public boolean lessThan(Money compared) {
        return this.value < compared.value;
    }

    public Money minus(Money decreaser) {
        int resultantValue = this.value - decreaser.value;

        if (resultantValue < 0) {
            return new Money(0, 0);
        } else {
            int euros = resultantValue / 100;
            int cents = resultantValue % 100;
            return new Money(euros, cents);
        }

    }
}
