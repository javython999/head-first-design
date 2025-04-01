package com.errday.headfirstdesign.combining.duck;

import com.errday.headfirstdesign.combining.duck.Observer.QuackableObserver;

public interface Quackable extends QuackableObserver {
    void quack();
}
