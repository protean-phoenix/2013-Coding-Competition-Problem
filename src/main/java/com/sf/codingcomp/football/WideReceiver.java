package com.sf.codingcomp.football;

import java.text.DecimalFormat;

public class WideReceiver extends Player {
	
	private final double TD_MOD = 6;
	private final double YARD_MOD = 10;

	public WideReceiver(int touchdowns, int yardsGained, boolean active) {
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
