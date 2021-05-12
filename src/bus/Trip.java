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
public class Trip {
    private String destination;
    private int days;
    private String way;
    private String stops ;
    private String eKind;
    private String veh;
    public static int availableSeats = 36 ;

    public String geteKind() {
        return eKind;
    }

    public void seteKind(String eKind) {
        this.eKind = eKind;
    }

    public String getVeh() {
        return veh;
    }

    public void setVeh(String veh) {
        this.veh = veh;
    }
  
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }   
}
