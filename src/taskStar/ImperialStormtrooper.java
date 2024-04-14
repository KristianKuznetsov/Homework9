package taskStar;

import java.util.Random;

public class ImperialStormtrooper implements Cloneable {
    private final String name = "Джанго Фетт";

    public ImperialStormtrooper() {
    }

    public String getName() {
        return name;
    }

    public void shoot() {
        if (Math.random() > 0.02) {
            System.out.println("Черт опять промахнулся...");
        } else {
            System.out.println("УРА Я ПОПАЛ !!!");
        }

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

