public class Solution28 {
    public int solution28(int[] numbers) {
        // 0~9까지의 총합은 45
        int totalSum = 45;
        int currentSum = 0;

        // 배열에 있는 숫자를 모두 더한다.
        for (int number : numbers) {
            currentSum += number;
        }

        // 총합에서 현재 합을 빼면 없는 숫자가 나온다.
        return totalSum - currentSum;
    }
}
