package org.divaligia.WKindergarten;

public class Kind {
    private String vname;
    private String nname;
    private int alter;

    public Kind(String vname, String nname, int alter) {
        this.vname = vname;
        this.nname = nname;
        this.alter = alter;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Kind{" +
                "vname='" + vname + '\'' +
                ", nname='" + nname + '\'' +
                ", alter=" + alter +
                '}';
    }
}
