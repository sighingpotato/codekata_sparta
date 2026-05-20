public class Solution41 {
    public String solution41(String s) {
        String answer = "";

        // 문자열을 한 글자씩 모두 쪼개서 배열로 만든다.
        String[] arr = s.split("");

        int idx = 0; // 단어 안에서 순서를 셀 카운터

        // 조각난 글자들을 처음부터 끝까지 하나씩 확인
        for (int i = 0; i < arr.length; i++) {

            // 만약 확인하는 조각이 띄어쓰기라면?
            if (arr[i].equals(" ")) {
                answer += " "; // 띄어쓰기를 그대로 추가
                idx = 0; // 단어의 순서를 초기화
            }
            // 띄어쓰기가 아닌 일반 글자라면?
            else {
                if (idx % 2 == 0) {
                    answer += arr[i].toUpperCase(); // 짝수 번째 글자 -> 대문자
                } else {
                    answer += arr[i].toLowerCase(); // 홀수 번째 글자 -> 소문자
                }
                idx++; // 단어 안에서 순서를 증가시킴
            }
        }
        return answer;
    }
}
