import java.util.Scanner;
public class giteclipse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner in = new Scanner (System.in); 
		String oikeaNimi = "Heidi";
		String vastaus;
		int arvaustenMaara = 0;
		
		System.out.println("Arvaa nimi?");
	do 	
		{
		
		vastaus = in.nextLine();
		arvaustenMaara++;
		if(vastaus.equals(oikeaNimi))
			
		{
			System.out.println("Arvasit oikein.Peli loppui!");
			break;
		}
		
		else if (vastaus.equals("loppu"))
		
		{ 
			System.out.println("Peli loppui!");
			break;
		}
		
		else
			
		{
			System.out.println("Arvasit väärin, yritä uudestaan!");
			
		}
		
		}
		while (true);
		
	System.out.println("Arvasit " + arvaustenMaara + " kertaa");
}
}
			




		
		
	


		
	




	

		

