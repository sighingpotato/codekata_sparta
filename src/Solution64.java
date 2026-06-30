public class Solution64 {
public int solution(int n, int[] lost, int[] reserve) {
        // 학생들의 체육복 보유 상태를 기록할 출석부 배열
        int[] students = new int[n + 2];

        // 1. 도난당한 학생들의 상태를 -1로 만든다.
        for (int l : lost) {
            students[l]--;
        }

        // 2. 여벌을 가져온 학생들의 상태를 +1 해준다.
        for (int r : reserve) {
            students[r]++;
        }

        // 3. 체육복 빌려주기 시작
        // 1번 학생부터 n번 학생까지만 순회한다.
        for (int i = 1; i <= n; i++) {
            // 체육복이 없는(-1) 학생을 발견했다면
            if (students[i] == -1) {
                if (students[i - 1] == 1) {
                    students[i]++;     // 나는 체육복을 얻어 0이 됨
                    students[i - 1]--; // 앞번호는 빌려줬으니 0이 됨
                }
                else if (students[i + 1] == 1) {
                    students[i]++;     // 나는 체육복을 얻어 0이 됨
                    students[i + 1]--; // 뒷번호는 빌려줬으니 0이 됨
                }
            }
        }

        // 4. 체육 수업을 들을 수 있는 학생 수 세기
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            // 체육복 상태가 0 이상(자기가 입을 1벌 이상 존재)이면 수업 가능
            if (students[i] >= 0) {
                answer++;
            }
        }

        return answer;
    }
}
