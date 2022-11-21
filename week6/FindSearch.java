import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindSearch {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Enter path to directory: ");
            var dir = scanner.nextLine();
            System.out.println("Enter query: ");
            var query = scanner.nextLine();

            System.out.println("Found as name:");
            System.out.println(findFileByName(query, dir));
            System.out.println("Found as contents:");
            System.out.println(findFileByContents(query, dir));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static Collection<Path> findFileByName(String file, String directory) throws IOException, IOException {
        try (var files = Files.walk(Paths.get(directory))) {
            return files.filter(f -> f.getFileName().toString().contains(file))
                    .collect(Collectors.toList());

        }
    }

    static Collection<Path> findFileByContents(String content, String directory) throws IOException {
        try (var files = Files.walk(Paths.get(directory))) {
            return files.filter(f -> {
                try {
                    return Files.probeContentType(f).contains("text/plain")
                            && Files.readString(f, StandardCharsets.UTF_8).contains(content); // ублюдский код, честно позаимствованный у меня самого +- годичной давности
                } catch (Exception e) {
                    return false;
                }
            }).collect(Collectors.toList());
        }
    }
}
