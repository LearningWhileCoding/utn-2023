package enums;

/**
 *
 * @author augusto
 */
public enum Continents {
    AFRICA(54, "1.3 B."),
    ASIA(49, "4.6 B."), 
    EUROPE(44, "750 M."),
    AMERICA(35, "1.01 B"),
    OCEANIA(14, "42 M.");
    
    private final int countries;
    private final String population;
    
    Continents(int countries, String population) {
        this.countries = countries;
        this.population = population;
    }

    public int getCountries() {
        return this.countries;
    }

    public String getPopulation() {
        return this.population;
    }
    
    
    
    
}
