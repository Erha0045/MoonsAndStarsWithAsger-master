package KEA;

import java.util.ArrayList;
import java.util.List;

public class SystemLogic {
private List<Planet> listOfPlanet = new ArrayList<Planet>();

    public void orbitsAround(Planet planet) {

    }
    public void run(){
        List<Planet> listOfPlanets = new ArrayList<>();
        Planet mercury = new Planet("Mercury", 330000, 0, 58, 150);
        Planet venus = new Planet("Venus", 4000000, 0, 108 , 200);
        Planet earth = new Planet("Earth", 5000000,1, 150, 365);
        Planet mars = new Planet("Mars", 3500000,2, 228, 700);
        listOfPlanets.add(mercury);
        listOfPlanets.add(venus);
        listOfPlanets.add(mars);
        listOfPlanets.add(earth);
        Moon moon = new Moon("Moon", 60000, earth, 27);
        Moon deimos = new Moon("Deimos", 60000, mars, 1.26 );
        Moon phobos = new Moon("Phobos", 60000, mars, 7.65);

        System.out.println(listOfPlanets);
    }


}
