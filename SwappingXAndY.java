import java.util.Scanner;

public class SwappingXAndY {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Swapping");
		System.out.println("Please Enter X/1st value: ");
		int x = scanner.nextInt();
	
		System.out.println(" ");
		System.out.println("Please Enter Y/2nd value: ");
		int y = scanner.nextInt();
		
		System.out.println(" ");
		System.out.println("You entered values: " + x + " and " + y);
		
		x = x + y;   
        y = x - y;   
        x = x - y; 
		
		System.out.println("Swapped values are: " + x + " and " + y);
	}
}
