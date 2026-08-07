package ch05;

public class Operation5_1 {
    // 메인함수
    public static void main(String[] args) {

        // 게임 캐릭터 상태 설정
        int playerHealth = 50;  // 플레이어의 체력
        int playerLevel = 10;   // 플레이어의 레벨
        int enemyHealth = 30;   // 적군 체력
        int enemyLevel = 15;    // 적군 레벨

        // 1. 플레이어의 체력이 적 체력보다 높은지 확인하는 코드를 작성하고 출력
        System.out.println(playerHealth > enemyHealth);
        // 2. 플레이어의 체력이 위험 수준인 20 이하 인지 확인
        System.out.println(playerHealth <= 20);
        // 3. 플레이어와 적의 체력이 같은지 확인
        System.out.println(playerHealth == enemyHealth);
        // 4. 플레이어의 특정 레벨이 30 이상인지 확인
        System.out.println(playerLevel >= 30);
        // 주의 사항 - 경계값 포함 여부
        // 이하    <= 경계값이 포함 됨
        // 이상    >= 경계값이 포함 됨
        // 미만     < 경계값이 포함 안됨(x)
        // 초과     > 경계값이 포함 안됨(x)

        // 5. 플레이어의 체력이 30 미만인지 확인하는 코드를 작성
        System.out.println(playerHealth < 30);
        // 6. 플레이어의 체력이 50을 초과하는지 확인하는 코드를 작성
        System.out.println(playerHealth > 50);

    } // end of main
} // end of class
