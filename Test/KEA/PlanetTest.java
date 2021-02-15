package KEA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {


    Planet earth = new Planet("Earth", 5000000,1, 150, 365);
//    Planet mars = new Planet("Mars", 3500000,2, 228, 700);

    @Test
    void NumberOfMoons() {
        //arrange
        int exp = 1;
        //act
        int result = earth.getNumberOfMoons();
        //assert
        assertEquals(exp,result);
    }

    @Test
    void DistanceToSun() {
        //arrange
        int exp = 150;
        //act
        long result = earth.getDistanceToSun();
        //assert
        assertEquals(exp,result);
    }

    @Test
    void TimeToOrbitSun() {
        //arrange
        int exp = 365;
        //act
        long result = earth.getTimeToOrbitSun();
        //assert
        assertEquals(exp,result);
    }
}