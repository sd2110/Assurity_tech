package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Promotion {
    @JsonProperty("Id")
    public int id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Price")
    public double price;
    @JsonProperty("MinimumPhotoCount")
    public int minimumPhotoCount;
    @JsonProperty("OriginalPrice")
    public double originalPrice;
    @JsonProperty("Recommended")
    public boolean recommended;
}
