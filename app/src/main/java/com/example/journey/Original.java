package com.example.journey;

public class Original {
    String height;
    String url;
    String width;

    public String getHeight() {
        return height;
    }

    public String getWidth() {
        return width;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Preview{" +
                "url='" + url + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}