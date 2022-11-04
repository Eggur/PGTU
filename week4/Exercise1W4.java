import java.io.*;

public class Exercise1W4 {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(System.in));
        File fileToRead = new File("C:\\Users\\eggur\\IdeaProjects\\PGTU\\week4\\test.txt");
        BufferedReader fin = new BufferedReader(new FileReader(fileToRead));
        String name;
        String line;
        System.out.println("Print File "+fileToRead.getName()+"? y/n");
        name = fileReader.readLine();
        if(name.equals("y"))
            while ((line = fin.readLine()) != null) System.out.println(line);
        else
            System.out.println("ok :/");
    }
}
