package com.learning.springDemo;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService {
    private String[] fortunes = { "It is decidedly so", "You will either be happy or unhappy, probably", "Try again"};

    @Override
    public String getFortune() {
        ThreadLocalRandom generator = ThreadLocalRandom.current();
        return fortunes[generator.nextInt(0, 3)];
    }
}
