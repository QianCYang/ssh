import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by 转机丶 on 2018/7/23.
 */
public class HelloTest {
    public static void main(String[] args) {
        Map<String, Double> map = new LinkedHashMap<>();
        map.containsKey("as");
        Double ad = map.get("ad");
        System.out.println(ad);
    }
}
