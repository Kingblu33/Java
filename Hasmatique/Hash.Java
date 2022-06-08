import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("X Ambassador", "Sucker for Pain");
        map.put("Kehlani", "Gangsta");
        map.put("Stephen", "Crossfire");
        map.put("J-cole", "Pride is the devil");

        String val = map.get("Kehlani");
        

        for (String key : map.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, map.get(key)));
        }


    }
}