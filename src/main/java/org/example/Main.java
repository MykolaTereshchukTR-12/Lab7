package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Car> carsList = new ArrayList<>();
        ArrayList<Driver> driversList = new ArrayList<>();
        Main main = new Main();
        HelpEr helper = new HelpEr();

        String[] driverNames = {"Emily", "Liam", "Sophia", "Noah", "Olivia", "Ethan", "Ava", "Jack", "Isabella", "Jacob", "Conor"};
        String[] driverNamesNew = {"Octavia", "Percival", "Serafina", "Thaddeus", "Calliope"};
        int[] ages = {24, 32, 29, 35, 23, 30, 31, 27, 22, 37, 26};
        int[] drivingExperiences = {1, 3, 4, 2, 5, 3, 1, 4, 2, 3, 5};
        String[] models = {"Toyota", "Volkswagen Group", "Audi", "Ford", "Honda", "BMW", "Nissan", "Hyundai Motor Group", "Mercedes-Benz", "Tesla", "General Motors"};
        double[] enginePowers = {400, 200, 300, 422, 344, 234, 440, 600, 659, 435, 543};
        double[] prices = {135, 108, 113, 122, 140, 119, 129, 145, 127, 101, 148};
        String[] releaseDates = {"2011.05.23", "2012.08.14", "2010.12.05", "2014.03.17", "2013.06.29", "2015.09.10", "2010.11.02", "2012.01.19", "2014.07.28", "2013.10.08", "2013.04.14"};

        //Start the program:
        System.out.println("\n=) Hello! This is a program that performs the tasks of laboratory work in the discipline \"Object Oriented Programming\". " +
                "Let's start work!!!)");
        System.out.println(main.help());

        //Initialization of the eternal cycle
        while (true) {
            //Switch() declarations for different application modes for Task_1
            switch (main.controlSYS()) {
                //Exit the loop and the program as a whole
                case ("0"): {
                    System.out.println("Before meeting!");
                    System.exit(0);
                }

                //Task 1.
                case ("1"): {
                    for (int i = 0; i != 11; i++) {
                        driversList.add(new Driver(driverNames[i], ages[i], drivingExperiences[i]));
                        carsList.add(new Car(models[i], enginePowers[i], driversList.get(i).getName(), prices[i], releaseDates[i]));
                        System.out.println(carsList.get(i).getModel() + " \t" + carsList.get(i).getEnginePower() + " \t" + carsList.get(i).getDriverName() +
                                " \t" + carsList.get(i).getPrice() + " \t" + carsList.get(i).getReleaseDate());
                    }
                    System.out.println("________________________________________________________________________________________________________________");
                    //break;
                }

                //Task 2.
                case ("2"): {
                    for (int i = 0; i != carsList.size() / 2; i++) {
                        carsList.get(i).setEnginePower(carsList.get(i).caRepair(carsList.get(i).getEnginePower(), 10));
                        carsList.get(i).setDriverName(driverNamesNew[i]);
                        System.out.println(carsList.get(i).getModel() + " \t" + carsList.get(i).getEnginePower() + " \t" + carsList.get(i).getDriverName() +
                                " \t" + carsList.get(i).getPrice() + " \t" + carsList.get(i).getReleaseDate());
                    }
                    System.out.println("________________________________________________________________________________________________________________");
                    break;
                }

                //Task 3.
                case ("3"): {
                    for (int i = 0; i != (carsList.size() - 1); i += 2) {
                        carsList.get(i).setEnginePower(carsList.get(i).caRepair(carsList.get(i).getEnginePower(), 10));
                        carsList.get(i).setPrice(carsList.get(i).priceIncrease(carsList.get(i).getPrice(), 5));
                        System.out.println(carsList.get(i).getModel() + " \t" + carsList.get(i).getEnginePower() + " \t" + carsList.get(i).getDriverName() +
                                " \t" + carsList.get(i).getPrice() + " \t" + carsList.get(i).getReleaseDate());
                    }
                    System.out.println("________________________________________________________________________________________________________________");
                    break;
                }

                //Task 4.
                case ("4"): {
                    for (int i = 0; i != driversList.size(); i++) {
                        System.out.println(driversList.get(i).getName() + " \t" + driversList.get(i).getAge() + " \t" + driversList.get(i).getDrivingExperience());
                        driversList.get(i).setDrivingExperience(driversList.get(i).courses(driversList.get(i).getAge(), driversList.get(i).getDrivingExperience()));
                        System.out.println(driversList.get(i).getName() + " \t" + driversList.get(i).getAge() + " \t" + driversList.get(i).getDrivingExperience());
                        System.out.println("");
                    }
                    System.out.println("________________________________________________________________________________________________________________");
                    break;
                }

                //Task 5.
                case ("5"): {
                    Car BOS = helper.getRandomCar(carsList);
                    System.out.println(helper.leftDriver(BOS));
                    System.out.println(helper.destination(BOS));
                    System.out.println("________________________________________________________________________________________________________________");
                    break;
                }

                //Help block
                case ("6"): {
                    System.out.println("The essence of the program:");
                    System.out.println(main.help());
                    break;
                }

                //In case of error or unforeseen situations.
                default: {
                    System.out.println("Please follow the instructions and be careful when working with this program.");
                    System.out.println(main.help());
                    break;
                }
            }
        }
    }

    //A block that controls and accompanies the program.
    public String controlSYS() {
        String _control = "0";
        try {
            _control = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("Please follow the instructions and be careful when working with this program!!!");
            _control = "6";
        }
        return _control;
    }

    //Instruction
    public String help() {
        return """
                Enter 1 to display the result of task 1;\s
                Enter 2 to display the result of task 2;\s
                Enter 3 to display the result of task 3;\s
                Enter 4 to display the result of task 4;\s
                Enter 5 to display the result of task 5;\s
                Enter 0 to exit the program.""";
    }
}