package com.errday.headfirstdesign.chapter1.game.weapon;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("도끼로 베기");
    }
}
