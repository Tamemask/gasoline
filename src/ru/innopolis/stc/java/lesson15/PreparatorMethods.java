package ru.innopolis.stc.java.lesson15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.innopolis.stc.java.lesson7.task1.Main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class PreparatorMethods {
    public static Logger log = LoggerFactory.getLogger(Main.class);
    private static Scanner in = new Scanner(System.in);
    private String path = ".\\src\\ru\\innopolis\\stc\\java\\lesson15";
    private String path3 = ".\\src\\ru\\innopolis\\stc\\java";
    private String fileName;
    private File file;
    private File copiedFile;
    private String path2 = "B:\\SCUM\\dowloads2\\Innopolis_data";

    public File makeFile() {
        log.info("Создаем новый файл");
        System.out.println("Назовите новый файл");

        file = new File(path, in.nextLine() + ".txt");
        try {
            file.exists();
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file + " создан");
        return file;
    }

    public File makeDir() {
        log.info("Создаем новую директорию");

        for (int i = 0; i < 40; i++) {
            boolean file2 = new File(path2 + "\\lesson" + i).mkdir();
        }

        System.out.println(file + " создан");
        return file;
    }

    public void renameFile() {
        System.out.println("переименуйте файл" + file.getName());
        fileName = in.nextLine();
        File f = new File(path, fileName + ".txt");
        file.renameTo(f);
        file = f;
        System.out.println(file.getName());
    }

    public void copyFile() {
        log.info("пробуем скопировать файл {} в {}", file, path3);
        File f2 = new File(path3 + "\\" + file.getName() + ".txt");
        try {
            Files.copy(file.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            log.info("Файл скопирован");
        } catch (IOException e) {
            e.printStackTrace();
        }
        copiedFile = f2;
    }

    public void deleteFile() {
        log.info("пробуем удалить файл");
        file.delete();
        if (!file.exists())
            System.out.println("Файл удален " + file.toString());
    }

    public File getFile() {
        this.file = file;
        return file;
    }

    public void directoryConvoy() {
        file.toPath();
    }
}
