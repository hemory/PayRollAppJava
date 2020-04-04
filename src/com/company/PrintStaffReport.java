package com.company;

import java.io.IOException;

public class PrintStaffReport {


        private String employeePath = "textfiles/employee.txt";
        private String managerPath = "textfiles/manager.txt";
        private String contractorPath = "textfiles/contractor.txt";

        FileReaderWriter fileReaderWriter = new FileReaderWriter();


        public void PrintEmployeeReport() throws IOException {
            var employeeList = fileReaderWriter.getEmployees(employeePath);

            for (var employee : employeeList) {
                System.out.println(employee.name + " will earn " + "$"+ employee.CalculateTotalPay() + " this pay period.");
            }

        }

    public void PrintContractorReport() throws IOException {
        var contractorList = fileReaderWriter.getContractors(contractorPath);

        for (var contractor : contractorList) {
            System.out.println(contractor.name + " will earn " + "$"+ contractor.CalculateTotalPay() + " this pay period.");
        }

    }

    public void PrintManagerReport() throws IOException {
        var managerList = fileReaderWriter.getManagers(managerPath);

        for (var manager : managerList) {
            System.out.println(manager.name + " will earn " + "$"+ manager.CalculateTotalPay() + " this pay period.");
        }

    }


    }
