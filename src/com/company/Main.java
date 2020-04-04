package com.company;

import javax.crypto.spec.PSource;
import java.io.*;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        PrintStaffReport staffReport = new PrintStaffReport();

        staffReport.PrintEmployeeReport();
        staffReport.PrintContractorReport();
        staffReport.PrintManagerReport();




//
//        FileReaderWriter fileReaderWriter = new FileReaderWriter();
//        PrintStaffReport staffReport = new PrintStaffReport();
//        string employeePath = @"C:\Users\hphif\source\repos\PayRollApp\PayRollApp\PayrollApp\text_files\employee.txt";
//        string managerPath = @"C:\Users\hphif\source\repos\PayRollApp\PayRollApp\PayrollApp\text_files\manager.txt";
//        string contractorPath = @"C:\Users\hphif\source\repos\PayRollApp\PayRollApp\PayrollApp\text_files\contractor.txt";
//
//
//        while (true)
//        {
//            Console.WriteLine("Welcome to the Employee App");
//            Thread.Sleep(1000);
//
//            Console.WriteLine("Please tell us are you a manager? Enter [1]Yes or [2]No");
//            string amAManager = Console.ReadLine();
//
//            if (amAManager == "1")
//            {
//                Console.WriteLine("Please select from the following:");
//                Console.WriteLine("[1]View List of Employees and their Pay");
//                Console.WriteLine("[2]Add Employees and their Pay");
//                Console.WriteLine("[3]Exit");
//                string menuChoice = Console.ReadLine();
//                Console.Clear();
//
//                if (menuChoice == "3")
//                {
//                    Console.WriteLine("Goodbye");
//                    break;
//                }
//
//                ManagerMenu(staffReport, fileReaderWriter, employeePath, managerPath, contractorPath, menuChoice);
//
//            }
//            else if (amAManager == "2")
//            {
//                Console.WriteLine("Please select from the following:");
//                Console.WriteLine("[1]Add your name and your pay");
//                Console.WriteLine("[2]Exit");
//                string menuChoice = Console.ReadLine();
//                Console.Clear();
//
//                if (menuChoice == "2")
//                {
//                    Console.WriteLine("Goodbye");
//                    break;
//                }
//
//                EmployeeMenu(menuChoice, fileReaderWriter, employeePath, managerPath, contractorPath);
//
//            }
//            else
//            {
//                Console.WriteLine("Please enter a valid choice");
//            }
//
//
//            Console.WriteLine("Press enter to END the program");
//            Console.ReadLine();
//            Console.Clear();
//
//        }
//
//
//    }
//
//    private static void EmployeeMenu(string menuChoice, FileReaderWriter fileReaderWriter, string employeePath,
//                                     string managerPath, string contractorPath)
//    {
//        switch (menuChoice)
//        {
//            case "1":
//                Console.WriteLine("Are you a [1]Employee or [2]ContractEmployee ?");
//                string userChoice = Console.ReadLine();
//
//                ChooseEmployeeOrContractor(fileReaderWriter, employeePath, contractorPath, userChoice);
//                break;
//            default:
//                Console.WriteLine("Please choose a valid option");
//                break;
//        }
//    }
//
//    private static void ChooseEmployeeOrContractor(FileReaderWriter fileReaderWriter, string employeePath,
//                                                   string contractorPath, string userChoice)
//    {
//        switch (userChoice)
//        {
//            case "1":
//                fileReaderWriter.AddHoursAsEmployee(employeePath);
//                break;
//            case "2":
//                fileReaderWriter.AddContractorHoursAsManager(contractorPath);
//                break;
//            default:
//                Console.WriteLine("Please choose a valid option");
//                break;
//        }
//    }
//
//    private static void ManagerMenu(PrintStaffReport staffReport, FileReaderWriter fileReaderWriter, string employeePath,
//                                    string managerPath, string contractorPath, string menuChoice)
//    {
//        switch (menuChoice)
//        {
//            case "1":
//                EmployeeCheckReadSummary(staffReport);
//                break;
//            case "2":
//                AddEmployeeChoiceMenu(fileReaderWriter, employeePath, managerPath, contractorPath);
//                break;
//            default:
//                Console.WriteLine("Please choose a valid option");
//                break;
//        }
//    }
//
//    private static void EmployeeCheckReadSummary(PrintStaffReport staffReport)
//    {
//        Console.WriteLine("Which Employee list would you like to see: [1]Employee [2]Manager or [3]ContractEmployee ?");
//        string userChoice = Console.ReadLine();
//
//        switch (userChoice)
//        {
//            case "1":
//                staffReport.PrintEmployeeCheck();
//                break;
//            case "2":
//                staffReport.PrintManagerCheck();
//                break;
//
//            case "3":
//                staffReport.PrintContractorCheck();
//                break;
//
//            default:
//                Console.WriteLine("Please choose a valid option");
//
//                break;
//        }
//    }
//
//    private static void AddEmployeeChoiceMenu(FileReaderWriter fileReaderWriter, string employeePath, string managerPath,
//                                              string contractorPath)
//    {
//        Console.WriteLine("Are you adding for [1]Employee [2]Manager or [3]ContractEmployee ?");
//        string userChoice = Console.ReadLine();
//
//        switch (userChoice)
//        {
//            case "1":
//                fileReaderWriter.AddEmployeeHoursAsManager(employeePath);
//                break;
//            case "2":
//                fileReaderWriter.AddManagerHoursAsManager(managerPath);
//                break;
//
//            case "3":
//                fileReaderWriter.AddContractorHoursAsManager(contractorPath);
//                break;
//
//            default:
//                Console.WriteLine("Please choose a valid option");
//                break;
        }





    }



}
