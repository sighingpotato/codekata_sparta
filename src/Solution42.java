public class Solution42 {
    public int solution42(int[] number) {
        int answer = 0;
        int length = number.length;

        // 첫 번째 학생
        for (int i = 0; i < length - 2; i++) {

            // 두 번째 학생
            for (int j = i + 1; j < length - 1; j++) {

                // 세 번째 학생
                for (int k = j + 1; k < length; k++) {

                    // 세 학생의 번호를 더해서 0이 되는지 확인
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++; // 조건을 만족하면 카운터 증가
                    }
                }
            }
        }
        return answer;
    }
}
