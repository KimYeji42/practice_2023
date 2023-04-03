import java.util.Scanner;

class Phone {
    private String name;
    private String number;

    public Phone(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String UserName() {
        return name;
    }

    public String UserNumber() { return number ;}
}

public class PhoneBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("저장할 번호의 갯수 입력 : ");
        int x = in.nextInt();

        Phone[] phones = new Phone[x];
        for (int i = 0; i < x; i++) {
            System.out.println("==================================================");
            System.out.print("이름 입력: ");
            String name = in.next();
            System.out.print("전화번호 입력 (띄어쓰기 없이 입력) : ");
            String number = in.next();
            phones[i] = new Phone(name, number);
        }
        System.out.println("==================================================");
        System.out.println("                    연락처 목록                     ");
        System.out.println("==================================================");
        for (int i = 0; i < x; i++) {
            System.out.println(phones[i].UserName() + " ☎ " + phones[i].UserNumber());
        }
    }
}
