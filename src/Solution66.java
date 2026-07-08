import java.util.Arrays;

public class Solution66 {
    public int[] solution(String[] keymap, String[] targets) {
        // 알파벳 대문자 26개를 위한 최소 타수 저장 창고
        int[] alphabet = new int[26];

        // 최솟값 비교를 위해 모든 칸을 999로 미리 채워둔다.
        Arrays.fill(alphabet, 999);

        // 1. 자판을 돌면서 각 알파벳의 최소 타수를 배열에 기록한다.
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);

                // 문자를 배열의 인덱스(0~25)로 변환한다.
                int index = ch - 'A';
                int pressCount = i + 1; // 실제 누름 횟수 (인덱스 + 1)

                // 기존 칸에 있던 값과 현재 누름 횟수 중 더 작은 값을 저장한다.
                alphabet[index] = Math.min(alphabet[index], pressCount);
            }
        }

        // 결과를 담을 정답 배열
        int[] answer = new int[targets.length];

        // 2. 목표 문자열(targets)을 하나씩 꺼내 계산한다.
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPress = 0;        // 이 단어를 치기 위한 총 타수
            boolean isPossible = true; // 단어 완성 가능 여부

            for (int j = 0; j < target.length(); j++) {
                char ch = target.charAt(j);
                int index = ch - 'A';

                // 만약 그 자리가 여전히 999라면, 어떤 자판에도 이 글자가 없다는 뜻.
                if (alphabet[index] == 999) {
                    isPossible = false; // 만들 수 없는 단어로 판명
                    break;             // 안쪽 루프 탈출
                }

                // 자판에 있는 글자라면 해당 타수를 더해준다.
                totalPress += alphabet[index];
            }

            // 작성이 가능하면 총 타수를, 불가능하면 -1을 넣어준다.
            answer[i] = isPossible ? totalPress : -1;
        }

        return answer;
    }
}