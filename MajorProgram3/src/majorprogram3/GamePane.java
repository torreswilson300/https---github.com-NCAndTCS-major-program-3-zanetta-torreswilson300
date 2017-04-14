/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram3;

import javafx.scene.layout.BorderPane;
import javax.smartcardio.Card;

/**
 *
 * @author torres
 */
public class GamePane extends BorderPane{
    private int rows;
    private int cols;
    private int numClicks;
    private int numMatched;
    private Card clickedCardOne;
    private Card clickedCardTwo;
    
    
    public GamePane(){
        
        
    }
    
    
    
    
    
    

    /**
     * @return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * @return the cols
     */
    public int getCols() {
        return cols;
    }

    /**
     * @param cols the cols to set
     */
    public void setCols(int cols) {
        this.cols = cols;
    }

    /**
     * @return the numClicks
     */
    public int getNumClicks() {
        return numClicks;
    }

    /**
     * @param numClicks the numClicks to set
     */
    public void setNumClicks(int numClicks) {
        this.numClicks = numClicks;
    }

    /**
     * @return the numMatched
     */
    public int getNumMatched() {
        return numMatched;
    }

    /**
     * @param numMatched the numMatched to set
     */
    public void setNumMatched(int numMatched) {
        this.numMatched = numMatched;
    }

    /**
     * @return the clickedCardOne
     */
    public Card getClickedCardOne() {
        return clickedCardOne;
    }

    /**
     * @param clickedCardOne the clickedCardOne to set
     */
    public void setClickedCardOne(Card clickedCardOne) {
        this.clickedCardOne = clickedCardOne;
    }

    /**
     * @return the clickedCardTwo
     */
    public Card getClickedCardTwo() {
        return clickedCardTwo;
    }

    /**
     * @param clickedCardTwo the clickedCardTwo to set
     */
    public void setClickedCardTwo(Card clickedCardTwo) {
        this.clickedCardTwo = clickedCardTwo;
    }
    
   
    
}
