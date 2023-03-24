package com.heygilly.springbootapplication.models;

public enum Positions {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    public String toString(){
        return switch (this) {
            case CONCIERGE -> "Concierge";
            case SECURITY -> "Security";
            case HOUSEKEEPING -> "Housekeeping";
            case FRONT_DESK -> "Front Desk";
        };
    }
}
