public class Solution29 {
    public int[] solution29(int[] arr) {
        // 빈 배열이 될 경우 -1 반환
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        // 최솟값 찾기
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 최솟값을 제외한 새 배열 만들기
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[index++] = arr[i];
            }
        }
        return answer;
    }
}
