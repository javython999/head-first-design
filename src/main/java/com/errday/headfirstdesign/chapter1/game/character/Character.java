package com.errday.headfirstdesign.chapter1.game.character;

import com.errday.headfirstdesign.chapter1.game.weapon.WeaponBehavior;

public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    void setWeapon(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    void fight() {
        weaponBehavior.useWeapon();
    }
}
