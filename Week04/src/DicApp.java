import java.util.Scanner;

class Dictionary {
    Scanner in = new Scanner(System.in);
    public String[] ko = {"고양이", "강아지", "토끼", "곰", "돼지"};
    public String[] en = {"cat" , "dog", "rabbit", "bear", "pig"};

    public String Word(String word) {
        for(int i=0; i<ko.length; i++) {
            if(word.equals(ko[i])) {
                return en[i];
            }
        }
        return null;
    }

    public void Run() {
        while(true) {
            System.out.print("검색할 한글단어를 입력하세요. (종료할려면 '종료' 입력)  : ");
            String word = in.next();
            if(word.equals("종료")) {
                break;
            }
            String result = Word(word);
            if(result==(null))
                System.out.println(word+"은(는) 없는 단어.");
            else
                System.out.println(word+"은(는) "+result);
        }
    }

}

public class DicApp {
    public static void main(String[] args) {
    	Dictionary dictionary = new Dictionary();
		dictionary.Run();
        
    }
}
