package rit.sse.ptp;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math.*;

public class Shelf {

    private Computer[] Computers;

    public Shelf(int maxSpaces) {
        Computers = new Computer[maxSpaces];
    }

    public void addComputer(int position, Computer computer) {
        this.Computers[position] = computer;
    }

    public Computer getComputerAtPosition(int position) {
        return this.Computers[position];
    }

    public void displayComputers() {
        System.out.println("Here is the list of all Computers:");
        for (int currentComputer = 0; currentComputer < Computers.length; currentComputer++) {
            if (Computers[currentComputer] != null) {
                System.out.println("position " + " " + currentComputer + ":" + getComputerAtPosition(currentComputer));
            } else {
                System.out.printf("Position  %d: empty", currentComputer);
                System.out.println();
            }
        }
    }

    public void removeComputer(int position) {
        Computers[position] = null;
    }

    public void filterComputers(String search, Shelf shelf) {
        System.out.println("Here is list of Computers after filtering:");
        for (int positionOfCurrentComputer = 0; positionOfCurrentComputer < Computers.length; positionOfCurrentComputer++) {
            Computer computer = Computers[positionOfCurrentComputer];
            if (shelf.Computers[positionOfCurrentComputer] != null) {
                if (brandNameContains(computer, search) || modelNameContains(computer, search)) {
                    System.out.printf("position " + " " + positionOfCurrentComputer + ":" + getComputerAtPosition(positionOfCurrentComputer));
                    System.out.println();
                }
            }
        }
    }

    private boolean brandNameContains(Computer currentComputer, String search) {
        return currentComputer.getBrandName().toUpperCase().contains(search.toUpperCase());
    }

    private boolean modelNameContains(Computer currentComputer, String search) {
        return currentComputer.getModelName().toUpperCase().contains(search.toUpperCase());
    }

    public void priceOfComputer(Shelf shelf) {
        System.out.println("Here is list of prices of all computers:");
        for (int currentComputer = 0; currentComputer < Computers.length; currentComputer++) {
            if (shelf.Computers[currentComputer] != null) {
                System.out.printf("position %d: Price : %.2f", currentComputer, Computers[currentComputer].getPrice());
                System.out.println();
            } else {
                System.out.printf("Position  %d: empty", currentComputer);
                System.out.println();
            }
        }
    }

    public void sqrt(Shelf shelf) {
        System.out.println("price list for the square root customers:");
        for (int currentComputer = 0; currentComputer < Computers.length; currentComputer++) {
            if (shelf.Computers[currentComputer] != null)
                System.out.println(Math.sqrt(Computers[currentComputer].getPrice()));
            else
                System.out.println("Empty");
        }

    }

    public void powerOf2(Shelf shelf) {
        System.out.println("price list for the power 2 customers:");
        for (int i = 0; i < Computers.length; i++) {
            if (shelf.Computers[i] != null)
                System.out.println(Math.pow(Computers[i].getPrice(), 2));
            else
                System.out.println("Empty");
        }
    }
}











