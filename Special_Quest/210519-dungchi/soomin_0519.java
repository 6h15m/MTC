package Special_Quest;

import java.util.Scanner;
//���� ���α׷��ӽ� - ��ġ 
public class soomin_0519 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int[][] arr = new int[num][2];
		//�����ŭ �迭�� �����ϱ�
		for(int i = 0; i < num; i++) {
			arr[i][0] = scan.nextInt();	
			arr[i][1] = scan.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			int rank = 1;
			
			for(int j = 0; j < num; j++) {
				if(i == j) continue;
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			System.out.print(rank + " ");
		}
	}

}
