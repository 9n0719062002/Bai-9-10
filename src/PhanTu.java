import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhanTu<T extends Comparable> {
    private T t;
    public PhanTu(T t) {
        this.t = t;
    }
    public boolean isGreater(T a) {
        return t.compareTo(a) > 0;
    }

    // doc file int voi dinh dang moi dong chua 1 so nguyen
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        String url = args[0];
        File file = new File(url);
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = new String();
        while((line = reader.readLine()) != null){

            list.add(Integer.parseInt(line));
        }
        Collections.sort(list);
        File file2 = new File(args[1]);
        OutputStream outputStream2 = new FileOutputStream(file2);
        OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(outputStream2);

        for (Integer item: list){
            outputStreamWriter2.write(item.toString());
            outputStreamWriter2.write("\n");
        }

        outputStreamWriter2.flush();
    }
}
