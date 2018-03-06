package fr.utils;

import fr.players.*;
import java.util.Scanner;
import fr.utils.Manage;

public class Main {

	public static void main(String[] args) {
		int start = 1;
		int mode;
		Manage manager = new Manage();
		
		System.out.println("============ Plus ou moins ============");
		while (start == 1) {
			System.out.println("A quel mode de jeu souhaites-tu jouer ?");
			System.out.println("- 1 pour le Mode Challenger");
			System.out.println("- 2 pour le Mode D�fenseur");
			System.out.println("- 3 pour le Mode Duel");
			System.out.print("Choisi le mode de jeu : ");
			Scanner sc = new Scanner (System.in);
			mode = sc.nextInt();
			
			if (mode == 1) {
				manager.challenger(mode);
			} else if (mode == 2) {
				manager.defender(mode);
			} else if (mode == 3) {
				manager.dual(mode);
			} else {
				System.out.println("La valeur que vous avez entr� semble incorrect ! :o");
			}
			Scanner sc1 = new Scanner (System.in);
			start = sc1.nextInt();
		}
	}
}
