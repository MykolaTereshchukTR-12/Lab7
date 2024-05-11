package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> carsList = new ArrayList<>();

        String[] models = {"Toyota", "Volkswagen Group", "Audi", "Ford", "Honda", "BMW", "Nissan", "Hyundai Motor Group", "Mercedes-Benz", "Tesla", "General Motors"};
        int[] enginePowers = {400, 200, 300, 422, 344, 234, 440, 600, 659, 435};
        String[] driverNames = {"Emily", "Liam", "Sophia", "Noah", "Olivia", "Ethan", "Ava", "Jack", "Isabella", "Jacob", "Conor"};
        int[] prices = {43, 32, 49, 30, 36, 47, 35, 45, 31, 48, 33};
        String[] releaseDates = {"2011.05.23", "2012.08.14", "2010.12.05", "2014.03.17", "2013.06.29", "2015.09.10", "2010.11.02", "2012.01.19", "2014.07.28", "2013.10.08", "2013.04.14"};

        for(int i = 0; i != 10; i++){
            carsList.add(new Car(models[i], enginePowers[i], driverNames[i], prices[i], releaseDates[i]));
        }


    }
}