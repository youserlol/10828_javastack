import java.util.Scanner;

public class Main {
	
	public static int [] stack;
	//Stack <Integer> = new Stack<>();
	public static int size = 0;
	
	public static void push(int pushNum) {
		stack[size] = pushNum;
		size++;
	}
	
	public static int pop() {
		if (size == 0) {
			return -1;
		}
		else {
			// 4개의 요소가 있으면 0,1,2,3 임으로 인덱스 번호를 따지기 위해 -1을 한다. 
			int res = stack[size-1]; 
			stack[size-1] = 0;
			size--;
			return res;
		}
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if (size == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int top() {
		if (size == 0) {
			return -1;
		} else {
			int res = stack[size -1];
			return res;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = s.nextInt();
		
		stack = new int[n];
		
		for (int i=0; i<n; i++) {
			
			String str = s.next();
			
			switch(str) {
			
			case "push" :
				push(s.nextInt());
				break;
				
			case "pop" :
				sb.append(pop()).append('\n');
				break;
				
			case "size" :
				sb.append(size()).append('\n');
				break;
				
			case "empty" :
				sb.append(empty()).append('\n');
				break;
				
			case "top" :
				sb.append(top()).append('\n');
				break;
			}
		}
		System.out.println(sb);
	
	}

}
