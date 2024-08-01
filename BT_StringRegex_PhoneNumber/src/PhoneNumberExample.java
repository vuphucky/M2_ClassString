import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String PHONENUM_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public PhoneNumberExample() {
    }

    public boolean isValid(String regex){
        Pattern pattern = Pattern.compile(PHONENUM_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
