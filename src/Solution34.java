import java.util.Arrays;

public class Solution34 {
    public String solution34(String s) {
        // 문자배열로 바꾼다.
        char[] arr = s.toCharArray();

        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);

        String answer = "";

        // 정렬된 배열을 맨 뒤에서 앞까지 거꾸로 읽으면서 글자를 붙인다.
        for (int i = arr.length - 1; i >= 0; i--) {
            answer += arr[i];
        }
        return answer;
    }
}
