import java.util.Scanner;
public class Triangles{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number ");
		int number=input.nextInt();
		LeftTriangle(number);
		System.out.println();
		RightUpTriangle(number);
		System.out.println();
		RightTriangle(number);
		System.out.println();
		UpsideDownLeftTriangle(number);
		leftNumTriangle(number);
		System.out.println();
		middleNumTriangle(number);
		System.out.println();
		holyDiamond(number);
	}	
	public static void LeftTriangle(int n){
		for(int i=1; i<=n; i++){
			for (int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void RightTriangle(int n){
		for (int j=1; j<=n; j++){
			for(int i=n; i>=1; i--){
				if(i>j){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}
	public static void UpsideDownLeftTriangle(int n){
		for (int j=n; j>=1; j--){
			for (int i=1; i<=n; i++){
				if(i>j){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void RightUpTriangle(int n){
		for (int j=n; j>=1; j--){
			for(int i=n; i>=1; i--){
				if(i<=j){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}}
	public static void leftNumTriangle(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void middleNumTriangle(int n){
		for(int i=1; i<=n; i++){
			for(int k=n-i; k>=1; k--){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print(i+" ");
			}
			System.out.println();

		}
	}
	public static void holyDiamond(int n){
		for (int i=1; i<=n; i++){
			for(int k=n-i; k>=1; k--){
				System.out.print(" ");
			}
			for (int j=i; j>=1;j--){
				System.out.print(j+" ");
			}
			for(int j=2; j<=i;j++){
				System.out.print(j+" ");
			}
				System.out.println();	
		}
	}
}