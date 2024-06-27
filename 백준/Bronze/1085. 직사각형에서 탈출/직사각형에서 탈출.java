import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int w2 = w - x;
        int h2 = h - y;

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(x);
        nums.add(y);
        nums.add(w2);
        nums.add(h2);

        System.out.println(Collections.min(nums));

    }
}
