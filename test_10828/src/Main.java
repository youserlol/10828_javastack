import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 입력을 받기 위한 Scanner 객체 생성
        int n = sc.nextInt(); // 명령의 개수 입력
        ArrayList<Integer> stack = new ArrayList<>(); // 스택 역할을 할 ArrayList 생성
        StringBuilder sb = new StringBuilder(); // 출력 속도 향상을 위한 StringBuilder 사용

        for (int i = 0; i < n; i++) {
            String cmd = sc.next(); // 명령어 입력하기

            switch (cmd) {

                case "push":
                    // push 명령: 입력받은 정수를 리스트 끝에 추가
                    stack.add(sc.nextInt());
                    break;

                case "pop":
                    // pop 명령: 리스트가 비어있으면 -1 출력, 아니면 마지막 요소 제거 후 출력
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        // remove(size-1): 리스트의 마지막 요소를 제거하고 반환
                        sb.append(stack.remove(stack.size() - 1)).append("\n");
                    }
                    break;

                case "size":
                    // size 명령: 리스트의 크기 = 스택에 들어 있는 원소의 수
                    sb.append(stack.size()).append("\n");
                    break;

                case "empty":
                    // empty 명령: 리스트가 비었으면 1, 아니면 0
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;

                case "top":
                    // top 명령: 리스트가 비었으면 -1 출력, 아니면 마지막 요소 확인만
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        // get(size-1): 리스트의 마지막 요소 반환 (삭제는 하지 않음)
                        sb.append(stack.get(stack.size() - 1)).append("\n");
                    }
                    break;
            }
        }

        // 결과 출력
        System.out.println(sb);
    }
}
