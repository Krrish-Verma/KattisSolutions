import java.io.*;
import java.util.*;
//incompleted
public class Cudoviste {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int rows = Integer.parseInt(st.nextToken());
        int colums = Integer.parseInt(st.nextToken());

        char[][] griddy = new char[rows][colums];

        for(int i = 0; i < rows; i++) {
            String input = br.readLine();

            for(int j = 0; j < colums; j++) {
                griddy[i][j] = input.charAt(j);
            }
        }


        int[] arr = new int[5];

        for(int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < colums - 1; j++) {
                if (griddy[i][j] == '1') {
                    griddy[i][j] = '0';
                } else {
                    griddy[i][j] = '1';
                }


            }
        }
        br.close();
        pw.close();
    }

}
