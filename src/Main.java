import com.workintech.enums.BreakRollType;
import com.workintech.enums.CipsTypes;
import com.workintech.enums.DrinkTypes;
import com.workintech.models.*;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "NORMAL", 4.55, BreakRollType.EXTRA);

        hamburger.add("Tomato", 0.27);

        hamburger.add("Lettuce", 0.75);

        hamburger.add("Cheese", 1.13);
        hamburger.add("pickle", 12.13);
        hamburger.add("mayo", 10.22); //eklenmez 4 elemeanlı bir array var.

        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, BreakRollType.NORMAL);

        healthyBurger.add("Egg", 5.43);

        healthyBurger.add("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger(new Drink(DrinkTypes.AYRAN), new Cips(CipsTypes.SPICY));

        db.add("Should not do this", 50.53);

        db.itemizeHamburger();
    }
}