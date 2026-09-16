package git1;

import java.util.Scanner;

public class Kaulins {
	static int MestKaulinu(int reizes) {
		int min=6, max=0;
		int skaitlis[] = new int [reizes];
		for (int i=0; i<reizes; i++) {
			skaitlis[i] = (int)(Math.random()*6)+1;
			System.out.println("Uzkrita skaitlis: " + skaitlis[i]);
			if(skaitlis[i] > max) {
				max = skaitlis[i];
			}
			if (skaitlis[i] < min) min = skaitlis[i];
		}
		for (int i=0; i<skaitlis.length; i++) {
			System.out.println(skaitlis[i]);
		}
		System.out.println("Lielākais skaitlis no visiem metieniem: " + max);
		return min;
	}

	public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Cik reizes mest kauliņu? ");
		reizes = scan.nextInt();
		System.out.println("Mazākais skaitlis no viesiem metieniem: " + MestKaulinu(reizes));

		scan.close();
	}
}
