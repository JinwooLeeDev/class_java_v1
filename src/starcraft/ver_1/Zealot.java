package starcraft.ver_1;

public class Zealot {

    private String name;
    private int power;
    private int hp;

    public Zealot(String name) {
        this.name = name;
        this.power = 5;
        this.hp = 80;
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

    // 1. 질럿이 저글링을 공격합니다.
    // 2. 질럿이 마린을 공격합니다.
    // 3. 자기 자신(질럿)이 공격을 당합니다.
    // 4. 내 현재 상태 출력(콘솔) 기능 만들기

    public void attackZergling(Zergling zergling) {
        System.out.println(this.name + "이 저글링을 공격합니다.");
        int zerghp = zergling.getHp();

        zerghp -= this.power;
        System.out.println(zergling.getName() + "남은 체력 : " + zerghp);

        if(zerghp<=0) {
            System.out.println(zergling.getName() + "이 죽었습니다.");
        }
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
        System.out.println("=====유닛 정보=====");
        System.out.println("이름 : " + name);
        System.out.println("현재 공격력 : " + power);
        System.out.println("현재 생명력 : " + hp);
    }
}
