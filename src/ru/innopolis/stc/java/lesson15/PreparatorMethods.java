package ru.innopolis.stc.java.lesson15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.innopolis.stc.java.lesson7.task1.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class PreparatorMethods {
    public static Logger log = LoggerFactory.getLogger(Main.class);
    private static Scanner in = new Scanner(System.in);
    private String path = ".\\src\\ru\\innopolis\\stc\\java\\lesson15";
    private String path2 = ".\\src\\ru\\innopolis\\stc\\java";
    private String fileName;
    private File dir;

    public File makeFile() {
        log.info("Создаем новый файл");
        System.out.println("Назовите новый файл");

        dir = new File(path,  in.nextLine() + ".txt");
        try {
            FileWriter fw = new FileWriter(dir);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(dir + " создан");
        return dir;
    }

    public void renameFile() {
        System.out.println("переименуйте файл" + dir.getName());
        fileName = in.nextLine();
        dir.renameTo(new File(path, fileName +".txt"));
        System.out.println(dir.getName());
    }

    public void copyFile() {
        log.info("пробуем скопировать файл {} в {}", dir, path);
        Path path2 = Paths.get(path + "\\" + fileName + ".txt");
        try {
            Files.copy(path2, (new File(path,  dir.getName())).toPath(), StandardCopyOption.REPLACE_EXISTING);
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
