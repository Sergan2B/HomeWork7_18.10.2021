package com.company;

public class Medic extends Hero implements HavingSuperAbility{
    @Override
    public int setDamageHero(int damageHero) {
        super.setDamageHero(damageHero);
        //this.damageHero = 30;
        return damageHero;
    }

    @Override
    public int setHealthHero(int healthHero) {
        super.setHealthHero(healthHero);
        //this.healthHero = 750;
        return healthHero;
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        healthHero += 50;
        return healthHero + " Лечение" + superAbilityType;
    }
}
