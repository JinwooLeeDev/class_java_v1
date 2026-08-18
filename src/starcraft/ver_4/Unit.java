package starcraft.ver_4;

public class Unit {
    protected String name;
    protected int power;
    protected int hp;

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void attack(Unit target) {
        if (this.hp <= 0) {
            System.out.println(name + "은(는) 사망하여 공격할 수 없습니다.");
            return;
        }

        System.out.println(name + "이(가) " + target.getName() + "을(를) 공격합니다.");
        target.beAttacked(this.power);
    }

    // 공격을 당했을 때
    public void beAttacked(int power) {
        if (this.hp <= 0) {
            System.out.println(name + "은(는) 이미 사망했습니다.");
            return;
        }

        this.hp -= power;

        if (this.hp < 0) {
            this.hp = 0;
        }

        System.out.println(name + "이(가) 공격받았습니다. (남은 HP: " + this.hp + ")");
    }

    // 상태창
    public void showInfo() {
        System.out.println("===== 상태창 =====");
        System.out.println("유닛 이름: " + name + " | 공격력: " + power + " | 체력: " + hp);
    }
}
