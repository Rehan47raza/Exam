package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class IplManagement 
{
	private ArrayList<Team> teamList=new ArrayList<Team>();
	public int addTeam(Team t1)
	{
		if(teamList.size()!=0)
		{
		for(int i=0;i<teamList.size();i++)
		{
			if(t1.getRegion().equalsIgnoreCase(teamList.get(i).getRegion()))
				return -2;
			else 
				{
				teamList.add(t1);
				return teamList.size();
				}
			
		}
		}
		return -1;
	}
	public int addPlayer(Player player) {

		int count = -1;

		for (int i = 0; i < teamList.size(); i++) {

			//String ipmTeam = teamList.get(i).getName();

			if (teamList.get(i).getName().equalsIgnoreCase(player.getIpl_Team())) {
				List<Player> plyrList = teamList.get(i).getPlayers();
				List<String> playerNameList = new ArrayList<String>();
				for (int j = 0; j < plyrList.size(); j++) {
					playerNameList.add(plyrList.get(j).getName());
				}
				
				if (playerNameList.contains(player.getName())) {
					count = -2;
				} else {
					plyrList.add(player);
					//teamList.get(i).setPlayers(plyrList);
					count = plyrList.size();
				}
			}
		}

		return count;
	}
	public Set<String> getCaptainName()
	{
		Set<String> captain=new HashSet<String>();
		for(int i=0;i<teamList.size();i++)
		{
			List<Player> plyrList = teamList.get(i).getPlayers();
			
		if(( (Player) teamList.get(i).getPlayers()).getRole().equalsIgnoreCase("captain"))
				{
			if (plyrList.get(i).getRole().equalsIgnoreCase("Caption")) 
			{
				captain.add(plyrList.get(i).getName());
			}
				}
	}
		return captain;

}
	public Map<Integer,Player> getPlayersMapByRegion(String s)
	{
		Map<Integer,Player> mp=new HashMap<Integer,Player>();
		Player pl;
		for(int i=0;i<teamList.size();i++)
		{
			if(teamList.get(i).getRegion().equalsIgnoreCase(s))
			{
				List<Player> plyrList = teamList.get(i).getPlayers();
				for(int j=0;j< plyrList.size();j++)
				{
				mp.put(( plyrList.get(j).getShirt_no(),plyrList.get(j)));
				}
			}
		}
		return mp;
	}
	public TreeSet<Player> getPlayerSortedByAge()
	{
		TreeSet<Player> t=new TreeSet<Player>();
		for(int i=0;i<teamList.size();i++)
		{
			List<Player> plyrList = teamList.get(i).getPlayers();
			for(int j=0;j< plyrList.size();j++)
			{
				t.add(plyrList.get(j) );
			}
		}
		return t;
	}
}
