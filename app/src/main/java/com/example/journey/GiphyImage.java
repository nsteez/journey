package com.example.journey;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

// This is just an object to prepresent a reponse from the API - the image and we're only taking the original image

public class GiphyImage {
    Original original;

    public Original getOriginal() {
        return original;
    }

    @Override
    public String toString() {
        return "GiphyImage{" +
                "preview=" + original +
                '}';
    }
}




