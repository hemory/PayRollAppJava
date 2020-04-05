package com.company;

import javax.crypto.spec.PSource;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        PrintStaffReport staffReport = new PrintStaffReport();
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        String employeePath = "textfiles/employee.txt";
        String managerPath = "textfiles/manager.txt";
        String contractorPath = "textfiles/contractor.txt";


        System.out.println("Welcome to the Pay Roll App");

        System.out.println("Please tell us, are you a manager? [1]Yes or [2]No.");
        String amAManager = scan.nextLine();

        if (amAManager.equals("1")) {
            String viewMenuAgain;
            do {
                ViewManagerMenu(scan, staffReport, fileReaderWriter, employeePath, managerPath, contractorPath);
                System.out.println("View menu again? y or n");
                 viewMenuAgain = scan.nextLine();
            } while (viewMenuAgain.equalsIgnoreCase("y"));
            System.out.println("Goodbye");
        }

        if (amAManager.equals("2")) {
            //The no path
            fileReaderWriter.addHoursAsEmployeeOrContractor(employeePath, contractorPath);
        }

    }

    private static void ViewManagerMenu(Scanner scan, PrintStaffReport staffReport, FileReaderWriter fileReaderWriter, String employeePath, String managerPath, String contractorPath) throws IOException {
        System.out.println("Please select from the following:");
        System.out.println("[1]View List of Employees and their Pay");
        System.out.println("[2]Add Employees and their Pay");
        System.out.println("[3]Exit");
        String menuChoice = scan.nextLine();

        switch (menuChoice) {
            case "1":
                while (true){
                    System.out.println("Which Employee list would you like to see: [1]Employee [2]Manager or [3]ContractEmployee ?");
                    String managerChoice = scan.nextLine();
                    ChoiceForManagerReport(staffReport, managerChoice);

                    System.out.println("Would you like to view another report? Enter [y] to continue or press ENTER to go back to Main Menu.");
                    String viewAnotherReport = scan.nextLine();

                    if (!viewAnotherReport.equals("y")){
                        break;
                    }
                }
                break;
            case "2":
                while (true) {
                    System.out.println("Are you adding for [1]Employee/Contractor [2]Manager?");
                    String managerChoice = scan.nextLine();

                    AddStaffOrManagerHoursMenu(fileReaderWriter, employeePath, managerPath, contractorPath, managerChoice);

                    System.out.println("Would you like to add another? Enter [y] to continue or press ENTER to go back to the Main Menu.");
                    String addAnother = scan.nextLine();

                    if (!addAnother.equals("y")){
                        break;
                    }
                }
                break;
            case "3":
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Please choose a valid option");
                break;
        }
    }

    private static void AddStaffOrManagerHoursMenu(FileReaderWriter fileReaderWriter, String employeePath, String managerPath, String contractorPath, String managerChoice) {
        switch (managerChoice) {
            case "1":
                fileReaderWriter.addHoursAsEmployeeOrContractor(employeePath, contractorPath);
                break;
            case "2":
                fileReaderWriter.addHoursAsManager(managerPath);
                break;
            default:
                System.out.println("Please choose a valid option");
                break;
        }
    }


    private static void ChoiceForManagerReport(PrintStaffReport staffReport, String managerChoice) throws
            IOException {
        switch (managerChoice) {
            case "1":
                staffReport.PrintEmployeeReport();
                break;
            case "2":
                staffReport.PrintManagerReport();
                break;

            case "3":
                staffReport.PrintContractorReport();
                break;

            default:
                System.out.println("Please choose a valid option");
                break;
        }
    }

}



