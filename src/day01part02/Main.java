package day01part02;

public class Main{
    public static void main(String[] args){
        WordReader obj = new WordReader("src/day01part02/numbers.csv");
        System.out.println(obj.getTotal());
    }
}