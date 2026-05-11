public class Solution32 {
    public int solution32(int[] a, int[] b) {
        int answer = 0;

        // 배열 a의 길이만큼 반복문을 돌린다.
        for (int i = 0; i < a.length; i++) {
            // 같은 인덱스에 있는 값들을 곱해서 answer에 더한다.
            answer += a[i] * b[i];
        }
        return answer;
    }
}
