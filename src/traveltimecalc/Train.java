/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traveltimecalc;

/**
 *
 * @author michael
 */
public class Train extends Vehicle {

    private Float trolly;

    public Train(String vehicleType, Float distance, Float avgSpeed, Float trolly) {
        super(vehicleType, avgSpeed);
        this.trolly = trolly;
    }

    public Float getTrolly() {
        return trolly;
    }

    public void setTrolly(Float trolly) {
        this.trolly = trolly;
    }

    @Override
    public String getVehicleInfo() //displays info in string form
    {
        return super.getVehicleInfo() + " with " + trolly + " trolly cars";
    }
}
