package TP7.player;

import java.util.HashMap;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PlayerManager	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 05/03/17 18:54
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class PlayerManager
{
    private HashMap<String, Player> players = new HashMap<>();
    
    public Player getPlayer (String name)
    {
        return players.get(name);
    }
    
    public void addPlayer (String name, float moneyCount)
    {
        if(!(players.containsKey(name) || players.containsValue(new Player(name, moneyCount))))
        {
            players.put(name, new Player(name, moneyCount));
        }
    }
    
    public void addPlayer (Player player)
    {
        if(!(players.containsKey(player.getName()) || players.containsValue(player)))
        {
            players.put(player.getName(), player);
        }
    }
    
    public void deletePlayer (String name)
    {
        players.remove(name);
    }
    
    public void deletePlayer (Player player)
    {
        players.remove(player.getName());
    }
}
