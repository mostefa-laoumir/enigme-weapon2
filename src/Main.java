import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //open text file using File class and Scanner class
        File file = new File("src/weapon.txt");
                Scanner sc = new Scanner(file);
                //initializing a counter with 0
                int i =0;
                int features = 0;
                //loop that runs until the end of file (EoF)
        while (sc.hasNextLine()){
            //get first line in file
            String line =  sc.nextLine();
            //split it on two parts because in each line there are two art pieces and we need to check each one seperately
            String[] splitLine = line.split("\\) ");
            //added a closing parentheses to the first part to return it to the original state which is Forme (info,info,info,info,info)
            splitLine[0]=splitLine[0]+")";
            //test if art peice corresponds to the wanted one, if it is we increment the counter
            String[] splitLine2 = splitLine[0].split(" \\(");
            splitLine2[1]  = splitLine2[1].split("\\)")[0];

            if(splitLine2[0].equals("Boule")){
                String[] splitLine3 = splitLine2[1].split(",");

                for(int j=0; j<splitLine3.length;j++){
                    if(splitLine3[j].toLowerCase().equals("pointe"))features++;
                }
                for(int j=0; j<splitLine3.length;j++){
                    if(splitLine3[j].toLowerCase().equals("chaude"))features++;
                }
                for(int j=0; j<splitLine3.length;j++){
                    if(splitLine3[j].toLowerCase().equals("bleu"))features++;
                }
                for(int j=0; j<splitLine3.length;j++){
                    if(splitLine3[j].toLowerCase().equals("pleine"))features++;
                }
                for(int j=0; j<splitLine3.length;j++){
                    if(splitLine3[j].equals("12 cm"))features++;
                }
                if(features==5)i++;
                features=0;

            }
                String[] splitLine4 = splitLine[1].split(" \\(");
                splitLine4[1]  = splitLine4[1].split("\\)")[0];

            if(splitLine4[0].equals("Boule")){
                System.out.println();
                String[] splitLine3 = splitLine4[1].split(",");

                for(int j=0; j<splitLine3.length;j++){
                    System.out.println(splitLine3[j].toLowerCase());

                    if(splitLine3[j].toLowerCase().equals("pointe"))features++;
                }
                for(int j=0; j<splitLine3.length;j++){
                    if(splitLine3[j].toLowerCase().equals("chaude"))features++;
                }
                for(int j=0; j<splitLine3.length;j++){
                    if(splitLine3[j].toLowerCase().equals("bleu"))features++;
                }
                for(int j=0; j<splitLine3.length;j++){
                    if(splitLine3[j].toLowerCase().equals("pleine"))features++;
                }
                for(int j=0; j<splitLine3.length;j++){
                    if(splitLine3[j].equals("12 cm"))features++;
                }

                if(features==5)i++;
                features=0;
            }

        }
        //printing the counter
        System.out.println("murder weapon number : "+i);
    }
}
