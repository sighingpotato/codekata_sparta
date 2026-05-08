public class Solution30 {
    public String solution30(String s) {
        int length = s.length();
        int mid = length / 2;

        if (length % 2 == 0 ) {
            // 길이가 짝수인 경우 : 중간 인덱스보다 한 칸 앞부터 중간 인덱스까지
            return s.substring(mid - 1, mid + 1);
        } else {
            // 길이가 홀수인 경우 : 중간 인덱스 한 글자만
            return s.substring(mid, mid + 1);
        }
    }
}
