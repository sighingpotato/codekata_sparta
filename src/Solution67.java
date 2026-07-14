class Solution67 {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        // 암호를 풀 문장을 한 글자씩 꺼내어 검사한다.
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i); // 현재 내가 서 있는 돌
            int count = 0;           // 내가 안전하게 디딘 발걸음 수

            // 목표한 index만큼 '안전하게' 걸을 때까지 계속 반복한다.
            while (count < index) {
                curr++; // 일단 무조건 앞으로 한 칸 이동한다.

                // 만약 알파벳 끝(z)을 넘어갔다면 다시 처음(a)으로 돌아온다.
                if (curr > 'z') {
                    curr = 'a';
                }

                // 이동한 글자가 skip 문자열에 들어있는지 확인한다.
                // skip.indexOf(curr) == -1 은 "skip에 이 글자가 없다"라는 뜻.
                if (skip.indexOf(curr) == -1) {
                    count++; // 안전한 돌을 밟았으니 발걸음 수 +1
                }
                // 만약 skip에 들어있다면 count가 오르지 않아서 while문이 한 바퀴 더 돈다.
            }

            // 5번의 안전한 발걸음 끝에 최종 도착한 글자를 정답 바구니에 담는다.
            answer.append(curr);
        }

        return answer.toString();
    }
}
