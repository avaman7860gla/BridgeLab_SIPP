package com.gla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Flight{
	int flightId;
	String destination;
	String time;
	
	Flight(int flightId, String destination, String time){
		this.flightId=flightId;
		this.destination=destination;
		this.time=time;
	}
	
	public String toString() {
		return "flightId : "+flightId+" destination : "+destination+" time : "+time;
	}
}

class Booking{
	Flight flight;
	String passName;
	
	Booking(Flight flight, String passName){
		this.flight=flight;
		this.passName=passName;
	}
	
	public String toString() {
		return passName+" : "+flight.toString();
	}
}

public class FlightBookingSystem {
	
	static Flight[] flights= {
			new Flight(100,"delhi","10:00"),
			new Flight(101,"mumbai","12:00"),
			new Flight(100,"banglore","15:00")
			};
	
	static List<Booking> bookings=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	
	public static void searchFlight(String destination) {
		System.out.println("Available flights to " + destination + ":");
		for(Flight flight:flights) {
			if(flight.destination.equalsIgnoreCase(destination)) {
				System.out.println(flight);
			}
		}
	}
	
	public static void bookFlight(int flightId, String passengerName) {
        for (Flight flight : flights) {
            if (flight.flightId == flightId) {
                bookings.add(new Booking(flight, passengerName));
                System.out.println("Booking successful!");
                return;
            }
        }
        System.out.println("Flight ID not found.");
    }
	
	
	public static void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }
	
	public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Flight Booking System ---");
            System.out.println("1. Search Flight");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter destination to search: ");
                    String dest = sc.nextLine();
                    searchFlight(dest);
                    break;
                case 2:
                    System.out.print("Enter Flight ID to book: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();
                    bookFlight(id, name);
                    break;
                case 3:
                    displayBookings();
                    break;
                case 4:
                    System.out.println("Thank you for using the system!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
	}
}
