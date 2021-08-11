package com.company;

import java.util.stream.IntStream;

public class LimitStreamChallenge {

    public static void main(String[] args) {

        /**
         * Note that we are using an infinite stream at the iterate line,
         * then we limit our stream to 5 elements and filter it by even numbers and finally print all of them.
         * Since we limit the numbers to 5 we will have our stream iterating in a range from 0 to 4 on our stream.
         * Then we filter it by even numbers and we finally print the elements, the first result will be: 024
//         */
//        IntStream.iterate(0, i -> i +1)
//                .limit(5)
//                .filter(i -> i % 2 == 0)
//                .forEach(System.out::print); // 0, 2, 4


        /**
         * we use a very similar structure from the last stream but the difference is the peek method and the order of the filter and limit methods.
         * The peek method will print all the elements on the conditions of this stream,
         * remember that the peek method is meant to debug and help us understand what is happening in the steam.
         * Then we will filter the stream elements to the even numbers, we will have here 0, 2 and 4 since we are limiting by 3.
         * Note that on this stream, we do have 3 elements, and that's because the limit is being performed on the top of the filter method.
         * As the peek method will print all elements the filtered and non-filtered, then the final output will be: 02400122344
         */
        IntStream.iterate(0, i -> i +1)
                .peek(System.out::print)
                .filter(i -> i % 2 == 0)
                .limit(3)
                .forEach(System.out::print);
        //0, 0
        //1,
        //2, 2
        //3,
        //4, 4

    }
}
