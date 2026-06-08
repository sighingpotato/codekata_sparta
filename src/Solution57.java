import java.util.ArrayList;
import java.util.List;

class Solution57 {
    public int[] solution57(int[] answers) {
        // 1. 수포자 삼인방의 찍기 패턴을 배열로 정의한다.
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 각 수포자의 맞힌 개수를 저장할 배열
        int[] scores = new int[3];

        // 2. 시험 문제를 하나씩 채점한다.
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) scores[0]++;
            if (answers[i] == p2[i % p2.length]) scores[1]++;
            if (answers[i] == p3[i % p3.length]) scores[2]++;
        }

        // 3. 세 사람 중 가장 높은 점수를 찾는다.
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 4. 최고점을 받은 사람들을 찾아서 리스트에 담는다.
        List<Integer> list = new ArrayList<>();
        if (scores[0] == maxScore) list.add(1);
        if (scores[1] == maxScore) list.add(2);
        if (scores[2] == maxScore) list.add(3);

        // 5. 결과를 일반 int[] 배열로 변환하여 반환한다.
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}