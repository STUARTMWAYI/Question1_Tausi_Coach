/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tausicoachtraveltime;

/**
 *
 * @author stuart
 */
public class TausiCoachTravelTime {

    public static void main(String[] args) {
        // Define the constants
        int totalDistance = 10000; // Total distance from Kampala to Kabale in km
        int speed = 250; // Speed of the train in km/hr
        int timePerStop = 5; // Time spent at each stop in minutes

        // Calculate the number of stops
        int passengerStopDistance = 150; // Distance between passenger stops in km
        int refuelStopDistance = 200; // Distance between refueling stops in km

        // Calculate the number of passenger stops and refueling stops
        int passengerStops = totalDistance / passengerStopDistance;
        int refuelStops = totalDistance / refuelStopDistance;

        // Calculate the number of common stops
        int commonStops = commonStops(totalDistance, passengerStopDistance, refuelStopDistance);

        // Calculate the total number of stops (subtract common stops to avoid double counting)
        int totalStops = passengerStops + refuelStops - commonStops;

        // Calculate the travel time in hours
        double travelTime = (double) totalDistance / speed;

        // Convert the travel time to minutes
        double travelTimeInMinutes = travelTime * 60;

        // Calculate the total stop time in minutes
        int totalStopTime = totalStops * timePerStop;

        // Calculate the total time (travel time + stop time) in minutes
        double totalTime = travelTimeInMinutes + totalStopTime;

        // Convert total time to hours and minutes
        int hours = (int) totalTime / 60;
        int minutes = (int) totalTime % 60;

        // Display the results
        System.out.println("The Tausi Coach will make a total of " + totalStops + " stops during the trip.");
        System.out.println("Total travel time (including stops): " + hours + " hours and " + minutes + " minutes.");
    }

    // Method to calculate the common stops where the coach stops for both passengers and refueling
    public static int commonStops(int totalDistance, int passengerStopDistance, int refuelStopDistance) {
        // Find the least common multiple (LCM) of the two stop distances
        int lcm = lcm(passengerStopDistance, refuelStopDistance);

        // Calculate the number of common stops
        return totalDistance / lcm;
    }

    // Method to calculate the greatest common divisor (GCD) using Euclid's algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to calculate the least common multiple (LCM) using GCD
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}

