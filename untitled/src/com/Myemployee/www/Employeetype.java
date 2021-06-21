package com.Myemployee.www;

public enum Employeetype {
    PERMANENT(1, "Permanent"),
    CONTRACT(2, "Contract");
    private int typeofemp;
    private String description;

    Employeetype(int typeofemp, String description) {
        this.typeofemp = typeofemp;
        this.description = description;
    }

    public int getTypeofemp() {
        return typeofemp;
    }

    public String getDescription() {
        return description;
    }
}

