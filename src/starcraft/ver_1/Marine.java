package starcraft.ver_1;

public class Marine {
    private String name;
    private int power;
    private int hp;

    public Marine(String name) {
        this.name = name;
        this.power = 4;
        this.hp = 70;
    }

    // get 만들어 주기

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    // 1. 마린이 저글링을 공격합니다.
    // 2. 마린이 질럿을 공격합니다.
    // 3. 자기 자신(마린)이 공격을 당합니다.
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

    public void attackZealot(Zealot zealot) {
        System.out.println(this.name + "이 마린을 공격합니다.");
        int zealotHp = zealot.getHp();

        zealotHp -= this.power;
        System.out.println(zealot.getName() + "남은 체력 : " + zealotHp);

        if(zealotHp<=0) {
            System.out.println(zealot.getName() + "이 죽었습니다.");
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
