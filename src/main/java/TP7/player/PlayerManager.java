package TP7.player;

import java.util.HashMap;

/*................................................................................................................................
 . Copyright (c)
 .
 . The PlayerManager	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:36
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

/**
 * <h2>Class handling all the players of the game.</h2>
 * It has no other purpose than managing players (add, delete).
 */
public class PlayerManager {
    private HashMap<String, Player> players = new HashMap<>();

    public Player getPlayer(String name) {
        return players.get(name);
    }

    /**
     * <h3>Adds a player to [players].</h3>
     * 1) Creates a new player with [name] and [moneyCount].<br>
     * 2) If [players] doesn't contain that new player, adds it to the list.
     *
     * @param name       Name of the player to create and add.
     * @param moneyCount Money of the player to create and add.
     */
    public void addPlayer(String name, float moneyCount) {
        Player player = new Player(name, moneyCount);

        if (!(players.containsKey(name) || players.containsValue(player))) {
            players.put(name, player);
        }
    }

    /**
     * <h3>Adds a player to [players].</h3>
     * If [players] doesn't contain [player], adds it to the list.
     *
     * @param player Player to add to [players].
     */
    public void addPlayer(Player player) {
        if (!(players.containsKey(player.getName()) || players.containsValue(player))) {
            players.put(player.getName(), player);
        }
    }

    /**
     * <h3>Deletes a player of name = [name].</h3>
     *
     * @param name Name of the player to delete.
     */
    public void deletePlayer(String name) {
        players.remove(name);
    }

    /**
     * <h3>Deletes a player of name = [name].</h3>
     *
     * @param player Player to delete.
     */
    public void deletePlayer(Player player) {
        deletePlayer(player.getName());
    }
}
