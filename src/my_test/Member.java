package my_test;

/**
 * Getter / Setter 복습 문제
 *
 * 1. 다음 필드를 외부에서 직접 접근할 수 없도록 선언하세요.
 *    - name(String)   : 회원 이름
 *    - age(int)       : 회원 나이
 *    - point(int)     : 회원 포인트
 *    - active(boolean): 회원 활성 상태
 *
 * 2. 각 필드의 getter와 setter를 작성하세요.
 *
 * 3. setter에는 다음 규칙을 적용하세요.
 *    - name: 빈 문자열은 저장하지 않고 "이름없음"을 저장합니다.
 *    - age: 0 이상 120 이하만 저장합니다.
 *           범위를 벗어나면 0을 저장합니다.
 *    - point: 0 이상의 값만 저장합니다.
 *             음수가 들어오면 0을 저장합니다.
 *    - active: false로 변경하면 point도 0으로 변경합니다.
 *
 * 4. boolean 타입 getter의 이름은 getActive() 대신 isActive()로 작성하세요.
 *
 * 5. MemberExample에서 객체를 생성하고 모든 규칙을 직접 테스트하세요.
 *
 * 주의: 필드 값을 MemberExample에서 직접 변경하지 말고,
 * 반드시 setter를 통해 변경하고 getter를 통해 확인하세요.
 */
public class Member {
    // 이곳에 필드와 getter/setter를 직접 작성하세요.
    private String name;
    private int age;
    private int point;
    private boolean active;

    public Member(String name, int age, int point, boolean active) {
        setName(name);
        setAge(age);
        setPoint(point);
        setActive(active);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            this.name = "이름없음";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>120 || age<0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        if (point < 0) {
            this.point = 0;
        } else {
            this.point = point;
        }
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        if (active==false) {
            this.point = 0;
            this.active = false;
        } else {
            this.active = true;
        }
    }
}
