import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.Random;

public class Lottery {

    public static void main(String[] args){
        try {

            Random r = new Random(); //random generator
            DecimalFormat df2 = new DecimalFormat("#.########");

            BufferedReader read = new BufferedReader(new FileReader("data/data.txt"));
            String line="";
            while((line=read.readLine())!=null){

                int rnd = r.nextInt(400)+100;
                double d = Math.random()+rnd;

                System.out.println(line+","+df2.format(d));


            }
            read.close();



        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
