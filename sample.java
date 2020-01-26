import java.io.*;
import java.util.Scanner;
class solution{
	public void solution(int N){
		char ch = 'A';
		for(int i=0;i<N;i++){
			int as = ch+i;
			char c = (char)as;
			System.out.print(c);
		}
	}
}

class sample{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		solution s = new solution();
		s.solution(N);
	}
}

