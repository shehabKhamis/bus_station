/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Shehab eldeen
 */


public class Driver extends Person{
  //HashMap Pass = new HashMap();
    
    /**
     *
     * @param name
     * @param age
     */
   ArrayList<Trip> assignedtrip = new ArrayList<Trip>();

  @Override
    public void setName(String Name) {
        this.Name = Name;
    }

  @Override
    public String getName() {
        return Name;
    }

  @Override
    public void setAge(int age) {
        this.age = age;
    }

  @Override
    public int getAge() {
        return age;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public ArrayList<Trip> getAssignedtrip() {
        return assignedtrip;
    }
    
    
    public boolean DriverValidation(String str , String s){
      return false;
    }
}
