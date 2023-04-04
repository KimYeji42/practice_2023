import java.util.Scanner;

class Dictionary {
    Scanner in = new Scanner(System.in);
    String[] ko = {"cat" , "dog", "rabbit", "bear", "pig"};
    String[] en = {"고양이", "강아지", "토끼", "곰", "돼지"};

    String Word(String word) {
        for(int i=0; i<ko.length; i++) {
            if(word.equals(ko[i])) {
                return en[i];
            }
        }
        return null;
    }

    public void Run() {
        while(true) {
            System.out.print("한글 단어?");
            words = sc.next();
            if(words.equals("그만")) {
                break;
            }
            String result = Dictionary.kor2Eng(word);
            if(result==(null))
                System.out.println(words+"은(는) 저의 사전에 없습니다.");
            else
                System.out.println(words+"은(는) "+result);
        }
    }

    public void Search () {
        System.out.print("검색할 한글 단어를 입력하세요. : ");
        String SearchWord = in.next();
        if(int i=0; i<ko.length; i++)
        {
        }
    }



}

public class DicApp {
    public static void main(String[] args) {

    }
}
