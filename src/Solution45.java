public class Solution45 {
    public String solution45(String s, int n) {
        // 문자열을 문자 배열로 바꾼다
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            // 공백은 그대로
            if (arr[i] == ' ') {
                continue;
            }
            // 대문자
            else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) ((arr[i] - 'A' + n) % 26 + 'A');
            }
            // 소문자
            else if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) ((arr[i] - 'a' + n) % 26 + 'a');
            }
        }
        // 문자 배열을 문자열로 변환하여 반환
        return new String(arr);
    }
}
