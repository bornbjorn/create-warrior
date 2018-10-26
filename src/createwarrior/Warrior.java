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

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param bodyType the bodyType to set
     */
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    /**
     * @param physicalStrength the physicalStrength to set
     */
    public void setPhysicalStrength(int physicalStrength) {
        this.physicalStrength = physicalStrength;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @param agility the agility to set
     */
    public void setAgility(int agility) {
        this.agility = agility;
    }

    /**
     * @param martialArtsType the martialArtsType to set
     */
    public void setMartialArtsType(String martialArtsType) {
        this.martialArtsType = martialArtsType;
    }

    /**
     * @param weapons the weapons to set
     */
    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    /**
     * @param powers the powers to set
     */
    public void setPowers(String powers) {
        this.powers = powers;
    }

    /**
     * @param specialSkill the specialSkill to set
     */
    public void setSpecialSkill(String specialSkill) {
        this.specialSkill = specialSkill;
    }

    /**
     * @param levelUpAbility the levelUpAbility to set
     */
    public void setLevelUpAbility(boolean levelUpAbility) {
        this.levelUpAbility = levelUpAbility;
    }
    

    
}
