import org.example.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {
    @Test
    public void carTurnsOnWhenItHasBatteryAndFuel(){
        Car car = new Car(20,50,50,0.8f);

        boolean result = car.turnOn();
        assertTrue(result);

    }

    @Test
    public void carDoesntTurnsOnWhenItHasBatteryAndNoFuel(){
        Car car = new Car(20,0,50,0.8f);

        boolean result = car.turnOn();
        assertFalse(result);

    }


    @Test
    public void carDoesntTurnsOnWhenItHasNoBatteryAndFuel(){
        Car car = new Car(0,20,50,0.8f);

        boolean result = car.turnOn();
        assertFalse(result);

    }

    @Test
    public void carDoesntTurnsOnWhenItHasNoBatteryAndNoFuel(){
        Car car = new Car(0,0,50,0.8f);

        boolean result = car.turnOn();
        assertFalse(result);

    }
    @Test
    public void carHasMoreFuelWhenReffuled(){
        Car car = new Car(20,0,50,0.8f);

        boolean result = car.refuel(30);
        assertTrue(result);
    }













//    @Test
//    public void canIReachDestination(){
//        Car car = new Car(20,50,50,10);
//
//        boolean result = car.drive(100);
//        assertTrue(result);
//    }




}
