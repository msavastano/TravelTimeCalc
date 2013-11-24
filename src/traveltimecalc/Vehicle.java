/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traveltimecalc;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author michael
 */


public class Vehicle {

    

    

    //variables for calcualtion
    private String vehicleType;
    private Float avgSpeed;
    private Float time;

    public Vehicle(String vehicleType, Float avgSpeed) {
        this.avgSpeed = avgSpeed;
        this.vehicleType = vehicleType;
    }

    public String getVehicletype() {
        return vehicleType;
    }

    public void setVehicletype(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Float getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(Float avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public Float getTime() {
        return time;
    }

    public Float setTime(Float dis, Float speed) {
        
        time = dis / speed;
        return time;
    }

    public String getVehicleInfo() //displays info in string form
    {
        return "At a speed of " + avgSpeed + " mph, a(n) " + vehicleType;
    }

    

}
