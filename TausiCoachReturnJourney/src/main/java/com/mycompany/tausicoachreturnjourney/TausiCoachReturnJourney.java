/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tausicoachreturnjourney;

/**
 *
 * @author stuart
 */
public class TausiCoachReturnJourney {

    public static void main(String[] args) {
        // Define constants
        int totalDistance = 10000; // Total distance from Kabale to Kampala in km
        int speed = 250; // Speed of the train in km/hr
        int timePerStop = 5; // Time spent at each stop in minutes
        int refuelStopDistance = 200; // Distance between refueling stops in km

        // Calculate the number of refueling stops
        int refuelStops = totalDistance / refuelStopDistance;

        // Calculate the travel time in hours
        double travelTime = (double) totalDistance / speed;

        // Convert the travel time to minutes
        double travelTimeInMinutes = travelTime * 60;

        // Calculate the total stop time in minutes
        int totalStopTime = refuelStops * timePerStop;

        // Calculate the total time (travel time + stop time) in minutes
        double totalTime = travelTimeInMinutes + totalStopTime;

        // Convert total time to hours and minutes
        int hours = (int) totalTime / 60;
        int minutes = (int) totalTime % 60;

        // Display the results
        System.out.println("The Tausi Coach will make a total of " + refuelStops + " stops during the return journey.");
        System.out.println("Total travel time (including stops): " + hours + " hours and " + minutes + " minutes.");
    }
}

