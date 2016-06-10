import java.util.Scanner;
public class Sumoftwotypes {
		int numberone;
		float numbertwo;
		int total;
	
	@SuppressWarnings("resource")
	public void calculate(){
		Scanner get = new Scanner(System.in);
		System.out.print("Enter integer one :");
		int numberone = get.nextInt();
		this.numberone = numberone;
		System.out.print("Enter float Number :");
		float numbertwo = get.nextFloat();
		this.numbertwo = numbertwo;
		int total = (int)(numberone + numbertwo);
		System.out.println("total = "+ total);
		
		
	}
	public static void main(String[] args) {
		Sumoftwotypes stn = new Sumoftwotypes();
		stn.calculate();
	}
	
}
