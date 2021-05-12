/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TripList {
    
    
    
    
    public ArrayList<Trip> readTrips(String FilePath) throws FileNotFoundException
    {
    ArrayList<Trip> triplist = new ArrayList(); 
        
        Scanner info = null;
        try{
            info = new Scanner(new File(FilePath));
        }
        catch(FileNotFoundException e){
            System.err.println(e);
                     
    }
        while (info.hasNext())
        {
            Trip x = new Trip();
            String tr = info.nextLine();
            String[] arr = tr.split(" ");
            x.setDestination(arr[0]);
            x.setDays(Integer.parseInt(arr[1]));
            x.setWay(arr[2]);
            x.seteKind(arr[3]);
            x.setStops(arr[4]);
            x.setVeh(arr[5]);
            triplist.add(x);
            
            
        }
        return triplist;
    }
    
    
    
    
    
    
    public ArrayList<Manager> readManager(String FilePath) throws FileNotFoundException
    {
    ArrayList<Manager> triplist = new ArrayList(); 
        
        Scanner info = null;
        try{
            info = new Scanner(new File(FilePath));
        }
        catch(FileNotFoundException e){
            System.err.println(e);
                     
    }
        while (info.hasNext())
        {
            Manager x = new Manager();
            String tr = info.nextLine();
            String[] arr = tr.split(" ");
            x.setName(arr[0]);
            x.setAge(Integer.parseInt(arr[1]));
            x.setPassword(Integer.parseInt(arr[2]));
            triplist.add(x);  
        }
        return triplist;
    }
   

    
    public ArrayList<Passenger> readPassenger(String FilePath) throws FileNotFoundException
    {
    ArrayList<Passenger> triplist = new ArrayList(); 
        
        Scanner info = null;
        try{
            info = new Scanner(new File(FilePath));
        }
        catch(FileNotFoundException e){
            System.err.println(e);
                     
    }
        while (info.hasNext())
        {
            Passenger x = new Passenger();
            String tr = info.nextLine();
            String[] arr = tr.split(" ");
            x.setName(arr[0]);
            x.setAge(Integer.parseInt(arr[1]));
            x.setPassword(Integer.parseInt(arr[2]));
            triplist.add(x);  
        }
        return triplist;
    }
    
    
    
    
    public ArrayList<Driver> readDriver(String FilePath) throws FileNotFoundException
    { 
        ArrayList<Driver> driverList = new ArrayList();
        Scanner info = null;
        try{
            info = new Scanner(new File(FilePath));
        }
        catch(FileNotFoundException e){
            System.err.println(e);
                     
    }
        //readAssignedTrips("C:\\Users\\ABD-ELRAHMAN\\Documents\\NetBeansProjects\\BusStation\\DriversAssignedTrips.txt");
        while (info.hasNext())
        {   
            Driver x = new Driver();
            String tr = info.nextLine();
            String[] arr = tr.split(" ");
            x.setName(arr[0]);
            x.setAge(Integer.parseInt(arr[1]));
            x.setPassword(Integer.parseInt(arr[2]));
            if(arr[0].equals("Ali")){
            x.assignedtrip = readTrips("C:\\Users\\ABD-ELRAHMAN\\Documents\\NetBeansProjects\\BusStation\\Aliassi.txt");
            driverList.add(x);
            }
            else if(arr[0].equals("Tarek")){
            x.assignedtrip = readTrips("C:\\Users\\ABD-ELRAHMAN\\Documents\\NetBeansProjects\\BusStation\\Tarekassi.txt");
            driverList.add(x);   
            }
            else if(arr[0].equals("Tarek")){
            x.assignedtrip = readTrips("C:\\Users\\ABD-ELRAHMAN\\Documents\\NetBeansProjects\\BusStation\\Mohamedassi.txt");
            driverList.add(x);
            }
            else{
            x.assignedtrip = readTrips("C:\\Users\\ABD-ELRAHMAN\\Documents\\NetBeansProjects\\BusStation\\Magdyassi.txt");
            driverList.add(x);
            }
        }

        return driverList;
    }
    
    
}
