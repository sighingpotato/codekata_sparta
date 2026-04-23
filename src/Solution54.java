public class Solution54 {
    public String solution54(int a, int b) {

        // 요일 배열 (1월 1일 금요일 기준)
        String[] answer = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        // 16년 각 달의 일수
        int[] months = {31, 29, 31, 30, 31, 30 ,31, 31, 30, 31, 30 ,31};

        int totalDays = 0;

        // 이전 달(a-1월)까지의 일수를 모두 더한다.
        for (int i = 0; i < a -1; i++) {
            totalDays = totalDays + months[i];
        }

        // 해당 월의 일수(b)를 더한다.
        totalDays = totalDays + b;

        // 총 일수에서 1을 빼고 7로 나눈 나머지로 요일을 찾는다.
        return answer[(totalDays - 1) % 7];
    }
}
