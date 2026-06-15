public class Solution59 {
  public int solution59(int n, int m, int[] section) {
        int answer = 0;       // 롤러를 칠한 총 횟수
        int paintedUntil = 0; // 롤러가 이미 페인트를 칠해버린 '마지막 구역의 번호'

        // 칠해야 하는 구역들을 처음부터 하나씩 꺼내어 확인.
        for (int s : section) {

            // 아직 페인트가 안 묻은 구역을 발견했다면!
            if (s > paintedUntil) {
                answer++; // 새롭게 롤러를 손에 쥐고 한 번 칠한다.

                // 현재 구역(s)부터 시작해서 m미터만큼 쭉 칠해지므로,
                // 페인트가 채워진 마지막 번호를 갱신.
                paintedUntil = s + m - 1;
            }

            // 만약 s <= paintedUntil 이라면, 이미 이전 롤러질에 같이 칠해진 것이므로
            // 아무것도 하지 않고 다음 구역으로 넘어간다.
        }

        return answer; // 최소 페인트칠 횟수 반환
    }
}
