import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * The internal representation of the map.
 */
public class Map {
    private final static String DEFAULT_FILE_PATH = "resources/";

    public Map() {
    }

    /**
     * Load a map from a file.
     * @param fileName The file name.
     */
    public void loadFromFile(final String fileName) {
        final List<String> content = getFileContent(fileName);
        parseContent(content);
    }

    /**
     * Loads the content from a text file as a string.
     * @param fileName The file name.
     * @return The string with content.
     */
    private List<String> getFileContent(final String fileName) {
        List<String> content = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(DEFAULT_FILE_PATH + fileName, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.add(line);
            }
        } catch (IOException e) {
            // TODO: Handle error.
            e.printStackTrace();
        }

        return content;
    }

    private Block[][] parseContent(final List<String> content) {
        for (String row : content) {
            // Filter out the empty rows and the comments.
            if (row.length() > 0 && row.charAt(0) != '#') {
                System.out.println(row);
            }
        }
    }
}
