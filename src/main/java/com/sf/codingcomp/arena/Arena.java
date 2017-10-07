package com.sf.codingcomp.arena;

public class Arena {

	public Character fight(Character character1, Character character2) throws NoStaminaException {
			System.out.println("FIGHT START: char1.stamina="+character1.getStamina());
			System.out.println("FIGHT START: char2.stamina="+character2.getStamina());
			if(character1.getStamina() < 0|| character2.getStamina() < 0) {
				throw new NoStaminaException();
			}
			
			double total1 = character1.getAttack()+character1.getDefense()*.75;
			double total2 = character2.getAttack()*.75+character2.getDefense();
			int loserStamina;
			
			if(total2 > total1) {
				loserStamina = character1.getStamina();
				character1.setStamina(loserStamina-1);
				return character2;
			}
			loserStamina = character2.getStamina();
			character2.setStamina(loserStamina-1);
			return character1;
	}
}
