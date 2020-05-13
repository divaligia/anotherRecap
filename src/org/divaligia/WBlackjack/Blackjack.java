package org.divaligia.WBlackjack;

import java.util.HashMap;

public class Blackjack {
    private HashMap<Player, Integer> players = new HashMap<>();

    public boolean add(Player player){
        if(players.containsKey(player))
        return false;
        else players.put(player, 0);
            return true;
        }

    public boolean addCard(Player player, Integer cardValue) {
        if (!players.containsKey(player)) {
            return false;
        } else {
            Integer value = players.get(player);
            value += cardValue;
            players.put(player, value);
            return true;
        }
    }

    public Integer getValue(Player player){
        int i = 0;
        if(players.containsKey(player)) {
            i = players.get(player);
            return i;
        } else return null;
    }

    
}

