import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 가로 길이와 세로 길이를 입력 받는다.
        int a = sc.nextInt();
        int b = sc.nextInt();

        // for문: 세로 줄만큼 반복
        for (int i = 0; i < b; i++) {

            // for문: 가로 개수만큼 별을 가로로 이어서 출력
            for (int j = 0; j < a; j++) {
                System.out.print("*"); // 줄 바꿈 없이 출력
            }
        }
        // 한 줄이 끝나면 줄 바꿈을 한다.
        System.out.println();
    }
}
