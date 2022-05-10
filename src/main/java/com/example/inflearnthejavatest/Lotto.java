package com.example.inflearnthejavatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Lotto {
    public static void main(String[] args) {
        int[] ball = new int[10];

        for (int i=0; i<ball.length; i++)
            ball[i] = i + 1;


        for (int k =0; k<20; k++) {
            int tmp = 0;
            int j = 0;
            for (int i=0; i<1; i++) {
                j = (int)(Math.random() * 10);
                tmp = ball[i];
                ball[i] = ball[j];
                ball[j] = tmp;
            }

            ArrayList<Integer> array = new ArrayList<Integer>();
            for (int t =0 ; t < 6; t ++ )
                array.add(ball[t]);

            System.out.println(array.toString());

        }

    }

    static int createLottoNum() {

        return 1;
    }

}
