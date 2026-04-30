public class Solution24 {
    public String solution24(String[] seoul) {
        int x = 0; // 김서방의 위치를 저장할 변수

        // 배열의 처음부터 끝까지 하나씩 확인
        for (int i = 0; i < seoul.length; i++) {
            // 현재 위치의 이름이 "Kim"인지 확인
            if (seoul[i].equals("Kim")) {
                x = i; // 김서방의 위치를 찾았으면 x에 저장
                break; // 김서방을 찾았으므로 반복 종료
            }
        }
        // 결과 문자열을 반환
        return "김서방은 " + x + "에 있다";
    }
}
