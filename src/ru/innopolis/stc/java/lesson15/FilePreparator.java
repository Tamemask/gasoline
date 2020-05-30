package ru.innopolis.stc.java.lesson15;

public class FilePreparator {
    /**
     * Написать программу, которая будет создавать, переименовывать, копировать и удалять файл.
     * <p>
     * Написать рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.
     * <p>
     * Дополнительное задание (необязательно): программа должна следить за глубиной рекурсии,
     * сдвигая название файла/каталога на соответствующее количество пробелов.
     */
    public static void main(String[] args) {
        PreparatorMethods pm = new PreparatorMethods();
        DirectoryMethods dm = new DirectoryMethods();

/*        pm.makeFile();
        pm.renameFile();
        pm.copyFile();
        pm.deleteFile();*/
        dm.printDirectoryContents();

    }

}
