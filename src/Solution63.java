public class Solution63 {
    public String solution(String X, String Y) {
        // 0부터 9까지의 개수를 담을 배열을 만든다.
        int[] countX = new int[10];
        int[] countY = new int[10];

        // 1. X가 가진 각 숫자의 개수를 센다.
        for (int i = 0; i < X.length(); i++) {
            countX[X.charAt(i) - '0']++;
        }

        // 2. Y가 가진 각 숫자의 개수를 센다.
        for (int i = 0; i < Y.length(); i++) {
            countY[Y.charAt(i) - '0']++;
        }

        // 3. 정답을 빠르게 조립할 StringBuilder를 준비한다.
        StringBuilder sb = new StringBuilder();

        // 4. 가장 큰 수를 만들어야 하므로 9부터 0까지 거꾸로 내려간다.
        for (int i = 9; i >= 0; i--) {
            // X와 Y가 공통으로 가진 개수(둘 중 더 작은 값)를 구한다.
            int commonCount = Math.min(countX[i], countY[i]);

            // 공통 개수만큼 StringBuilder에 숫자를 이어 붙인다.
            for (int j = 0; j < commonCount; j++) {
                sb.append(i);
            }
        }

        // 5. 예외 처리
        String answer = sb.toString();

        // 겹치는 숫자가 하나도 없어서 조립된 게 없다면 "-1"
        if (answer.equals("")) {
            return "-1";
        }

        // 겹치는 숫자가 있긴 한데 맨 앞자리가 "0"이라면 (즉 "000" 같은 상황)
        // 가장 큰 수가 0이라는 뜻이므로 그냥 "0"으로 반환
        if (answer.startsWith("0")) {
            return "0";
        }

        // 정상적으로 조립된 가장 큰 짝꿍 숫자를 반환
        return answer;
    }
}

