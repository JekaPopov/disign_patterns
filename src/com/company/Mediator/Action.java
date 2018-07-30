package com.company.Mediator;

public enum Action {

    SINGLY("to wrap up box 1", "to wrap up box2"),
    MARK("add marked", "remove marked"),
    GIFT("add gift", "remove gift"),
    NONE("", "");

    private String title;
    private String description;

    Action(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return title;
    }
}

