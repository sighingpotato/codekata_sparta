public class Solution31 {
    public String solution31(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수"; // 짝수 번째에는 "수"
            } else {
                answer += "박"; // 홀수 번째에는 "박"
            }
        }
        return answer;
    }
}
