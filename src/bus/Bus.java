/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import GUI.LoginPE;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Shehab eldeen
 */
public class Bus {
   static public ArrayList<Trip> trip = new ArrayList<Trip>();
   static public ArrayList<Trip> tripAfterAssi = new ArrayList<Trip>();
   static public ArrayList<Driver> driver = new ArrayList<Driver>();
   static public ArrayList<Manager> manager = new ArrayList<Manager>();
   static public ArrayList<Passenger> passenger = new ArrayList<Passenger>();
   
    public static void main(String[] args) throws FileNotFoundException {
        TripList thelist = new TripList();
        trip = thelist.readTrips("C:\\Users\\ABD-ELRAHMAN\\Documents\\NetBeansProjects\\BusStation\\trips.txt");
        driver = thelist.readDriver("C:\\Users\\ABD-ELRAHMAN\\Documents\\NetBeansProjects\\BusStation\\Drivers.txt");
        manager = thelist.readManager("C:\\Users\\ABD-ELRAHMAN\\Documents\\NetBeansProjects\\BusStation\\Manager.txt");
        passenger = thelist.readPassenger("C:\\Users\\ABD-ELRAHMAN\\Documents\\NetBeansProjects\\BusStation\\Passenger.txt");
        tripAfterAssi = thelist.readTrips("C:\\Users\\ABD-ELRAHMAN\\Documents\\NetBeansProjects\\BusStation\\TripsAfterassi.txt");
        LoginPE loginPE = new LoginPE();
        loginPE.setVisible(true);
    }
    
}
