package com.errday.headfirstdesign.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

    private Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자 튀김이 첨가된 베지 버거", true, 3.99);
        addItem("오늘의 스프", "샐러드가 곁들여진 오늘의 스프", false, 3.69);
        addItem("부리토", "통 핀토콩 살사, 구아카몰이 곁들여진 푸짐한 부리토", true, 4.29);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.put(name, new MenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
