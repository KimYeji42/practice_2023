import java.util.Scanner;

class Day {
    public String plan[] = new String[31];
    Scanner in = new Scanner(System.in);
    //추가
    public void addPlan () {
        System.out.print("일정을 등록할 날짜를 입력하세요 : ");
        int date = Integer.parseInt(in.nextLine());
        System.out.print("등록할 일정을 입력하세요. : ");
        String newPlan = in.nextLine();
        plan[date-1]=newPlan;
    }
    //조회
    public void showPlan() {
        System.out.print("조회할 날짜를 입력하세요. : ");
        int date = in.nextInt();
        System.out.println("등록된 스케줄 : "+plan[date-1]);
    }
}

public class MonthSchedule {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Day MonthSchedule2 = new Day();

        while (true) {
            System.out.println("원하는 작업을 선택하세요.");
            System.out.println("==========================================================");
            System.out.println("1. 스케줄 추가");
            System.out.println("2. 스케줄 조회");
            System.out.println("3. 종료");
            System.out.println("==========================================================");

            int num = Integer.parseInt(in.nextLine());

            switch (num) {
                case 1:
                    MonthSchedule2.addPlan();
                    break;
                case 2:
                    MonthSchedule2.showPlan();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.out.println("==========================================================");
                    in.close();
                    return;
            }


        }
    }
}
