package test;

import enums.Continents;
import enums.Days;

/**
 *
 * @author augusto
 */
public class EnumsTest {
    public static void main(String[] args) {
        //System.out.println("Day 1: " + Days.MONDAY);
        //dayOfTheWeek(Days.WEDNESDAY);
        
        
        for(int i = 0; i < Continents.values().length; i++) {
            System.out.println(i+1 + "th Continent: " + Continents.values()[i]
                + "\nCountries total = " + Continents.values()[i].getCountries()
                + "\nPopulation total = " + Continents.values()[i].getPopulation());
        }
    }
    
    private static void dayOfTheWeek(Days days) {
        switch (days) {
            case MONDAY:
                System.out.println("1st day");
                break;
            case TUESDAY:
                System.out.println("2nd day");
                break;
            case WEDNESDAY:
                System.out.println("3rd day");
                break;
            case THURSDAY:
                System.out.println("4th day");
                break;
            case FRIDAY:
                System.out.println("5th day");
                break;
            case SATURDAY:
                System.out.println("6th day");
                break;
            case SUNDAY:
                System.out.println("7th day");
                break;
            default:
                throw new AssertionError();
        }
    }
}
