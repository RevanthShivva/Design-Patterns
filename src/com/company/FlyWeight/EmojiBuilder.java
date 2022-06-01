package com.company.FlyWeight;
import java.util.HashMap;

public class
EmojiBuilder {

        HashMap<String, Emojis> map = new HashMap<>();

        public  Emojis getEmoji(String type) {
            Emojis emojis = map.get(type);

            if(emojis == null) {
                if(type == "Happyface") {
                    HappyFace happyFace = new HappyFace();
                    happyFace.create();
                    System.out.println("Creating emoji : " + type);
                    emojis = happyFace;
                    map.put(type,emojis);
                }
                else if(type == "Sadface") {
                    SadFace sadFace = new SadFace();
                    sadFace.create();
                    System.out.println("Creating emoji : " + type);
                    emojis = sadFace;
                    map.put(type,emojis);
                }
                else{
                    Hearts hearts = new Hearts();
                    hearts.create();
                    System.out.println("Creating emoji : " + type);
                    emojis= hearts;

                    map.put(type,emojis);
                }
            }
            return emojis;
        }
    }

