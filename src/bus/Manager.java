/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import static bus.Bus.trip;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 *
 * @author Shehab eldeen
 */
public class Manager extends Person {    

    public static boolean Write(Trip tri,String FilePath,boolean appendType) throws IOException
    {
        PrintWriter Writter = null;
        try {
            Writter = new PrintWriter(new FileWriter(new File(FilePath),appendType));
                    
                    Writter.printf(tri.getDestination());
                    Writter.printf(" ");
                    Writter.print(tri.getDays());
                    Writter.printf(" ");
                    Writter.printf(tri.getWay());
                    Writter.printf(" ");
                    Writter.printf(tri.geteKind());
                    Writter.printf(" ");
                    Writter.printf(tri.getStops());
                    Writter.printf(" ");
                    Writter.println(tri.getVeh());
                    
                    
                    return true;
        }
        catch(IOException e){
            System.err.println(e);
        }
        finally{
            Writter.close();
        }
          return false;
        
        
        
    }
    public static void cancel(int index) throws FileNotFoundException, IOException{
       
                trip.remove(index);  
                Write(trip.get(0),"C:\\Users\\ABD-ELRAHMAN\\Documents\\NetBeansProjects\\BusStation\\trips.txt" , false);
                for (int i =1;i<trip.size();i++)
                {
                     Write(trip.get(i),"C:\\Users\\ABD-ELRAHMAN\\Documents\\NetBeansProjects\\BusStation\\trips.txt" , true);
                }
    
}

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }


}