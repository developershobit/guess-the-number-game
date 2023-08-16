import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int InputNumber;
    public int getNumOfGuesses;

    public int getGetNumOfGuesses() {
        return getNumOfGuesses;
    }

    public void setGetNumOfGuesses(int getNumOfGuesses) {
        this.getNumOfGuesses = getNumOfGuesses;
    }

        game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);

    }

        void takeUser(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number: ");
        InputNumber = sc.nextInt();
    }

    boolean isCorrectNum(){
        if(InputNumber==number){
            return true;
        }
        else if(InputNumber<number){
            System.out.println("Too low...");
        }
        else if(InputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
}

public class Aaho {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while(!b){
        g.takeUser();
        b = g.isCorrectNum();
        System.out.println(b);
        }
    }
}
