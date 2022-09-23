package rit.sse.ptp;

import java.util.Scanner;

public class DetailsOfComputerReader {
    public void execute(Shelf shelf, int positionToAdd) {
        Scanner input = new Scanner(System.in);
        Computer computer = new Computer();
        System.out.println("enter the BrandName : ");
        computer.setBrandName(input.next());
        System.out.println("Enter the Model Name : ");
        computer.setModelName(input.next());
        System.out.println("Enter the  Hard Drive Capacity : ");
        computer.setHardDriveCapacity(input.nextInt());
        System.out.println("Enter Memory : ");
        computer.setMemory(input.nextInt());
        System.out.println("Enter Cpu speed : ");
        computer.setCpuSpeed(input.nextFloat());
        System.out.println("Enter Price : ");
        computer.setPrice(input.nextFloat());
        shelf.addComputer(positionToAdd, computer);
    }
}
