/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 *
 * @author torres
 */
public class Card extends StackPane {

    private boolean flipped;
    private boolean matchedProperty;
    private String path;
    private Image image;
    private ImageView imageView;
    private int row;
    private int col;
    private int numRows;
    private int numCols;

    public Card() {
        flipped = false;
        matchedProperty = false;
        path = "";
        image = new Image("");
        imageView = new ImageView(image);
        row = 0;
        col = 0;
        numRows = 0;
        numCols = 0;
    }

    public Card(String path) {
        this.path = path;
    }

    public void flipCard() {
        getChildren().clear();
        if (flipped == false) {
            flipped = true;
            getChildren().add(imageView);
        }else {
            flipped=false;
        }

    }

    public void setCardAndImageSize(int width, int height) {
        this.setPrefWidth(width);
        this.setPrefHeight(height);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);

    }

    public void setMatched() {
        matchedProperty = true;
    }

    /**
     * @return the flipped
     */
    public boolean isFlipped() {
        return flipped;
    }

    /**
     * @param flipped the flipped to set
     */
    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }

    /**
     * @return the matchedProperty
     */
    public boolean isMatchedProperty() {
        return matchedProperty;
    }

    /**
     * @param matchedProperty the matchedProperty to set
     */
    public void setMatchedProperty(boolean matchedProperty) {
        this.matchedProperty = matchedProperty;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
        try {
            FileInputStream input = new FileInputStream(path);
            image = new Image(input);
            imageView.setImage(image);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Card.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * @return the numRows
     */
    public int getNumRows() {
        return numRows;
    }

    /**
     * @param numRows the numRows to set
     */
    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    /**
     * @return the numCols
     */
    public int getNumCols() {
        return numCols;
    }

    /**
     * @param numCols the numCols to set
     */
    public void setNumCols(int numCols) {
        this.numCols = numCols;
    }
}
