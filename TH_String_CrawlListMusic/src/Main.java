import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       try{
           URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
           Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
           scanner.useDelimiter("\\Z");
           String content = scanner.next();
           scanner.close();
           content = content.replace("\\n+", "");
           Pattern p = Pattern.compile("name_song\">(.*?)</a>");
           Matcher m = p.matcher(content);
           while (m.find()){
               System.out.println(m.group(1));
           }

       }catch (IOException e){
           e.printStackTrace();
       }
    }
}