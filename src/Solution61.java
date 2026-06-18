public class Solution61 {
  public int[] solution61(int[] lottos, int[] win_nums) {
        int zeroCount = 0;  // 알아볼 수 없는 번호(0)의 개수
        int matchCount = 0; // 확실하게 맞힌 번호의 개수

        // 1. 내 로또 번호를 하나씩 확인.
        for (int l : lottos) {
            // 번호가 0이라면 zeroCount 증가
            if (l == 0) {
                zeroCount++;
            }
            // 0이 아니라면 당첨 번호에 있는지 확인
            else {
                for (int w : win_nums) {
                    if (l == w) {
                        matchCount++;
                        break; // 찾았으면 더 이상 당첨 번호를 뒤질 필요가 없으므로 탈출
                    }
                }
            }
        }

        // 2. 맞힌 개수에 따른 등수 배열을 미리 만들어둔다.
        // 인덱스(맞힌 개수): 0개, 1개, 2개, 3개, 4개, 5개, 6개
        // 배열값(등수)    : 6등, 6등, 5등, 4등, 3등, 2등, 1등
        int[] rank = {6, 6, 5, 4, 3, 2, 1};

        // 3. 최고 순위와 최저 순위를 계산.
        // 최고 순위: 확실히 맞힌 개수 + 0이 모두 맞았다고 가정
        int maxRank = rank[matchCount + zeroCount];

        // 최저 순위: 확실히 맞힌 개수만 인정 (0은 모두 틀렸다고 가정)
        int minRank = rank[matchCount];

        // 4. 결과를 배열에 담아 반환 (최고 순위, 최저 순위)
        return new int[]{maxRank, minRank};
    }
}
