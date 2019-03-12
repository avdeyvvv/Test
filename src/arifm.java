import java.io.*;

public class arifm {
    public static void main(String[] args) throws IOException{

        StringBuilder sb =  new StringBuilder();
        sb.append("Lena").append('\n');
        sb.append("Olya").append('\n');
        sb.append("Anna").append('\n');

        String data = sb.toString();

        InputStream is = new ByteArrayInputStream(data.getBytes());

        System.setIn(is);
        readAndPrintLine();
        System.out.println("Hi!");
    }

    private static void readAndPrintLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        String s = "Hello my baby! ";
        System.out.println(s);
        System.out.println(s.getBytes());

        byte[] buffer = s.getBytes();
        for (byte b : buffer
        ) {
            System.out.println(b);

        }

        }



    }

