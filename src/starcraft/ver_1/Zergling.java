package starcraft.ver_1;

public class Zergling {
    private String name;
    private int power;
    private int hp;

    public Zergling(String name) {
        this.name = name;
        this.power = 3;
        this.hp = 50;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    // 1. 저글링이 질럿을 공격합니다.
    // 2. 저글링이 마린을 공격합니다.
    // 3. 자기 자신(저글링)이 공격을 당합니다.
    // 4. 내 현재 상태 출력(콘솔) 기능 만들기

    public void attackZealot(Zealot zealot) {
    }

    public void attackMarine(Marine marine) {
        System.out.println(this.name + "이 마린을 공격합니다.");
        int marineHp = marine.getHp();

        marineHp -= this.power;
        System.out.println(marine.getName() + "남은 체력 : " + marineHp);

        if(marineHp<=0) {
            System.out.println(marine.getName() + "이 죽었습니다.");
        }
    }

    public void beAttacked(int power) {
        System.out.println(this.name + "이 공격을 받습니다.");
        this.hp -= power;
        System.out.println(this.name + "남은 체력 : " + this.hp);
        if (this.hp<=0) {
            System.out.println(this.name + "유닛이 죽었습니다.");
        }
    }

    public void showInfo() {
        System.out.println("=====상태창=====");
        System.out.println("이름 : " + name);
        System.out.println("현재 공격력 : " + power);
        System.out.println("현재 생명력 : " + hp);
    }
}
