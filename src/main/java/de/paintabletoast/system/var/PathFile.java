package de.paintabletoast.system.var;

public enum PathFile {
    MESSAGE,
    CONFIG,
    PERMISSION,
    MYSQL,
    SETTINGS,

    ARGUMENTS,
    GENERAL,
    CONSOLE,
    USER;
    public String getPath() {
        return this.toString() + ".";
    }
}
