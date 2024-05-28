package org.lessons.calculator;

public class Ticket {

    // Attributi
    public int km;
    public int age;
    public final double SINGLE_KM_PRICE = 0.21;
    public final double  UNDER_AGE_DISCOUNT = 20;
    public final double OVER_SIXTYFIVE_DISCOUNT = 40;
    public double priceKms;
    public double finalPrice;

    // Costruttore
    public Ticket(int km, int age) {
        this.km = validateKm(km);
        this.age = validateAge(age);
    }

    // Metodo
    private int validateAge(int age){
        if (age <= 0){
            throw new IllegalArgumentException("Invalid age: " + age);
        }
        return age;
    }

    private int validateKm(int km){
        if (km <= 0){
            throw new IllegalArgumentException("Invalid km: " + km);
        }
        return km;
    }

    public double ticketCost(){
        priceKms = km * SINGLE_KM_PRICE;

        if (age < 18) {
            finalPrice = priceKms * UNDER_AGE_DISCOUNT / 100;
        } else if (age >= 65) {
            finalPrice = priceKms * OVER_SIXTYFIVE_DISCOUNT / 100;
        } else {
            finalPrice = priceKms;
        }
        return finalPrice;
    }




}
