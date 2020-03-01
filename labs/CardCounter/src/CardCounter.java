/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardcounter;

/**
 *
 * @author Pluska
 */
public class CardCounter extends CardDealer{
    
    public CardCounter(int d){
        super(d);
    }
	
	//TODO: Write a method called show sumDeal that returns the sum of all the cards dealt 
	public int sumDeal(){
        Card[] cardArray = getDealtCards();
        int sum = 0;
        

        for(int c = 0; c < cardArray.length;c++){

            String faceValue = cardArray[c].getFaceValue();
            int value = 0;

            try{
                value = Integer.parseInt(faceValue);
            } catch(Exception e){
                //Ignoring Failures...duh
            }

            if(value == 0){
                switch(faceValue){
                    case "A":
                        value = 1;
                        break;
                    case "J":
                        value = 11;
                        break;
                    case "Q":
                        value = 12;
                        break;
                    case "K":
                        value = 13;
                        break;
                }
            }


            sum += value;

        }
        return sum;

    }
    //TODO: Write a method called countValues that finds the number of aces, twos, threes, etc
    //This method should return an array of the stored values


    //TODO: Write a method called countSuites that finds the number of cards in each suite
    //This method should return an array of the stored values

    

    
    
}
