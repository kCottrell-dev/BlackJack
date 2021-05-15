package blackjack;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName, suit;
    private Image image;

    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
        String fileName = faceName + "_of_"+suit+".png";
        image = new Image("./images/"+fileName);
    }

    public String getFaceName() {
        return faceName;
    }

    
     // returns a list of face names
     
    public static List<String> getValidFaceNames()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack",
                            "queen","king","ace");
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

   
    public void setFaceName(String faceName) {
        List<String> validFaceNames = getValidFaceNames();
        faceName = faceName.toLowerCase();

        if (validFaceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException("Valid face names are: "+
                            validFaceNames);
    }

    public String getSuit() {
        return suit;
    }

    /*
    This method will return a list of card suits
     */
    public static List<String> getValidSuits()
    {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }

    public void setSuit(String suit) {
        List<String> validSuits = getValidSuits();
        suit = suit.toLowerCase();

        if (validSuits.contains(suit))
            this.suit = suit;      
    }

    public String toString()
    {
        return String.format("%s of %s", faceName, suit);
    }
}