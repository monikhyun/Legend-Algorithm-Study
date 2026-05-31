import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> al = new ArrayList<>();

        while (N > 0) {
            String line = br.readLine();

            // 빈 줄 예외 처리
            if (line == null || line.trim().isEmpty()) {
                N--;
                continue;
            }

            StringTokenizer st = new StringTokenizer(line);

            // 명령어가 없으면 다음 줄로
            if (!st.hasMoreTokens()) {
                N--;
                continue;
            }

            String M = st.nextToken();

            int A = 0;

            if (st.hasMoreTokens()) {
                A = Integer.parseInt(st.nextToken());
            }

            if (M.equals("push_back")) {
                al.add(A);
            }

            if (M.equals("pop_back")) {
                al.remove(al.size() - 1);
            }

            if (M.equals("size")) {
                System.out.println(al.size());
            }

            if (M.equals("get")) {
                System.out.println(al.get(A - 1));
            }

            N--;
        }
    }
}