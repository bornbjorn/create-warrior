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
public abstract class Warrior {
    protected String name;
    private String origin;

    private String bodyType;
    private int physicalStrength;
    private int speed;
    private int agility;

    private String martialArtsType;
    private String weapons;

    private String powers;
    private String specialSkill;
    private boolean levelUpAbility;
    
    public abstract void getName();

    public String getOrigin() {
        return origin;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setPhysicalStrength(int physicalStrength) {
        this.physicalStrength = physicalStrength;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setMartialArtsType(String martialArtsType) {
        this.martialArtsType = martialArtsType;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    public void setPowers(String powers) {
        this.powers = powers;
    }

    public void setSpecialSkill(String specialSkill) {
        this.specialSkill = specialSkill;
    }

    public void setLevelUpAbility(boolean levelUpAbility) {
        this.levelUpAbility = levelUpAbility;
    }
}
