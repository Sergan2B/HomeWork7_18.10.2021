package com.company;

abstract class Hero {
    int damageHero, healthHero;
    String superAbility;

    public int getDamageHero() {
        return damageHero;
    }

    public int setDamageHero(int damageHero) {
        this.damageHero = damageHero;
        return damageHero;
    }

    public int getHealthHero() {
        return healthHero;
    }

    public int setHealthHero(int healthHero) {
        this.healthHero = healthHero;
        return healthHero;
    }
}
