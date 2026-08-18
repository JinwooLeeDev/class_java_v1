package my_test;

public class MemberExample {
    public static void main(String[] args) {
        /*
         * 테스트 요구사항
         *
         * 1. Member 객체를 하나 생성합니다.
         * 2. 이름 "홍길동", 나이 25, 포인트 3000, 활성 상태 true를 저장합니다.
         * 3. getter를 사용해 모든 정보를 출력합니다.
         * 4. 나이를 -10으로 변경한 뒤 결과가 0인지 확인합니다.
         * 5. 포인트를 -500으로 변경한 뒤 결과가 0인지 확인합니다.
         * 6. 포인트를 다시 5000으로 저장합니다.
         * 7. 활성 상태를 false로 변경합니다.
         * 8. 활성 상태가 false이고 포인트가 0인지 확인합니다.
         *
         * 예상되는 마지막 출력:
         * 활성 상태: false
         * 포인트: 0
         */

        // 이곳에 테스트 코드를 직접 작성하세요.
        Member member = new Member("홍길동", 25, 3000, true);

        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.getPoint());
        System.out.println(member.isActive());

        member.setAge(-10);
        System.out.println(member.getAge());

        member.setPoint(-500);
        System.out.println(member.getPoint());

        member.setPoint(5000);

        member.setActive(false);

        System.out.println(member.isActive());
        System.out.println(member.getPoint());

        member.setName("");

        System.out.println(member.getName());

        member.setAge(130);

        System.out.println(member.getAge());

        member.setActive(true);

        System.out.println(member.isActive());
    }
}
