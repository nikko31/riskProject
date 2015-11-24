package risk.player;

import risk.GameResources.COLOR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {
    private int playerID;
    private String playerName;
    private int freeUnits;
    private COLOR playerColor;

    private List<String> continentList;

    public Player(int playerID, String playerName, int freeUnits, COLOR color) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.playerColor = color;
        this.freeUnits = freeUnits;
        this.continentList = new ArrayList<>();
    }

    public int getPlayerID() {
        return playerID;
    }


    public String getPlayerName() {
        return playerName;
    }


    public int getFreeUnits() {
        return freeUnits;
    }

    public void setFreeUnits(int freeUnits) {
        this.freeUnits = freeUnits;
    }

    public COLOR getPlayerColor() {
        return playerColor;
    }


    public List<String> getContinentList() {
        return continentList;
    }

    public void setContinentList(List<String> continentList) {
        this.continentList = continentList;
    }
}