import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int pre = 11 * 24 * 60 + 11 * 60 + 11;
        int whatT = A * 24 * 60 + B * 60 + C;

        if(whatT < pre)
            System.out.println("-1");
        else
            System.out.println(whatT - pre);
    }
}