//import java.util.Scanner;
//
//class Phone {
//    private String name;
//    private String number;
//
//    public Phone(String name, String number) {
//        this.name = name;
//        this.number = number;
//    }
//
//    public String UserName() {
//        return name;
//    }
//
//    public String UserNumber() { return number ;}
//}
//
//public class PhoneBook {
//    private Phone[] phones;
//    private int size;
//
//    public PhoneBook(int size) {
//        phones = new Phone[size];
//        this.size = 0;
//    }
//
//    public void addPhone(String name, String phoneNumber) {
//        Phone phone = new Phone(name, phoneNumber);
//        phones[size] = phone;
//        size++;
//    }
//
//    public String searchPhone(String name) {
//        for (Phone phone : phones) {
//            if (phone != null && phone.UserName().equals(name)) {
//                return phone.UserNumber();
//            }
//        }
//        return null;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("사용자 수 입력 : ");
//        int x = in.nextInt();
//        PhoneBook phoneBook = new PhoneBook(x);
//
//
////        while (true) {
////            System.out.println("====================================================");
////            System.out.println("이름을 입력하세요. (입력 종료 : 0)");
////            String name = in.next();
////            if (name.equals("0")) {
////                break;
////            }
////
////            System.out.println("====================================================");
////            System.out.println("전화번호를 입력하세요.");
////            String phoneNumber = in.next();
////
////            phoneBook.addPhone(name, phoneNumber);
////        }
//
//        for (int i = 0; i < x; i++) {
//            phones[i] = new PhoneBook();
//
//            System.out.print((i + 1) + ". 이름 입력: ");
//            phones[i].name = in.nextLine();
//
//            System.out.print((i + 1) + ". 번호 입력: ");
//            phones[i].number = in.nextLine();
//        }
//
//        while (true) {
//            System.out.println("====================================================");
//            System.out.println("검색할 이름을 입력하세요. (종료: 0)");
//            String name = in.next();
//            if (name.equals("0")) {
//                break;
//            }
//
//            String phoneNumber = phoneBook.searchPhone(name);
//            if (phoneNumber == null) {
//                System.out.println("====================================================");
//                System.out.println("해당 이름의 전화번호를 찾을 수 없습니다.");
//            } else {
//                System.out.println("====================================================");
//                System.out.println(name + " ☎ " + phoneNumber);
//            }
//        }
//    }
//}
