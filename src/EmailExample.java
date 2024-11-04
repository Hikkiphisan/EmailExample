import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    String REGEX = "^[a-zA-Z0-9._%+-]+@+[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    public EmailExample() {
        pattern = Pattern.compile(REGEX);
    }

    public boolean validate(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
