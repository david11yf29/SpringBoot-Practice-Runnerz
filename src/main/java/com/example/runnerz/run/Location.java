package com.example.runnerz.run;

public enum Location implements javax.xml.stream.Location {
    INDOOR, OUTDOOR;

    @Override
    public int getLineNumber() {
        return 0;
    }

    @Override
    public int getColumnNumber() {
        return 0;
    }

    @Override
    public int getCharacterOffset() {
        return 0;
    }

    @Override
    public String getPublicId() {
        return "";
    }

    @Override
    public String getSystemId() {
        return "";
    }
}
