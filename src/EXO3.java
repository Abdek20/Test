import java.util.Scanner;


public class EXO3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int nbr,fact=1;
		System.out.println("Veuillez saisir une nbr\n");
		nbr=sc.nextInt();
		for(int i=1;i<=nbr;i++){
			fact=fact*i;
		}
		System.out.println("le fact est ="+fact);

	}

}
