package Special_Quest;

//DFS�˰��� ���ο� �纹���� �ʿ��� ����
//�����ڵ�
//https://fbtmdwhd33.tistory.com/36
import java.util.Scanner;

public class N��_M {
	static int M,N;
	static int arr[];
	static int check[];
	
	static void dfs(int cnt) {
		if(cnt == M) {
			for(int i=0;i<M;i++) {
				System.out.print(arr[i]+" ");
			}System.out.println("");
			return;
		}
		
		for(int i =1;i<=N;i++) {
			if(check[i]==1) {
				continue;
			}else {
				check[i]=1;
				arr[cnt]=i;
				dfs(cnt+1);
				check[i]=0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		N=scan.nextInt();
		M=scan.nextInt();
		arr = new int [9];
		check = new int[9]; //8+1 0���� �������� 8���� �Ѵٰ� �����ϱ�
		dfs(0);
	}
	
}

