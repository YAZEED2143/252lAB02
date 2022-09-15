package lab02;

import java.util.Random;
import java.time.LocalDate;
import java.util.logging.Logger;

public class Order {

    private int orderNumber;
    private LocalDate orderDate;
  private lab02.Logger log = lab02.Logger.getInstance();

    private int getRandomNumber() {
        Random ran = new Random();
        return ran.nextInt(Integer.MAX_VALUE);
    }

    public Order() {
        // Emulate slow initialization.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.orderNumber = getRandomNumber();
        this.orderDate = LocalDate.now();
        log.info("A new order was created");
        log.info(this.toString());
    }

    public String toString() {
        return "Order info:\nOrder number: " + this.orderNumber
                + "\nDate" + this.orderDate;
    }
}
