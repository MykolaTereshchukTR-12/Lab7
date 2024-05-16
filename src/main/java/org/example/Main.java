package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> carsList = new ArrayList<>();
        ArrayList<Driver> driversList = new ArrayList<>();

        String[] driverNames = {"Emily", "Liam", "Sophia", "Noah", "Olivia", "Ethan", "Ava", "Jack", "Isabella", "Jacob", "Conor"};
        String[] driverNamesNew = {"Octavia", "Percival", "Seraphina", "Thaddeus", "Calliope"};
        int[] ages = {24, 32, 29, 35, 23, 30, 31, 27, 22, 37, 26};
        int[] drivingExperiences = {1, 3, 4, 2, 5, 3, 1, 4, 2, 3, 5};
        String[] models = {"Toyota", "Volkswagen Group", "Audi", "Ford", "Honda", "BMW", "Nissan", "Hyundai Motor Group", "Mercedes-Benz", "Tesla", "General Motors"};
        double[] enginePowers = {400, 200, 300, 422, 344, 234, 440, 600, 659, 435, 543};
        double[] prices = {135, 108, 113, 122, 140, 119, 129, 145, 127, 101, 148};
        String[] releaseDates = {"2011.05.23", "2012.08.14", "2010.12.05", "2014.03.17", "2013.06.29", "2015.09.10", "2010.11.02", "2012.01.19", "2014.07.28", "2013.10.08", "2013.04.14"};

        for(int i = 0; i != 11; i++){
            driversList.add(new Driver(driverNames[i], ages[i], drivingExperiences[i]));
            carsList.add(new Car(models[i], enginePowers[i], driversList.get(i).getName(), prices[i], releaseDates[i]));
            System.out.println(carsList.get(i).getModel() + " \t" + carsList.get(i).getEnginePower() + " \t" + carsList.get(i).getDriverName() +
                    " \t" + carsList.get(i).getPrice() + " \t" + carsList.get(i).getReleaseDate());
        }

        System.out.println("________________________________________________________________________________________________________________");

        for(int i = 0; i != carsList.size()/2; i++) {
            carsList.get(i).setEnginePower(carsList.get(i).caRepair(carsList.get(i).getEnginePower(), 10));
            carsList.get(i).setDriverName(driverNamesNew[i]);
            System.out.println(carsList.get(i).getModel() + " \t" + carsList.get(i).getEnginePower() + " \t" + carsList.get(i).getDriverName() +
                    " \t" + carsList.get(i).getPrice() + " \t" + carsList.get(i).getReleaseDate());
        }

        System.out.println("________________________________________________________________________________________________________________");

        for(int i = 0; i != (carsList.size() - 1); i += 2) {
            carsList.get(i).setEnginePower(carsList.get(i).caRepair(carsList.get(i).getEnginePower(), 10));
            carsList.get(i).setPrice(carsList.get(i).priceIncrease(carsList.get(i).getPrice(), 5));
            System.out.println(carsList.get(i).getModel() + " \t" + carsList.get(i).getEnginePower() + " \t" + carsList.get(i).getDriverName() +
                    " \t" + carsList.get(i).getPrice() + " \t" + carsList.get(i).getReleaseDate());
        }

        System.out.println("________________________________________________________________________________________________________________");

        for(int i = 0; i != driversList.size(); i++) {
            System.out.println(driversList.get(i).getName() + " \t" + driversList.get(i).getAge() + " \t" + driversList.get(i).getDrivingExperience());
            driversList.get(i).setDrivingExperience(driversList.get(i).courses(driversList.get(i).getAge(), driversList.get(i).getDrivingExperience()));
            System.out.println(driversList.get(i).getName() + " \t" + driversList.get(i).getAge() + " \t" + driversList.get(i).getDrivingExperience());
            System.out.println("");
        }

        System.out.println("________________________________________________________________________________________________________________");

        
    }
}