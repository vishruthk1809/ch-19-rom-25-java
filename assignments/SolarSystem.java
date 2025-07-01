class SolarSystem{
    static int systemId = 1301;
    static int numberOfPlanets = 8;
    static int numberOfDwarfPlanets = 5;
    static int numberOfMoons = 200;
    static String centralStar = "Sun";
    static double sunMass = 1.989e30;
    static boolean hasAsteroidBelt = true;
    static boolean hasKuiperBelt = true;
    static double ageBillionYears = 4.6;
    static boolean containsEarth = true;
    static boolean supportsLife = true;
    static boolean hasComets = true;
    static boolean hasMeteoroids = true;
    static boolean heliospherePresent = true;
    static String largestPlanet = "Jupiter";
    static String smallestPlanet = "Mercury";
    static boolean sunIsMainSourceOfEnergy = true;
    static boolean gravitationallyBound = true;
    static boolean hasOortCloud = true;
    static boolean isPartOfMilkyWay = true;

   public static void main(String SolarSystem[]) {
        System.out.println("The Solar System ID is "+ systemId);
        System.out.println("The Number of Planets are "+ numberOfPlanets);
        System.out.println("Number of Dwarf Planets "+ numberOfDwarfPlanets);
        System.out.println("Number of Moons "+ numberOfMoons);
        System.out.println("Central Star "+ centralStar);
        System.out.println("Sun Mass (kg) "+ sunMass);
        System.out.println("Has Asteroid Belt "+ hasAsteroidBelt);
        System.out.println("Has Kuiper Belt "+ hasKuiperBelt);
        System.out.println("Age (Billion Years) "+ ageBillionYears);
        System.out.println("Contains Earth "+ containsEarth);
        System.out.println("Supports Life "+ supportsLife);
        System.out.println("Has Comets "+ hasComets);
        System.out.println("Has Meteoroids "+ hasMeteoroids);
        System.out.println("Heliosphere Present "+ heliospherePresent);
        System.out.println("Largest Planet "+ largestPlanet);
        System.out.println("Smallest Planet "+ smallestPlanet);
        System.out.println("Sun is Main Energy Source "+ sunIsMainSourceOfEnergy);
        System.out.println("Gravitationally Bound "+ gravitationallyBound);
        System.out.println("Has Oort Cloud "+ hasOortCloud);
        System.out.println("Part of Milky Way "+ isPartOfMilkyWay);
    }
}
