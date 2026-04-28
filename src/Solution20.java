public class Solution20 {
    public long solution20(long n) {
        // 0~9까지 숫자가 몇 번 나왔는지 기록할 배열
        int[] counts = new int[10];

        // 숫자를 하나씩 분리해서 개수 세기
        while (n > 0) {
            int num = (int) (n % 10); // 맨 끝자리 숫자 추출
            counts[num]++; // 해당 숫자 개수 증가
            n = n / 10; // 맨 끝자리 숫자 제거
        }

        long answer = 0;

        // 9~0까지 큰 숫자부터 차례로 조립
        for (int i = 9; i >= 0; i--) {
            while (counts[i] > 0) {
                // 이전 숫자의 자릿수를 한칸 올리고 새 숫자를 더한다.
                answer = answer * 10 + i;
                counts[i]--;
            }
        }
        return answer;
    }

}
