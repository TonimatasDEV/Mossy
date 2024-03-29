package dev.tonimatas.mossy.launcher;

import dev.tonimatas.mossy.Mossy;
import dev.tonimatas.mossy.logger.Logger;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LibraryInstaller.init();

        try {
            if (!ServerEula.checkEula(Path.of("eula.txt"), Arrays.stream(args).toList().contains("-accepteula"))) return;
        } catch (IOException e) {
            Logger.error("Error on load eula.");
            throw new RuntimeException(e);
        }

        Mossy.main(args);
    }
}
