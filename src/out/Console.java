package out;

import gui.Play;
import personagem.Character;
import personagem.Hero;

public abstract class Console {
		
	
	public static void print(String string) {
		System.out.println(string);
		Play.idle.print(string);
	}
	
	
	public static void printAllCharacterInfo(Hero character) {
		System.out.printf("Nome: %s\nJob: %s\n", character.getName(), character.getJOB());
		System.out.printf("Level: %d\n", character.getLevel());
		printAttributesOf(character);
		System.out.printf("\nPower: %d\nHP: %d\nXP: %d\n", character.getPower(), character.getHp(), character.getXp());
	}
	
	
	public static void printAttributesOf(Character character) {
		for (int i=0; i < 6; i++)
			System.out.printf("[%d] %s = %d\n", i+1, character.getAttrNames()[i], character.getAttributes()[i]);
	}
	
	
	public static void printAtackLog(Character c1, Character c2, int damage) {
		String string = c1.getName() + "("+ c1.getHp() +") causou "+ damage +" de dano em "+ c2.getName() +"("+ c2.getHp() +")";
		System.out.printf(string + "\n");
		Play.idle.print(string);
	}
	
	
	public static void printEndOfBattle(Character winner) {
		System.out.printf("%s venceu!\n", winner.getName());
		Play.idle.print(winner.getName() + " VENCEU!");
	}
	
	
	public static void printGameOver() {
		System.out.println("DEVEU! GAME OVER!");
		Play.idle.print("DEVEU! GAME OVER!");
	}
	
	
	public static void printIncreaseXP(int xp) {
		System.out.printf("Ganhou +%d XP\n", xp);
		Console.print("Ganhou +"+xp+" XP");
	}
	
	
	public static void levelUp(Character c) {
		String s;
		s = (c.getName() + " LEVEL UP! Novo nível --> "+ c.getLevel());
		System.out.printf(s.toString());
		Play.idle.print(s.toString());	
	}
	

}
