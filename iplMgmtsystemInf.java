package com;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public interface iplMgmtsystemInf 
{
	public int addTeam(Team t);
	public int addPlayer(Player p);
	public Set<String> getcaptainName();
	public Map<Integer,Player> getPlayersMapByRegion(String s);
	public TreeSet<Player> getPlayerSortedByage();
	
	

}
