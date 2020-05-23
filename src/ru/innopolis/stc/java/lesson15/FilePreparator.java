package ru.innopolis.stc.java.lesson15;
import ru.innopolis.stc.java.lesson15.PreparatorMethods;

import java.io.File;
import java.io.IOException;

public class FilePreparator {
    /**
     * Написать программу, которая будет создавать, переименовывать, копировать и удалять файл.
     *
     * Написать рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.
     *
     * Дополнительное задание (необязательно): программа должна следить за глубиной рекурсии,
     * сдвигая название файла/каталога на соответствующее количество пробелов.
     */
    public static void main(String[] args) {
        PreparatorMethods pm = new PreparatorMethods();

        pm.makeFile();
        pm.renameFile();
        pm.copyFile();
        pm.deleteFile();


    }

}
