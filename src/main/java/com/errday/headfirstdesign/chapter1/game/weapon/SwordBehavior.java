package com.errday.headfirstdesign.chapter1.game.weapon;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("검을 휘두르기");
    }
}
