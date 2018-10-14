package io.fintel.iex.model;

import java.time.LocalDate;

public class Symbol {

    private String symbol;
    private String name;
    private String date;
    private boolean isEnabled;
    private String type;
    private int iexId;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIexId() {
        return iexId;
    }

    public void setIexId(int iexId) {
        this.iexId = iexId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
