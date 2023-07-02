package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Driver> drivers= new ArrayList<Driver>();

    public void add(Driver driver) {
        drivers.add(driver);
    }
    public void remove(Driver driver) {
        drivers.remove(driver);
    }

    public void competition(){
        System.out.println("Drivers are coming...");

        for (Driver driver: drivers) {
            driver.racing();
        }
    }
}
