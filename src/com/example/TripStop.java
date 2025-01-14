package com.example;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TripStop {
    String name;
    String description;
    String address;
    LocalDate visitDate;

    public TripStop(String name, String description, String address, int day, int month, int year) throws IllegalArgumentException{
        LocalDate temp = LocalDate.of(year, month,day);
        if ( !name.isEmpty() && !description.isEmpty() && !address.isEmpty() && temp.isAfter(LocalDate.now())) {
            this.name = name;
            this.description = description;
            this.address = address;
            this.visitDate = temp;
        }
        else {
            System.out.println(("Invalid trip details provided. Ensure fields are not blank and date is in the future."));
        }

    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Destination: " + name + ", description: " + description + ", address: " + address + " , visit date: " + visitDate.format(formatter);
    }

    public void setVisitDate(int day, int month, int year) throws DateTimeException {
        LocalDate visitDate = LocalDate.of(year, month, day);
        if (visitDate.isBefore(LocalDate.now())){
            System.out.println("Visit date cannot be in the past.");
        }
        else {
            this.visitDate = visitDate;
        }

    }


}