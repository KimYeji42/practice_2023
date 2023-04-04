//import java.util.ArrayList;
//import java.util.Scanner;
//class Day {
//    public ArrayList<String> plan;
////
////    public Day() {
////        plan = new ArrayList<>();
////    }
//
//    public void addPlan(String newPlan) {
//        plan.add(newPlan);
//    }
//    public void AllPlan() {
//        System.out.println("스케줄 목록");
//        for (int i = 0; i < plan.size(); i++) {
//            System.out.println((i+1) + ". " + plan.get(i));
//        }
//        if(plan == null)
//            System.out.println("없습니다.");
//    }
//
//    public String getPlan(int index) {
//        if (index < 1 || index > plan.size()) {
//            return "잘못된 번호입니다.";
//        }
//        return plan.get(index-1);
//    }
//
//    public int size() {
//        return plan.size();
//    }
//
////    private ArrayList<Day> days;
//    Scanner in = new Scanner(System.in);
//
//    public void MonthSchedule() {
//        plan = new ArrayList<>();
//        for (int i = 0; i < 31; i++) {
//            plan.add(new Day());
//        }
//
//    }
//
//    public void addPlan() {
//        System.out.println("스케줄을 등록할 날짜를 입력하세요. (숫자만 입력)");
//        System.out.println("==========================================================");
//        int day = Integer.parseInt(in.nextLine());
//        if (day < 1 || day > 31) {
//            System.out.println("잘못된 날짜입니다.");
//            System.out.println("==========================================================");
//
//            return;
//        }
//        System.out.println("등록할 스케줄을 입력하세요");
//        System.out.println("==========================================================");
//
//        String newPlan = in.nextLine();
//        plan.get(day - 1).addPlan(newPlan);
//        System.out.println("스케줄이 등록되었습니다.");
//        System.out.println("==========================================================");
//
//    }
//
//
//    public void viewPlan() {
//        System.out.println("==========================================================");
//        System.out.println("스케줄을 조회할 날짜를 입력하세요(1-31)");
//        System.out.println("==========================================================");
//        int day = Integer.parseInt(in.nextLine());
//        if (day < 1 || day > 31) {
//            System.out.println("잘못된 날짜입니다.");
//            return;
//        }
//
//        Day selectDay = plan.get(day - 1);
//
//        if(selectDay.getPlan(day) == null) {
//            System.out.println("스케줄이 없습니다.");
//            return;
//        }
//        selectDay.AllPlan();
//    }
//
//    public void run() {
//        while (true) {
//            System.out.println("원하는 작업을 선택하세요.");
//            System.out.println("==========================================================");
//            System.out.println("1. 스케줄 추가");
//            System.out.println("2. 스케줄 조회");
//            System.out.println("3. 종료");
//            System.out.println("==========================================================");
//
//            int num = Integer.parseInt(in.nextLine());
//
//            switch (num) {
//                case 1:
//                    addPlan();
//                    break;
//                case 2:
//                    viewPlan();
//                    break;
//                case 3:
//                    System.out.println("프로그램을 종료합니다.");
//                    System.out.println("==========================================================");
//                    in.close();
//                    return;
//            }
//        }
//    }
//}
//
//public class MonthSchedule {
//    public static void main(String[] args) {
//        Day monthSchedule = new Day();
//        monthSchedule.run();
//    }
//}
//
//
