import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        ArrayList<Card> hand = deck.dealHand(7);
        System.out.println(hand.toString());
    }
}