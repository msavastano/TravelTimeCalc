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
public class Auto extends Vehicle{
    
    private String transmittion;
    
    public Auto(String vehicleType, Float distance, Float avgSpeed, String transmittion){
        super(vehicleType, avgSpeed);
        this.transmittion = transmittion;    }
    
    public String getTransmittion(){
        return transmittion;
    }
    
    public void setTransmittion(String transmittion){
        this.transmittion = transmittion;
    }
    
    @Override
    public String getVehicleInfo() //displays info in string form
        {            
            return super.getVehicleInfo() + " with a " + transmittion + " transmittion";
        }
    
}
