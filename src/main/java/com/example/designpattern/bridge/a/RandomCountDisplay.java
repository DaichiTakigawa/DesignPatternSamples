package com.example.designpattern.bridge.a;

import com.example.designpattern.bridge.Display;
import com.example.designpattern.bridge.DisplayImpl;
import java.util.Random;

public class RandomCountDisplay extends Display {
    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        int count = new Random().nextInt(times);
        open();
        for (int i = 0; i < count; ++i) {
            print();
        }
        close();
    }
}
