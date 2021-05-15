package blackjack;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;


public class BlackJackController implements Initializable {

    @FXML private Button nextCardButton;
    @FXML private ImageView deckImageView;
    private DeckOfCards deck;
    @FXML
    private ImageView deckImageView2;
    @FXML
   
    private ImageView deckImageView4;
    @FXML
    
    private ImageView deckImageView3;
    @FXML
    private ImageView hitImageView1;
    @FXML
    private ImageView hitImageView2;
    @FXML
    private ImageView hitImageView3;
    @FXML
    private ImageView hitImageView4;
    @FXML
    private Button dealCardButton;
    @FXML
    private Button standButton;
    @FXML
    private Button nextCardButtonCPU;
    @FXML
    private Button CPUStandButton;
    @FXML
    private TextField Cpu_Score;
    @FXML
    private TextField Player_Score;

    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        deck = new DeckOfCards();
        deck.shuffle();
        

        deckImageView.setImage(deck.getBackOfCardImage()); // Displays the back of the card before the cards are shuffled and displayed after you click deal.
        deckImageView2.setImage(deck.getBackOfCardImage2());
        deckImageView3.setImage(deck.getBackOfCardImage2());
        deckImageView4.setImage(deck.getBackOfCardImage());
        
        
        
        
        
    }

    @FXML public void dealCardButtonPushed() // Will deal cards out to both the CPU and player
    {
       deckImageView.setImage(deck.dealTopCard().getImage());
       deckImageView2.setImage(deck.dealTopCard().getImage());
       deckImageView3.setImage(deck.dealTopCard().getImage());
       deckImageView4.setImage(deck.dealTopCard().getImage());
       dealCardButton.setOnAction(e ->
               {
                  if(dealCardButton.isPressed())
               {
                   dealCardButton.setDisable(true);
               }  
               });
      
    }

    @FXML
    public void nextCardButtonPushed() { // Hit button for Player
        
        hitImageView1.setImage(deck.dealTopCard().getImage());
            
  nextCardButton.setOnMouseClicked(e ->
        {
           if(e.getButton().equals(MouseButton.SECONDARY)){ // Click Right Mouse button to hit again
               if(e.getClickCount() == 1){
                   hitImageView2.setImage(deck.dealTopCard().getImage());
               }
           } 
        });
        
    }

    @FXML
    private void standButtonPushed(ActionEvent event) { //Stand button
        nextCardButton.setDisable(true);
    }

    @FXML
    public void nextCardButtonCPUPushed() { //Hit button for CPU
        
        hitImageView3.setImage(deck.dealTopCard().getImage());
        nextCardButtonCPU.setOnMouseClicked(e ->
        {
           if(e.getButton().equals(MouseButton.SECONDARY)){ // Click Right Mouse button to hit again
               if(e.getClickCount() == 1){
                   hitImageView4.setImage(deck.dealTopCard().getImage());
               }
           } 
        });
    }

    
   
    @FXML
    private void CPUstandButtonPushed(ActionEvent event) {
        nextCardButtonCPU.setDisable(true);
    }

    @FXML
    private void Enter(KeyEvent event) { //(Unfinshed) This was supposed to let you enter values manually and by hitting enter would display which number was higher and the winner.
    }
        
    }


    
