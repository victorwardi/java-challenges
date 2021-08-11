package com.company;

public class HomerBeerBatch {

    public static void main(String[] args) {
        int batchOfBeer1 = 5; //6 -> 7
        int batchOfBeer2 = 5; // 6 -> 7
        // 6 > 1 = true
        if(++batchOfBeer2 > batchOfBeer1 || batchOfBeer1++ == batchOfBeer2++){
            batchOfBeer1++;
        }
        batchOfBeer1 = (batchOfBeer1++ > batchOfBeer2 &&
                ++batchOfBeer2 < batchOfBeer1++ ? ++batchOfBeer1 : ++batchOfBeer2);


        System.out.println("Homer will have: " + batchOfBeer1-- + " and " + batchOfBeer2++ + " beers.");
        // 7 and 7
    }
}
