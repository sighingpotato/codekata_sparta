public class Solution46 {
    public int solution46(String s) {
        String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };

        String answerStr = ""; // 최종 숫자들이 모일 곳
        String tempWord = ""; // 영단어가 조립될 임시 바구니

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 숫자면 바로 추가
            if (ch >= '0' && ch <= '9') {
                answerStr += ch;
            }
            // 문자면 영단어 조립
            else {
                tempWord += ch; // 한 글자씩 담음

                // 담긴 단어가 0~9 중 하나와 일치하는지 확인
                for (int j = 0; j < words.length; j++) {
                    if (tempWord.equals(words[j])) {
                        answerStr += j; // 일치하면 해당 숫자 추가
                        tempWord = ""; // 바구니 초기화
                        break; // 다음 글자로 넘어감
                    }
                }
            }
        }
        // 최종 문자열을 숫자로 변환
        return Integer.parseInt(answerStr);
    }
}
