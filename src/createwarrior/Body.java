/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createwarrior;

/**
 *
 * @author A214645
 */
public class Body extends Warrior {
    String bodyType = "";
    int physicalStrength = 0;
    int speed = 0;
    int agility = 0;
    
    
    public Body(String bodyType, int physicalStrength, int speed, int agility){
        this.bodyType = bodyType;
        this.physicalStrength = physicalStrength;
        this.speed = speed;
        this.agility = agility;
    }

    @Override
    public void getName() {
        
    }

    @Override
    public String toString() {
        return bodyType + " " + physicalStrength + " " + speed + " "+ agility;
    }
    
    
    
}
