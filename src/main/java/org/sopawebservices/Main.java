package org.sopawebservices;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Main m = new Main(args);
    }

    public Main(String[] fileName) {
        getDataFromFile(fileName.length == 0? "" : fileName[0]);
    }

    public void getDataFromFile(String fileName) {
        Path path = Paths.get(fileName);
        if (!fileName.isEmpty()) {
            try (Stream<String> lineas = Files.lines(path)) {

                lineas.forEach(linea -> {String[] campos = linea.split("|");});
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

        }
    }
}