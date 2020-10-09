package sinya_jaba;
import java.util.Scanner;
public class cena_boia {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter width");
		double width = sc. nextDouble();
		System.out.println("Enter height");
		double height = sc. nextDouble();
		System.out.println("Enter lenght");
		double lenght = sc. nextDouble();
		
		int Area = (int) Math.ceil (width * lenght +2*((width +lenght) *height));
		
		int fiveLcost =15, oneLcost = 4;
		int fiveLareacover = 140, oneLareacover = 30;
		int fiveLBucket = 0, oneLbucket = 0;
		
		fiveLBucket += Area / fiveLareacover;
		int AreaLeft = Area % fiveLareacover;
		oneL
		

	}

}
