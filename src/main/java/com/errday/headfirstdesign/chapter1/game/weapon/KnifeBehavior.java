package com.errday.headfirstdesign.chapter1.game.weapon;

public class KnifeBehavior implements WeaponBehavior {
    
    @Override
    public void useWeapon() {
        System.out.println("칼로 베기");
    }
}
