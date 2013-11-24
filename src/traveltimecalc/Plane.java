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
public class Plane extends Vehicle{
    
    private String engineType;
    
    public Plane(String vehicleType, Float distance, Float avgSpeed, String engineType){
        super(vehicleType, avgSpeed);   
        this.engineType = engineType;
    }
    
    public String getEngineType(){
        return engineType;
    }
    
    public void setEngineType(String engineType){
        this.engineType = engineType;
    }
    
    @Override
    public String getVehicleInfo() //displays info in string form
        {            
            return super.getVehicleInfo() + " with a " + engineType + " engine";
        }
    
}
