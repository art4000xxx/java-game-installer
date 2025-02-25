import java.io.File;
import java.io.IOException;

public class GameInstaller {

    public static void main(String[] args) {
        // 1. Определяем путь к папке Games
        String gamesPath = "C://games";

        // 2. Создаем основные директории
        File srcDir = new File(gamesPath, "src");
        File resDir = new File(gamesPath, "res");
        File savegamesDir = new File(gamesPath, "savegames");
        File tempDir = new File(gamesPath, "temp");

        // 3. Создаем эти директории
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

        // 4. Создаем поддиректории в src
        File mainDir = new File(srcDir, "main");
        File testDir = new File(srcDir, "test");

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

        // 5. Создаем файлы в src/main
        File mainJava = new File(mainDir, "Main.java");
        File utilsJava = new File(mainDir, "Utils.java");

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

        // 6. Создаем поддиректории в res
        File drawablesDir = new File(resDir, "drawables");
        File vectorsDir = new File(resDir, "vectors");
        File iconsDir = new File(resDir, "icons");

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

        // 7. Создаем файл temp.txt в temp
        File tempTxt = new File(tempDir, "temp.txt");

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
        // 8. Записываем информацию в файл temp.txt
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

        try (java.io.FileWriter writer = new java.io.FileWriter(tempTxt)) {
            writer.write(log.toString());
            System.out.println("Информация записана в файл temp.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл temp.txt: " + e.getMessage());
        }
    }
}
