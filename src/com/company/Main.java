package com.company;

public class Main {

    public static void main(String[] args) {
	//Создать интерфейс HavingSuperAbility (имеющий суперспособность)
        //добавить в него 1 абстрактный метод applySuperAbility(String superAbilityType);
        //СДЕЛАНО

        //Создать абстрактный класс Hero с полями здоровье, урон и тип суперспособности и реализовать интерфейс HavingSuperAbility.
        //СДЕЛАНО

        /*//Создать 3 класса героев Magic, Medic, Warrior и наследовать их от класса Hero. //сделано
         В каждом классе по своему реализовать метод applySuperAbility(String superAbilityType) следующим образом -
        // просто распечатать что то вроде того “Warrior применил суперспособность CRITICAL DAMAGE”.*/
        //СДЕЛАНО

        //В классе Main создать массив из 3х разных героев, затем через цикл применить суперспособность каждого героя.
        //СДЕЛАНО
        //Дэдлайн 19.10.2021 23 59

        System.out.println("_____________________________________");
        Warror c01 = new Warror();
        c01.applySuperAbility("Супер способность");
        System.out.println(c01.setDamageHero(50));
        System.out.println(c01.setHealthHero(800));
        System.out.println(c01.damageHero);
        System.out.println(c01.healthHero);
        System.out.println(c01.applySuperAbility(" Суперспособность"));

        System.out.println("_____________________________________");
        Medic m01 = new Medic();
        m01.applySuperAbility("Супер способность");
        System.out.println(m01.setDamageHero(15));
        System.out.println(m01.setHealthHero(600));
        System.out.println(m01.damageHero);
        System.out.println(m01.healthHero);
        System.out.println(m01.applySuperAbility(" Суперспособность"));

        System.out.println("_____________________________________");
        Magic d01 = new Magic();
        d01.applySuperAbility("");
        System.out.println(d01.setDamageHero(50));
        System.out.println(d01.setHealthHero(400));
        System.out.println(d01.damageHero);
        System.out.println(d01.healthHero);
        System.out.println(d01.applySuperAbility(" Суперспособность"));

        HavingSuperAbility[] superAbilities ={c01, m01, d01};
        for (int i = 0; i < superAbilities.length; i++) {
            superAbilities[i].applySuperAbility("");
            superAbilities[i].applySuperAbility("asdasdas");
            System.out.println(superAbilities[i]);

            superPunch(superAbilities[i]);
        }
    }
    public static void superPunch (HavingSuperAbility d) {
        d.applySuperAbility("");
        System.out.println("Суперспособность применена");
    }
}
