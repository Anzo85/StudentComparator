package ua.org.anzo;


public class City {
    private String name;
    private int polulation;


    public City(String name, int pululation) {
        this.name = name;
        this.polulation = pululation;
    }

    public String getName() {
        return name;
    }

    public int getPululation() {
        return polulation;
    }
}
