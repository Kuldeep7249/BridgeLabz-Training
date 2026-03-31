import java.util.*;

public class UnitConvertor {

    public static double kilometersToMiles(double kilometers) {
        double km2miles = 0.621371;
        return kilometers * km2miles;
    }

    public static double milesToKilometers(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double metersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double feetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        double value = r.nextDouble();

        System.out.println("Kilometers to Miles: " + kilometersToMiles(value));
        System.out.println("Miles to Kilometers: " + milesToKilometers(value));
        System.out.println("Meters to Feet: " + metersToFeet(value));
        System.out.println("Feet to Meters: " + feetToMeters(value));
        System.out.println("Yards to Feet: " + convertYardsToFeet(value));
        System.out.println("Feet to Yards: " + convertFeetToYards(value));
        System.out.println("Meters to Inches: " + convertMetersToInches(value));
        System.out.println("Inches to Meters: " + convertInchesToMeters(value));
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(value));
        System.out.println("Fahrenheit to Celsius: " + convertFarhenheitToCelsius(value));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFarhenheit(value));
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(value));
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(value));
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(value));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(value));
    }
}
