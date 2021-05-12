/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

/**
 *
 * @author Shehab eldeen
 */
public class Person {
    protected String Name ;
    protected int age ;
    protected int password;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }
    
    
}
