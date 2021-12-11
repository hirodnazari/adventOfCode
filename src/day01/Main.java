package day01;

public class Main{
    public static void main(String[] args){
        WordReader obj = new WordReader("src/day01/numbers.csv");
        System.out.println(obj.getTotal());
    }
}