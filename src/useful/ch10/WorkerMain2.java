package useful.ch10;

public class WorkerMain2 {

    // 메인 쓰레드
    public static void main(String[] args) {
        System.out.println("------ 메인 쓰레드 시작 ------");

        Worker2 worker2 = new Worker2();
        // tip! 쓰레드를 동작 시키려면 무조건 Thread에 start(); 메서드를 호출해야한다.
        // worker2.start(); <---- start()가 없는 상태임
        new Thread(worker2).start();
        System.out.println("------ 메인 쓰레드 종료 ------");
    }   // end of main
}
