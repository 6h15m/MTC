package Codility;

public class Lesson3_1 {
//1��° �õ� : 44% - runtime Error �߻�
	static int solution(int X,int Y,int D) {
		int count=0;
		while(Y>X) {
			X+=D;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(solution(10,85,30));
	}

}
