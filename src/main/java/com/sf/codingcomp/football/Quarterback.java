package com.sf.codingcomp.football;

public class Quarterback extends Player {
	
	private final double TD_MOD = 5;
	private final double YARD_MOD = 25;

	public Quarterback(int touchdowns, int yardsGained, boolean active) {
		super(touchdowns, yardsGained, active);
	}

	@Override
	public double calculateTotalScore(boolean partialPointsAllowed) {
		double total = touchdowns*TD_MOD+yardsGained/YARD_MOD;
		if(partialPointsAllowed) {
			return total;
		}
		return (double)((int)total);
	}

}
