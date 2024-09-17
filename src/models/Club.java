package models;

public class Club {

    int clubId;

    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public String getExclusiveClub() {
        return exclusiveClub;
    }

    public void setExclusiveClub(String exclusiveClub) {
        this.exclusiveClub = exclusiveClub;
    }

    public String getInclusiveClub() {
        return inclusiveClub;
    }

    public void setInclusiveClub(String inclusiveClub) {
        this.inclusiveClub = inclusiveClub;
    }

    public Club(int clubId, String exclusiveClub, String inclusiveClub) {
        this.clubId = clubId;
        this.exclusiveClub = exclusiveClub;
        this.inclusiveClub = inclusiveClub;
    }

    String exclusiveClub;
    String inclusiveClub;

}
