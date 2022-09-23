package Advance;
import java.util.*;
public class GenerateBill {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		GetPlanFactory g=new GetPlanFactory();
		/**Plan plan=g.getPlan("CommercialPlan");
		plan.getRate();
		plan.calculateBill(100);**/
		boolean flag=true;
		while(flag)
		{
		System.out.println("1.domesticplan\n2.commercilaplan\n3.institutionalplan\n4.exit");
		System.out.println("enter your choice");
		int ch=s.nextInt();
		switch (ch) {
		case 1:
		{
			Plan plan=g.getPlan("DomesticPlan");
			plan.getRate();
			plan.calculateBill(100);
			
		}
			
			break;
		case 2:
		{
			Plan plan=g.getPlan("CommercialPlan");
			plan.getRate();
			plan.calculateBill(100);
			
		}

			break;
		case 3:
		{
			Plan plan=g.getPlan("InstitutionalPlan");
			plan.getRate();
			plan.calculateBill(500);
			
		}
		break;
		case 4:
		{
			flag=false;
		}
		default:
		{
			System.out.println("enter valid input");
		}
		
		}
	}
	}
	

}
