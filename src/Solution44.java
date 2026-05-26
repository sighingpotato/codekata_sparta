public class Solution44 {
    public int solution44(int[][] sizes) {
        int maxW = 0; // 명함의 긴 쪽들 중 가장 큰 값
        int maxH = 0; // 명함의 짧은 쪽들 중 가장 큰 값

        for (int[] card : sizes) {
            // 1. 현재 명함의 가로와 세로 중 더 긴 것과 짧은 것을 구분한다.
            int longer = Math.max(card[0], card[1]);
            int shorter = Math.min(card[0], card[1]);

            // 2. 전체 명함들 중 긴 쪽의 최댓값을 갱신한다.
            if (longer > maxW) {
                maxW = longer;
            }

            // 3. 전체 명함들 중 짧은 쪽의 최댓값을 갱신한다.
            if (shorter > maxH) {
                maxH = shorter;
            }
        }

        // 4. 최종 지갑의 크기(가로 x 세로)를 반환한다.
        return maxW * maxH;
    }
}