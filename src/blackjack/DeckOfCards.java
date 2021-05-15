package blackjack;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;
    private Image backOfCardImage;
    private Image backOfCardImage2;

 

    
       // this is a constructor that passes in a collection of Card objects
     
    public DeckOfCards(ArrayList<Card> deck) {
        this.deck = deck;
        backOfCardImage = new Image("./images/backOfCard.png");
        backOfCardImage2 = new Image("./images/backOfCard2.png");
    }

   
    public DeckOfCards()
    {
        List<String> suits = Card.getValidSuits(); 
        List<String> faceNames = Card.getValidFaceNames();

        deck = new ArrayList<>();

        for (String suit:suits)
        {
            for (String faceName:faceNames)
                deck.add(new Card(faceName,suit));
        }
        backOfCardImage = new Image("./images/backOfCard.png");
        backOfCardImage2 = new Image("./images/backOfCard2.png");
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Image getBackOfCardImage() {
        return backOfCardImage;
    }
    
    public Image getBackOfCardImage2() {
        return backOfCardImage2;
    }
    

    public void setBackOfCardImage(Image backOfCardImage) {
        this.backOfCardImage = backOfCardImage;
    }
    
     public void setBackOfCardImage2(Image backOfCardImage2) {
        this.backOfCardImage2 = backOfCardImage2;
    }

    
     //This method will deal the top card off the deck
     
    public Card dealTopCard()
    {
        if (deck.size()>0)
            return deck.remove(0);
        else
            return null;
    }

    
     // This method will shuffle the deck of cards(images)
     
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
}



