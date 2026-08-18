package starcraft.ver_5;

public class Unit implements Attack, BeAttack {

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

    @Override
    public void attack(Unit target) {
        if (this.hp <= 0) {
            System.out.println(name + "은(는) 사망하여 공격할 수 없습니다.");
            return;
        }
        System.out.println(name + "이(가) " + target.getName() + "을(를) 공격합니다.");

        target.beAttack(this.power);
    }


    public void showInfo() {
        System.out.println("===== 상태창 =====");
        System.out.println("유닛 이름 : " + name);
        System.out.println("공격력 : " + power);
        System.out.println("체력 : " + hp);
    }

    @Override
    public void beAttack(int power) {
        if (this.hp <= 0) {
            System.out.println(name + "은(는) 이미 사망했습니다.");
            return;
        }

        this.hp -= power;

        if (this.hp < 0) {
            this.hp = 0;
        }
        System.out.println(name + "이(가) 공격받았습니다. 남은 HP: " + hp);
    }
}