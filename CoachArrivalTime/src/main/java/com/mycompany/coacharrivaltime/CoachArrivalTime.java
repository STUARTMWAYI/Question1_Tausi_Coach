/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coacharrivaltime;

/**
 *
 * @author stuart
 */
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CoachArrivalTime {

    public static void main(String[] args) {
        // Define constants
        int totalDistance = 10000; // Total distance from Kabale to Kampala in km
        double speedInMetersPerSecond = 225.5; // Speed of the coach in meters per second

        // Convert speed to kilometers per hour
        double speedInKmPerHour = speedInMetersPerSecond * 3.6;

        // Calculate the travel time in hours
        double travelTimeInHours = totalDistance / speedInKmPerHour;

        // Define the start time of the journey (09:00 hrs)
        LocalTime startTime = LocalTime.of(9, 0); // 09:00 hrs

        // Calculate the arrival time by adding the travel time to the start time
        LocalTime arrivalTime = startTime.plusMinutes((long) (travelTimeInHours * 60));

        // Format the arrival time for display
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // Display the results
        System.out.println("The coach will arrive in Kampala at approximately: " + arrivalTime.format(formatter));
    }
}

