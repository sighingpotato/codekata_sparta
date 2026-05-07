public class Solution27 {
    public String solution27(String phone_number) {
        // 1. 문자열을 수정하기 편하도록 문자 배열로 변환
        char[] ch = phone_number.toCharArray();

        // 2. 뒤에서 4자리를 제외한 앞부분을 '*'로 변경
        for (int i = 0; i < ch.length - 4; i++) {
            ch[i] = '*';
        }

        // 3. 수정된 배열을 다시 문자열로 변환하여 반환
        return String.valueOf(ch);
    }
}