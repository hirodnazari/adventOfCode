package day01part02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Handles processing of the files
 */

public class WordReader {

    String filename;
    int total;

    public WordReader(String filename) {
        this.filename = filename;
        try{
            File inFile = new File(filename);
            Scanner input = new Scanner(inFile);
            total = parseInput(input);
        } catch (FileNotFoundException e){
            System.out.println("Error: The file is not found");
        }

    }

    /**
     * Handles input to create array of appropriate length
     */
    public int parseInput(Scanner source) {
        int totalGained = 0;
        ArrayList<Integer> collector = new ArrayList<Integer>();

        while(source.hasNextLine()){
            collector.add(Integer.parseInt(source.nextLine()));
        }

        for(int i=1;i<collector.size()-3;i++){
            int val01 = collector.get(i) + collector.get(i+1) + collector.get(i+2);
            int val02 = collector.get(i+1) + collector.get(i+2) + collector.get(i+3);
            if(val01 < val02){
                totalGained++;
            }
        }

        return totalGained;
    }

    /**
     * Returns sorted file in String array form
     */
    public int getTotal(){

        return total;

    }

}
