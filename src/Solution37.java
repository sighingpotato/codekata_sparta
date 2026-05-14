public class Solution37 {
    public int[][] solution37(int[][] arr1, int[][] arr2) {
        // 결과를 담을 2차원 배열 생성
        int[][] answer = new int[arr1.length][arr1[0].length];

        // 바깥쪽 for문은 행을 차례로 내려가며 반복
        for (int i = 0; i< arr1.length; i++) {

            // 안쪽 for문은 열을 차례로 이동
            for (int j = 0; j < arr1[i].length; j++) {

                // 같은 위치에 있는 두 값을 더해서 결과 배열에 저장
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
