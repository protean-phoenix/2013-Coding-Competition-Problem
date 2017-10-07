package com.sf.codingcomp.football;

import java.util.ArrayList;
import java.util.List;

public class Team {

	private List<Player> players = new ArrayList<Player>();
	private int qbs = 0;
	private int rbs = 0;
	private int wrs = 0;

	public void addPlayer(Player player, LeagueOptions options) throws TooManyPlayersException {
		players.add(player);
		if(player instanceof Quarterback) {
			qbs ++;
		}
		else if(player instanceof RunningBack) {
			rbs ++;
		}
		else {
			wrs ++;
		}
		if(qbs > options.getMaximumPlayersAtEachPosition()||rbs > options.getMaximumPlayersAtEachPosition()||wrs > options.getMaximumPlayersAtEachPosition()) {
			throw(new TooManyPlayersException());
		}
	}

	public boolean wins(Team opponent, LeagueOptions options) {
		if(this.total(options) > opponent.total(options)) {
			return true;
		}
		return false;
	}

	public double total(LeagueOptions options) {
		double total = 0;
		for(Player player : players) {
			total += player.calculateTotalScore(options.isPartialPointsAllowed());
		}
		return  Math.round(total * 100d) / 100d;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}
