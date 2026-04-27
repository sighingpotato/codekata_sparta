public class Solution55 {
    public String solution55(String[] cards1, String[] cards2, String[] goal) {
        int i = 0; // cards1 맨 위
        int j = 0; // cards2 맨 위

        for (String word : goal) {
            // cards1의 현재 카드가 goal의 단어와 일치한다면
            if (i < cards1.length && cards1[i].equals(word)) {
                i++;
            }
            // cards2의 현재 카드가 goal의 단어와 일치한다면
            else if (j < cards2.length && cards2[j].equals(word)) {
                j++;
            }
            // 일치하지 않을 때
            else {
                return "No";
            }
        }
        return "Yes";
    }
}
