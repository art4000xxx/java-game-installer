import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameInstaller {

    public static void main(String[] args) {
        // Определяем путь к папке Games
        String gamesPath = "C://games";

        // Создаем основные директории
        File srcDir = new File(gamesPath, "src");
        File resDir = new File(gamesPath, "res");
        File savegamesDir = new File(gamesPath, "savegames");
        File tempDir = new File(gamesPath, "temp");

        // Создаем эти директории, если они не существуют
        if (!srcDir.exists()) {
            if (srcDir.mkdir()) {
                System.out.println("Директория src создана");
            } else {
                System.out.println("Не удалось создать директорию src");
            }
        } else {
            System.out.println("Директория src уже существует");
        }

        if (!resDir.exists()) {
            if (resDir.mkdir()) {
                System.out.println("Директория res создана");
            } else {
                System.out.println("Не удалось создать директорию res");
            }
        } else {
            System.out.println("Директория res уже существует");
        }

        if (!savegamesDir.exists()) {
            if (savegamesDir.mkdir()) {
                System.out.println("Директория savegames создана");
            } else {
                System.out.println("Не удалось создать директорию savegames");
            }
        } else {
            System.out.println("Директория savegames уже существует");
        }

        if (!tempDir.exists()) {
            if (tempDir.mkdir()) {
                System.out.println("Директория temp создана");
            } else {
                System.out.println("Не удалось создать директорию temp");
            }
        } else {
            System.out.println("Директория temp уже существует");
        }

        // Создаем поддиректории в src
        File mainDir = new File(srcDir, "main");
        File testDir = new File(srcDir, "test");

        // Создаем поддиректории в src, если они не существуют
        if (!mainDir.exists()) {
            if (mainDir.mkdir()) {
                System.out.println("Директория main создана");
            } else {
                System.out.println("Не удалось создать директорию main");
            }
        } else {
            System.out.println("Директория main уже существует");
        }

        if (!testDir.exists()) {
            if (testDir.mkdir()) {
                System.out.println("Директория test создана");
            } else {
                System.out.println("Не удалось создать директорию test");
            }
        } else {
            System.out.println("Директория test уже существует");
        }

        // Создаем файлы в src/main
        File mainJava = new File(mainDir, "Main.java");
        File utilsJava = new File(mainDir, "Utils.java");

        // Создаем файлы в src/main, если они не существуют
        try {
            if (!mainJava.exists()) {
                if (mainJava.createNewFile()) {
                    System.out.println("Файл Main.java создан");
                } else {
                    System.out.println("Не удалось создать файл Main.java");
                }
            } else {
                System.out.println("Файл Main.java уже существует");
            }

            if (!utilsJava.exists()) {
                if (utilsJava.createNewFile()) {
                    System.out.println("Файл Utils.java создан");
                } else {
                    System.out.println("Не удалось создать файл Utils.java");
                }
            } else {
                System.out.println("Файл Utils.java уже существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файлов: " + e.getMessage());
        }

        // Создаем поддиректории в res
        File drawablesDir = new File(resDir, "drawables");
        File vectorsDir = new File(resDir, "vectors");
        File iconsDir = new File(resDir, "icons");

        // Создаем поддиректории в res, если они не существуют
        if (!drawablesDir.exists()) {
            if (drawablesDir.mkdir()) {
                System.out.println("Директория drawables создана");
            } else {
                System.out.println("Не удалось создать директорию drawables");
            }
        } else {
            System.out.println("Директория drawables уже существует");
        }

        if (!vectorsDir.exists()) {
            if (vectorsDir.mkdir()) {
                System.out.println("Директория vectors создана");
            } else {
                System.out.println("Не удалось создать директорию vectors");
            }
        } else {
            System.out.println("Директория vectors уже существует");
        }

        if (!iconsDir.exists()) {
            if (iconsDir.mkdir()) {
                System.out.println("Директория icons создана");
            } else {
                System.out.println("Не удалось создать директорию icons");
            }
        } else {
            System.out.println("Директория icons уже существует");
        }

        // Создаем файл temp.txt в temp
        File tempTxt = new File(tempDir, "temp.txt");

        // Создаем файл temp.txt, если он не существует
        try {
            if (!tempTxt.exists()) {
                if (tempTxt.createNewFile()) {
                    System.out.println("Файл temp.txt создан");
                } else {
                    System.out.println("Не удалось создать файл temp.txt");
                }
            } else {
                System.out.println("Файл temp.txt уже существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла temp.txt: " + e.getMessage());
        }

        // Записываем информацию в файл temp.txt
        StringBuilder log = new StringBuilder();
        log.append("Лог создания файлов и директорий:\n");

        if (srcDir.exists()) {
            log.append("Директория src: ").append(srcDir.exists() ? "создана/существует\n" : "не создана\n");
        }
        if (resDir.exists()) {
            log.append("Директория res: ").append(resDir.exists() ? "создана/существует\n" : "не создана\n");
        }
        if (savegamesDir.exists()) {
            log.append("Директория savegames: ").append(savegamesDir.exists() ? "создана/существует\n" : "не создана\n");
        }
        if (tempDir.exists()) {
            log.append("Директория temp: ").append(tempDir.exists() ? "создана/существует\n" : "не создана\n");
        }
        if (mainDir.exists()) {
            log.append("Директория main: ").append(mainDir.exists() ? "создана/существует\n" : "не создана\n");
        }
        if (testDir.exists()) {
            log.append("Директория test: ").append(testDir.exists() ? "создана/существует\n" : "не создана\n");
        }
        if (mainJava.exists()) {
            log.append("Файл Main.java: ").append(mainJava.exists() ? "создан/существует\n" : "не создан\n");
        }
        if (utilsJava.exists()) {
            log.append("Файл Utils.java: ").append(utilsJava.exists() ? "создан/существует\n" : "не создан\n");
        }
        if (drawablesDir.exists()) {
            log.append("Директория drawables: ").append(drawablesDir.exists() ? "создана/существует\n" : "не создана\n");
        }
        if (vectorsDir.exists()) {
            log.append("Директория vectors: ").append(vectorsDir.exists() ? "создана/существует\n" : "не создана\n");
        }
        if (iconsDir.exists()) {
            log.append("Директория icons: ").append(iconsDir.exists() ? "создана/существует\n" : "не создана\n");
        }
        if (tempTxt.exists()) {
            log.append("Файл temp.txt: ").append(tempTxt.exists() ? "создан/существует\n" : "не создан\n");
        }

        // Записываем лог в файл temp.txt
        try (java.io.FileWriter writer = new java.io.FileWriter(tempTxt)) {
            writer.write(log.toString());
            System.out.println("Информация записана в файл temp.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл temp.txt: " + e.getMessage());
        }

        // Создаем экземпляры класса GameProgress
        GameProgress progress1 = new GameProgress(100, 5, 1, 10.5);
        GameProgress progress2 = new GameProgress(80, 10, 5, 50.2);
        GameProgress progress3 = new GameProgress(50, 2, 10, 120.7);

        // Определяем пути для сохранения игр
        String save1Path = gamesPath + "/savegames/save1.dat";
        String save2Path = gamesPath + "/savegames/save2.dat";
        String save3Path = gamesPath + "/savegames/save3.dat";

        // Сохраняем игры
        saveGame(save1Path, progress1);
        saveGame(save2Path, progress2);
        saveGame(save3Path, progress3);

        // Создаем список файлов для архивации
        List<String> saves = new ArrayList<>();
        saves.add(save1Path);
        saves.add(save2Path);
        saves.add(save3Path);

        // Определяем путь для архива
        String zipPath = gamesPath + "/savegames/saves.zip";

        // Архивируем сохранения
        zipFiles(zipPath, saves);

        // Удаляем файлы сохранений
        try {
            File save1 = new File(save1Path);
            if (save1.delete()) {
                System.out.println("Файл удален: " + save1Path);
            }
            File save2 = new File(save2Path);
            if (save2.delete()) {
                System.out.println("Файл удален: " + save2Path);
            }
            File save3 = new File(save3Path);
            if (save3.delete()) {
                System.out.println("Файл удален: " + save3Path);
            }
        } catch (Exception e) {
            System.out.println("Ошибка при удалении файлов: " + e.getMessage());
        }

        // Распаковка архива
        zipPath = gamesPath + "/savegames/saves.zip";
        String extractPath = gamesPath + "/savegames/";
        openZip(zipPath, extractPath);

        // Загрузка игры из распакованного файла
        String loadPath = gamesPath + "/savegames/save1.dat";
        GameProgress loadedProgress = loadGame(loadPath);

        // Выводим информацию о загруженной игре
        if (loadedProgress != null) {
            System.out.println("Информация о загруженной игре:\n" + loadedProgress.toString());
        }
    }

    // Метод для сохранения игры
    public static void saveGame(String filePath, GameProgress gameProgress) {
        try (java.io.FileOutputStream fos = new java.io.FileOutputStream(filePath);
             java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos)) {
            oos.writeObject(gameProgress);
            System.out.println("Сохранение игры выполнено: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении игры: " + e.getMessage());
        }
    }

    // Метод для архивирования файлов
    public static void zipFiles(String zipPath, List<String> filePaths) {
        try (java.io.FileOutputStream fos = new java.io.FileOutputStream(zipPath);
             java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(fos)) {

            for (String filePath : filePaths) {
                try (java.io.FileInputStream fis = new java.io.FileInputStream(filePath)) {
                    java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry(filePath.substring(filePath.lastIndexOf('/') + 1)); // Имя файла в архиве
                    zos.putNextEntry(zipEntry);

                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = fis.read(buffer)) > 0) {
                        zos.write(buffer, 0, length);
                    }

                    zos.closeEntry();
                    System.out.println("Файл добавлен в архив: " + filePath);

                } catch (IOException e) {
                    System.out.println("Ошибка при архивировании файла " + filePath + ": " + e.getMessage());
                }
            }
            System.out.println("Архивирование завершено: " + zipPath);

        } catch (IOException e) {
            System.out.println("Ошибка при создании архива: " + e.getMessage());
        }
    }

    // Метод для распаковки ZIP-архива
    public static void openZip(String zipPath, String extractPath) {
        try (java.io.FileInputStream fis = new java.io.FileInputStream(zipPath);
             java.util.zip.ZipInputStream zis = new java.util.zip.ZipInputStream(fis)) {
            java.util.zip.ZipEntry entry;
            String name;
            while ((entry = zis.getNextEntry()) != null) {
                name = entry.getName();
                // Создаем файл
                File file = new File(extractPath, name);
                try (java.io.FileOutputStream fos = new java.io.FileOutputStream(file)) {
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, length);
                    }
                    fos.flush();
                    System.out.println("Файл распакован: " + file.getAbsolutePath());
                } catch (IOException e) {
                    System.out.println("Ошибка при распаковке файла: " + name + " - " + e.getMessage());
                }
                zis.closeEntry();
            }
            System.out.println("Распаковка архива завершена: " + zipPath);
        } catch (IOException e) {
            System.out.println("Ошибка при распаковке архива: " + e.getMessage());
        }
    }

    // Метод для загрузки игры
    public static GameProgress loadGame(String filePath) {
        GameProgress gameProgress = null;
        try (java.io.FileInputStream fis = new java.io.FileInputStream(filePath);
             java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis)) {
            gameProgress = (GameProgress) ois.readObject();
            System.out.println("Загрузка игры выполнена: " + filePath);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке игры: " + e.getMessage());
        }
        return gameProgress;
    }
}