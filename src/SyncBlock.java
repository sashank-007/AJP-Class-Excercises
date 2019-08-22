import java.util.ArrayList;
import java.util.List;

public class SyncBlock {
    String name = "";
    public int count = 0;
    public void Name(String str, List<String> list) {
        synchronized(this) {
            name = str;
            count++;
        }
        list.add(name);
    }
}

class Run {
    public static void main (String[] args) {
        SyncBlock sb = new SyncBlock();
        List<String> list = new ArrayList<String>();
        sb.Name("Sashank Shakya", list);
        System.out.println(sb.name);
    }
}
