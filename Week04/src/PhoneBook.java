import java.util.ArrayList;
import java.util.Scanner;

class Phone {
    private String name;
    private String num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Phone(String name, String num) {
        this.name = name;
        this.num = num;
    }
}

class Book {
    ArrayList<Phone> dialing = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    public void addUser() {
        System.out.print("이름 입력 : ");
        String userName = in.nextLine();
        System.out.print("번호 입력 : ");
        String userNum = in.nextLine();
        dialing.add(new Phone(userName, userNum));
    }

    public void showUser() {
        System.out.print("검색할 사용자의 이름을 입력하세요. : ");
        String userName = in.nextLine();
        for (Phone phone : dialing) {
            if(phone.getName().equals(userName)){
                System.out.println(userName + " ☎ " + phone.getNum());
            }
        }
    }
}
public class PhoneBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Book book = new Book();

        while (true) {
            System.out.print("1. 저장 ");
            System.out.print("2. 검색 ");
            System.out.print("3. 종료 ");
            int save = in.nextInt();

            if(save == 1) {
                book.addUser();
            } else if (save == 2) {
                book.showUser();
            }else break;
        }

    }
}
