package KEA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {

    Planet earth;
    Moon moon = new Moon("Moon", 60000, earth, 27);



    @Test
    public void name() {
        //arrange
        String exp = "Moon";
        //act
        String result = moon.getName();
        //assert
        assertEquals(exp,result,"Test af name er ikke gennemført");
    }
    @Test
    public void mass() {
        //arrange
        int exp = 60000;
        //act
        int result = moon.getMasse();
        //assert
        assertEquals(exp,result,"Test af massen er ikke gennemført");
    }

    @Test
    public void timeToOrbitPlanet() {
        //arrange
        double exp = 27;
        //act
        double result = moon.getTimeToOrbitePlanet();
        //assert
        assertEquals(exp,result,"Test af timeToOrbitPlanet er ikke gennemført");
    }


}