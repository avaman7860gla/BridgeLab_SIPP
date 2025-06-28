package com.gla;

import java.util.*;

//Custom exception for invalid time format
class InvalidTimeFormatException extends Exception {
 public InvalidTimeFormatException(String message) {
     super(message);
 }
}

public class CinemaTimeManager {
 static List<String> movieTitles = new ArrayList<>();
 static List<String> movieTimes = new ArrayList<>();

 
 static void validateTime(String time) throws InvalidTimeFormatException {
     String[] parts = time.split(":");
     if (parts.length != 2) throw new InvalidTimeFormatException("Time must be in HH:MM format.");

     int hour = Integer.parseInt(parts[0]);
     int minute = Integer.parseInt(parts[1]);

     if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
         throw new InvalidTimeFormatException("Invalid time: " + time);
     }
 }

 static void addMovie(String title, String time) {
     try {
         validateTime(time);
         movieTitles.add(title);
         movieTimes.add(time);
         System.out.println("Movie added: " + title + " at " + time);
     } catch (InvalidTimeFormatException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }

 static void searchMovie(String keyword) {
     boolean found = false;
     for (int i = 0; i < movieTitles.size(); i++) {
         if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
             System.out.printf("Found: %s at %s%n", movieTitles.get(i), movieTimes.get(i));
             found = true;
         }
     }
     if (!found) System.out.println("No matching movie found.");
 }

 static void displayAllMovies() {
     System.out.println("\n--- Movie Schedule ---");
     try {
         for (int i = 0; i < movieTitles.size(); i++) {
             System.out.printf("%d. %s - %s%n", i + 1, movieTitles.get(i), movieTimes.get(i));
         }
     } catch (IndexOutOfBoundsException e) {
         System.out.println("Something went wrong while displaying movies.");
     }
 }

 static void generateReport() {
     String[] report = new String[movieTitles.size()];
     for (int i = 0; i < report.length; i++) {
         report[i] = movieTitles.get(i) + " at " + movieTimes.get(i);
     }

     System.out.println("\n--- Printable Report ---");
     for (String movie : report) {
         System.out.println(movie);
     }
 }

 public static void main(String[] args) {
     addMovie("Inception", "14:30");
     addMovie("Avengers", "25:99"); 
     addMovie("Interstellar", "18:45");

     searchMovie("aveng");
     displayAllMovies();
     generateReport();
 }
}

