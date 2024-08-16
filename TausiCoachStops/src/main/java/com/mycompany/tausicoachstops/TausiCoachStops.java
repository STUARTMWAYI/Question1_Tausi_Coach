/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tausicoachstops;

/**
 *
 * @author stuart
 */
public class TausiCoachStops {

    public static void main(String[] args) {
        // Define the total distance and stop distances
        int totalDistance = 10000; // Total distance from Kampala to Kabale
        int passengerStopDistance = 150; // Distance between passenger stops
        int refuelStopDistance = 200; // Distance between refueling stops

        // Calculate the number of stops for passengers and refueling
        int passengerStops = totalDistance / passengerStopDistance;
        int refuelStops = totalDistance / refuelStopDistance;

        // The total number of stops is the sum of passenger stops and refuel stops
        // However, every time both happen at the same place, it should count as one stop
        int totalStops = passengerStops + refuelStops - commonStops(totalDistance, passengerStopDistance, refuelStopDistance);

        // Output the results
        System.out.println("The Tausi Coach will make " + passengerStops + " stops for passengers.");
        System.out.println("The Tausi Coach will make " + refuelStops + " stops for refueling.");
        System.out.println("The Tausi Coach will make a total of " + totalStops + " stops during the trip.");
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
