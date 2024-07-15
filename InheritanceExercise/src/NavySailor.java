public class NavySailor extends Person {
    protected String Status;
    protected String Stationed;
    protected String Rank;

    public String getStatus() {
        return Status;
    }

    private void setStatus(String status) {
        Status = status;
    }

    public String getStationed() {
        return Stationed;
    }

    public void setStationed(String stationed) {
        Stationed = stationed;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
    }

    public NavySailor(String FName, String MInitial, String LName, String Gndr, String Stat, String Stnd, String Rnk) {
        super(FName,MInitial,LName,Gndr);
        setStatus(Stat);
        setStationed(Stnd);
        setRank(Rnk);
    }
public String toString() {
        String personalInfo = super.toString();
        return personalInfo + "Sailor Info: " + " " + "Sailor's Service Status: " + getStatus() + " " + "Sailor's Station: " + getStationed() + " " + "Sailor's Rank: " + getRank();
}
}
