import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int i = 0; i < T; i++){
			input.nextLine();
			String[] temp = input.nextLine().split(" ");
			int N = Integer.parseInt(temp[0]); //Friend count
			int X = Integer.parseInt(temp[1]); //Total Money
			int[] friends = new int[N];
			int sum = 0;
			for(int j = 0; j < N; j++){
				friends[j] = input.nextInt();
			}
	
			for(int k = 0; k < N; k++){
				sum = friends[k];
				if(sum == X){
					System.out.println("YES");
				}
				for(int l = k + 1; l < N; l++){
					sum += friends[l];
					if(sum == X){
						System.out.println("YES");
						break;
					}
					else if(sum > X){
						sum = 0;
						break;
					}
				}
				if(sum == X){
					break;
				}
			}
			if(sum != X){
				System.out.println("NO");
			}
		}
	}
}
