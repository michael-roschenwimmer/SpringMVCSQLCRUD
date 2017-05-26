package data;

import java.util.List;

public interface ChampionDAO {
	public List<Champion> getAllChampions();
	public String getChampionName(String name);
	public String getChampionRole(String role);     
//	public void addOverpoweredChampionToList(String id, String championName, String championRole);
	public void deleteOverpoweredChampionFromDB(String championName);
	public void addOverpoweredChampionToDB(Champion champion);
}
