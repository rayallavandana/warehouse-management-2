package rit.sse.ptp;

import java.util.Scanner;

public class Main {
    public static final int ADDING_COMPUTER = 1;
    public static final int REMOVING_COMPUTER = 2;
    public static final int DISPLAY_ALL_COMPUTERS = 4;
    public static final int PRICES_OF_ALL_COMPUTERS = 5;
    public static final int SQRT_PRICES = 6;
    public static final int POWER2_PRICES = 7;
    public static final int CLOSE_APPLICATION = 8;

    public static void main(String[] args) {
        int selectedMenu;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter maximum number of spaces available to store computers: ");
        int maxSpaces = input.nextInt();
        Shelf shelf = new Shelf(maxSpaces);
        do {
            DisplayMenu menuDisplay=new DisplayMenu();
            menuDisplay.execute();
            System.out.println();
            System.out.println("enter your choice of menu item number:");
            selectedMenu = input.nextInt();
            switch (selectedMenu) {
                case ADDING_COMPUTER:
                    System.out.println("which position you want to add the computer");
                    int positionToAdd = input.nextInt();
                    DetailsOfComputerReader computerDetails=new DetailsOfComputerReader();
                    computerDetails.execute(shelf, positionToAdd);
                    System.out.println("successfully added!");
                    break;
                case REMOVING_COMPUTER:
                    System.out.println("Enter position of the computer to remove");
                    int position = input.nextInt();
                    shelf.removeComputer(position);
                    System.out.println("successfully removed!");
                    break;
                case 3:
                    System.out.println("Enter the search element : ");
                    String search = input.next();
                    shelf.filterComputers(search, shelf);
                    break;
                case DISPLAY_ALL_COMPUTERS:
                    shelf.displayComputers();
                    System.out.println();
                    break;
                case PRICES_OF_ALL_COMPUTERS:
                    shelf.priceOfComputer(shelf);
                    break;
                case SQRT_PRICES:
                    shelf.sqrt(shelf);
                    break;
                case POWER2_PRICES:
                    shelf.powerOf2(shelf);
                    break;
                case CLOSE_APPLICATION:
                    break;
                default:
                    System.out.println("The menu you entered is not available,please enter the available menu.");
            }
        } while (selectedMenu != CLOSE_APPLICATION);
    }
}






