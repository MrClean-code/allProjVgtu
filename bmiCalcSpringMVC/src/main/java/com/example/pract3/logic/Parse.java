package com.example.pract3.logic;

import com.example.pract3.exception.ParseException;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class Parse {

    private static File file = null;
    private static List<String> list = null;

    public static List<String> parseFileToList() {
        try {
            file = new File("src/main/resources/static/text.txt");

            if (file == null) {
                throw new ParseException("Файл пустой");
            }
            list = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return list;
    }
}
