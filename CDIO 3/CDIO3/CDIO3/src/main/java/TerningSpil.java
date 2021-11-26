
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TerningSpil{

    public static void main (String[] args) {

        Board board = new Board();

        Scanner sc = new Scanner (System.in);

        int maxScore = 10000;
// spillere navne
        System.out.println("Indast navn på spiller 1:");
        String navn1 = sc.next();

        System.out.println("Indast navn på spiller 2:");
        String navn2 = sc.next();

        Spiller spiller1 = new Spiller(navn1);
        Spiller spiller2 = new Spiller(navn2);
        int runde = 1;


// spillet kører så længe saldoen er mindre end maxscore//
        while (((spiller1.getSaldo() < maxScore) && spiller2.getSaldo() < maxScore)) {

            System.out.println("----------- Runde "+ runde + "----------------");
            runde++;




            int result1 = spiller1.rollDice();


            int result2 = spiller2.rollDice();


            int value1 = board.getFelt(result1);
            spiller1.haev(value1);


            System.out.println(spiller1.getNavn()  + " har slået :" + result1 + ", det giver:" + value1 + ". Nu er din saldo på:" + spiller1.getSaldo());

            int value2 = board.getFelt(result2);
            spiller2.haev(value2);


            System.out.println(spiller2.getNavn() + " har slået :" + result2 + ", det giver:" + value2 + ". Nu er din saldo på:" + spiller2.getSaldo());

        }

// spillet slutter når saldo1 er større end saldo 2 eller omvendt //
        if(spiller1.getSaldo() > spiller2.getSaldo()){
            System.out.println( spiller1.getNavn() + " har vundet med saldoen:" + spiller1.getSaldo());


        }else {
            System.out.println(spiller2.getNavn() + " har vundet med saldoen: " + spiller2.getSaldo());

        }
    }
}