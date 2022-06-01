package com.company.FlyWeight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmojiBuilder emojiBuilder = new EmojiBuilder();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            String str;
            str = sc.next();
            Emojis emojis = emojiBuilder.getEmoji(str);
            emojis.use();

        }
    }
}
