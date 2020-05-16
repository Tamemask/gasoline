package ru.innopolis.stc.java.lesson15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.innopolis.stc.java.lesson7.task1.Main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class PreparatorMethods {
    public static Logger log = LoggerFactory.getLogger(Main.class);
    private static Scanner in = new Scanner(System.in);
    private String path = "B:\\SomeDir\\";
    private String path2 = "B:\\SomeDir2\\";
    private File dir;

    public File makeFile() {
        System.out.println("Назовите новый файл");
        dir = new File(path + in.nextLine() + ".txt");
        System.out.println(dir);
        return dir;
    }

    public void renameFile() {
        System.out.println("переименуйте файл");
        dir.renameTo(new File(path + in.nextLine() + ".txt"));
    }

    public void copyFile() {
        log.info("пробуем скопировать файл {} в {}", dir, path2);
        try {
            Files.copy(dir.toPath(), (new File(path2 + dir.getName())).toPath(), StandardCopyOption.REPLACE_EXISTING);
            log.info("Файл скопирован");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile() {
        log.info("пробуем удалить файл");
        dir.delete();
    }
}
