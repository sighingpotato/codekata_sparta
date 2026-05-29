import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution47 {
    public String[] solution47(String[] strings, int n) {
        List<String> list = new ArrayList<>();

        // 1. 모든 문자열 앞에 n번째 글자를 덧붙인다.
        // 예: "sun", n=1 이라면 "usun"이 된다.
        for (String s : strings) {
            list.add(s.charAt(n) + s);
        }

        // 2. 리스트를 오름차순 정렬.
        // 맨 앞 글자(n번째였던 것)를 먼저 비교하고, 같으면 전체 문자열을 비교.
        Collections.sort(list);

        // 3. 결과를 담을 배열을 만들고, 앞 글자만 떼서 다시 담는다.
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
}