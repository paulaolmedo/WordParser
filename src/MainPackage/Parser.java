
package MainPackage;
import java.util.regex.*;
/**
 *
 * @author Angonoa - Olmedo
 */
public class Parser {
    
    private static final String REGULAR_EXPR = "[^ÑÁÉÍÓÚA-Z]";
    
    /**
     * Method used for giving format to a word.
     * @param word
     *             The word you want to give format.
     * @return the word formatted.
     */
    public String parse(String word) {
        String parsedWord = word.toUpperCase();
        Pattern pattern = Pattern.compile(REGULAR_EXPR);
        Matcher match = pattern.matcher(parsedWord);
        if (match.find()) {
            parsedWord = match.replaceAll(" ");
        }
        return parsedWord;
    }
  
  
}
