package com.oop15;

public class HouseMainTest {
    public static void main(String[] args) {
        House house = new House("부산시 진구");
        house.showInfo();

        house = null;
        // 라고 했을때 GC 대상은 House와 Room 둘 다 제거의 대상이 된다.
    }
}
