package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReaderWriter {


    public ArrayList<Employee> getEmployees(String employeePath) throws IOException {
        FileReader fileReader = new FileReader(employeePath);
        BufferedReader br = new BufferedReader(fileReader);
        String fileLine;

        String[] arrOfStr;
        ArrayList<Employee> listOfEmps = new ArrayList<Employee>();

        //Reads from the text file and assigns the employee properties
        while ((fileLine = br.readLine()) != null) {
            Employee employee = new Employee();
            arrOfStr = fileLine.split(":");
            employee.name = arrOfStr[0];
            employee.hoursWorked = Double.parseDouble(arrOfStr[1]);
            listOfEmps.add(employee);
        }
        return listOfEmps;
    }

    public ArrayList<Manager> getManagers(String managerPath) throws IOException {
        FileReader fileReader = new FileReader(managerPath);
        BufferedReader br = new BufferedReader(fileReader);
        String fileLine;

        String[] arrOfStr;
        ArrayList<Manager> listOfManagers = new ArrayList<Manager>();

        //Reads from the text file and assigns the employee properties
        while ((fileLine = br.readLine()) != null) {
            Manager manager = new Manager();
            arrOfStr = fileLine.split(":");
            manager.name = arrOfStr[0];
            manager.hoursWorked = Double.parseDouble(arrOfStr[1]);
            listOfManagers.add(manager);
        }
        return listOfManagers;
    }

    public ArrayList<Contractor> getContractors(String contractorPath) throws IOException {
        FileReader fileReader = new FileReader(contractorPath);
        BufferedReader br = new BufferedReader(fileReader);
        String fileLine;

        String[] arrOfStr;
        ArrayList<Contractor> listOfContractors = new ArrayList<Contractor>();

        //Reads from the text file and assigns the employee properties
        while ((fileLine = br.readLine()) != null) {
            Contractor contractor = new Contractor();
            arrOfStr = fileLine.split(":");
            contractor.name = arrOfStr[0];
            contractor.hoursWorked = Double.parseDouble(arrOfStr[1]);
            listOfContractors.add(contractor);
        }
        return listOfContractors;
    }

    public void addHoursAsEmployeeOrContractor(String employeePath, String contractorPath) {
        Scanner scan = new Scanner(System.in);

        System.out.println("[1]contractor or [2]employee?");
        String contractorOrEmployee = scan.nextLine();
        String path = "";
        if (contractorOrEmployee.equals("1")) {
            path = employeePath;
        } else if (contractorOrEmployee.equals("2")) {
            path = contractorPath;
        }

        System.out.println("First Name?");
        String firstName = scan.nextLine();

        System.out.println("Number of Hours Worked");
        String hours = scan.nextLine();

        try {
            FileWriter writer = new FileWriter(path, true);
            PrintWriter printer = new PrintWriter(writer);
            printer.println(firstName + ":" + hours);
            System.out.println("Hours added...");
            writer.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void addHoursAsManager(String managerPath) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First Name");
        String firstName = scan.nextLine();

        System.out.println("Number of Hours Worked");
        String hours = scan.nextLine();

        try {
            FileWriter writer = new FileWriter(managerPath, true);
            PrintWriter printer = new PrintWriter(writer);
            printer.println(firstName + ":" + hours);
            System.out.println("Hours added...");
            writer.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void addStaffHoursAsManager(String contractorPath, String employeePath, String managerPath) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Would you like to add hours for a [1]employee/contractor or [2]manager?");
            String staffChoice = scan.nextLine();

            switch (staffChoice) {
                case "1":
                    addHoursAsEmployeeOrContractor(employeePath, contractorPath);
                    break;
                case "2":
                    addHoursAsManager(managerPath);
                    break;
                default:
                    System.out.println("Please enter a valid choice.");
                    break;
            }

            System.out.println("Would you like to add another? y or n");
            String choiceToAddAnother = scan.nextLine();

            if (!choiceToAddAnother.equalsIgnoreCase("y")) {
                break;
            } else {
                System.out.println("Goodbye...");
            }
        }

    }

}
