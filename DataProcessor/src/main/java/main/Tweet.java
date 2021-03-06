package main;

import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

import com.fasterxml.jackson.annotation.JsonProperty;


@TypeDiscriminator("doc.type === 'EligibleCouple'")

public class Tweet extends CouchDbDocument {

    @JsonProperty
    private String content;
    @JsonProperty
    private String timestamp;
    @JsonProperty
    private String coordinate_x;
    @JsonProperty
    private String coordinate_y;
    @JsonProperty
    private String sentiment;
    @JsonProperty
    private String magnitude;
	@JsonProperty
	private String language;
	@JsonProperty
	private String sa2_name11;
	@JsonProperty
	private String sa2_code11;
	@JsonProperty
	private String tweet_id;

    public Tweet()
    {

    }

    public Tweet(Tweet tweet) {
    	this.content = tweet.getContent();
    	this.timestamp = tweet.getTimestamp();
    	this.coordinate_x = tweet.getCoordinate_x();
    	this.coordinate_y = tweet.getCoordinate_y();
		this.language = tweet.getLanguage();
		this.tweet_id = tweet.getTweet_id();
		this.sentiment = tweet.getSentiment();
		this.sa2_name11 = tweet.getSa2_name11();
		this.sa2_code11 = tweet.getSa2_code11();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getCoordinate_x() {
		return coordinate_x;
	}

	public void setCoordinate_x(String coordinate_x) {
		this.coordinate_x = coordinate_x;
	}

	public String getCoordinate_y() {
		return coordinate_y;
	}

	public void setCoordinate_y(String coordinate_y) {
		this.coordinate_y = coordinate_y;
	}

	public String getSentiment() { return sentiment; }

	public void setSentiment(String sentiment) { this.sentiment = sentiment; }

	public String getMagnitude() { return magnitude; }

    public void setMagnitude(String magnitude) { this.magnitude = magnitude; }

    public String getLanguage() { return language; }

    public void setLanguage(String lang) { this.language = language; }

    public String getSa2_code11() { return sa2_code11; }

    public void setSa2_code11(String sa2_code11) { this.sa2_code11 = sa2_code11; }

    public String getSa2_name11() { return sa2_name11; }

    public void setSa2_name11(String sa2_name11) { this.sa2_name11 = sa2_name11; }

    public String getTweet_id() { return tweet_id; }

    public void setTweet_id(String tweet_id) { this.tweet_id = tweet_id; }
}