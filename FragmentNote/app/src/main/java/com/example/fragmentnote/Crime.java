package com.example.fragmentnote;

/**
 * @program: FragmentNote
 * @description:
 * @author: sz
 * @create : 2022-04-16 13:06
 **/
public class Crime {
    String teile;
    Integer id;
    String data;
    boolean isSolved;

    public Crime(String teile, Integer id, String data, boolean isSolved) {
        this.teile = teile;
        this.id = id;
        this.data = data;
        this.isSolved = isSolved;
    }

    public String getTeile() {
        return teile;
    }

    public void setTeile(String teile) {
        this.teile = teile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }
}
