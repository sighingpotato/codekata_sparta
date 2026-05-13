public class Solution35 {
    public long solution35(int price, int money, int count) {
        // 총 요금을 저장할 변수
        long totalCost = 0;

        // 1번부터 count번까지의 요금을 계산하여 totalCost에 누적
        for (int i = 1; i <= count; i++) {
            totalCost += (long) price * i;
        }

        // 부족한 금액 계산
        // 가진 돈이 총 요금보다 많으면 0, 그렇지 않으면 차액을 반환
        if (money >= totalCost) {
            return 0;
        } else {
            return totalCost - money;
        }
    }
}