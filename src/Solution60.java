public class Solution60 {
public int solution60(int number, int limit, int power) {
        int totalWeight = 0; // 무기점 주인이 준비해야 할 총 철의 무게

        // 1번 기사부터 number번 기사까지 순서대로 무기를 배정.
        for (int i = 1; i <= number; i++) {
            
            // 현재 기사(i)의 약수 개수를 효율적으로 구해온다.
            int count = getDivisorCount(i);
            
            // 만약 약수 개수(공격력)가 제한수치를 초과했다면?
            if (count > limit) {
                totalWeight += power; // 협약기관에서 정한 공격력을 더한다.
            } else {
                totalWeight += count; // 제한 이하라면 원래 약수 개수만큼 더한다.
            }
        }

        return totalWeight;
    }

    /**
     * 숫자의 약수 개수를 제곱근을 이용해 초고속으로 구해주는 함수
     */
    private int getDivisorCount(int num) {
        int count = 0;
        
        // 1부터 숫자의 제곱근까지만 루프를 돌린다.
        for (int i = 1; i * i <= num; i++) {
            // i * i가 딱 num과 같다면
            if (i * i == num) {
                count += 1; // 중복이므로 1개만 카운트한다.
            } 
            // 그 외에 딱 나누어 떨어진다면
            else if (num % i == 0) {
                count += 2; // i와 (num / i) 둘 다 약수이므로 2개를 카운트한다.
            }
        }
        
        return count;
    }
}