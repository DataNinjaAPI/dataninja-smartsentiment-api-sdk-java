package io.dataninja.smartsentiment.client;

/**
 * Created by ronaldsujithan on 8/3/16.
 */
public class Keyword {

    String keyword;

    String sentiment;

    int count;

    String locations;

    double keyword_score;

    double sentiment_score;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public double getKeyword_score() {
        return keyword_score;
    }

    public void setKeyword_score(double keyword_score) {
        this.keyword_score = keyword_score;
    }

    public double getSentiment_score() {
        return sentiment_score;
    }

    public void setSentiment_score(double sentiment_score) {
        this.sentiment_score = sentiment_score;
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "keyword='" + keyword + '\'' +
                ", sentiment='" + sentiment + '\'' +
                ", count=" + count +
                ", locations='" + locations + '\'' +
                ", keyword_score=" + keyword_score +
                ", sentiment_score=" + sentiment_score +
                '}';
    }
}
