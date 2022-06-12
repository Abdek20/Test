import java.util.Scanner;
public class MOYENNE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nbr, cpt=0;
		double moy;
		System.out.println("Veuillez le nbr d etudiant");
		nbr=sc.nextInt();
		for(int i=0;i<nbr;i++){
			System.out.println("saisir le moyenne ");
			moy=sc.nextDouble();
			if(moy>=10){
				cpt=cpt+1;
			}
		}
		System.out.println("le nbr>10"+cpt);
	}

}
