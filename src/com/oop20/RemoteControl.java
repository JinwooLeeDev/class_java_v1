package com.oop20;

//        ⬇️⬇️  키워드가 class가 아님
public interface RemoteControl {
    // 1. 인터페이스 안에 선언된 필드는 자동으로 public static final이 붙는다. 즉 상수가 된다.
    // int MAX_VOLUME = 10;    // 여기 코드는 생략되어 있음.
    public static final int MAX_VOLUME = 10;

    // 2. 인터페이스 안에 선언되는 메서드는 자바 8 버전 default 제외하고 전부 추상 메서드로 설계 되어야 한다.

    void turnOn();  // 자동으로 public abstract 가 붙는다.
    public abstract void turnOff();
    void setVolume(int volume);
}
