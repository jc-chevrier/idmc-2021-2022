package fr.unilorraine.idmc.gamescatalog.config;

public interface PasswordChecker {
    boolean areEqual(String source, String target);
}
