package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Fees {
    @JsonProperty("Bundle")
    public double bundle;
    @JsonProperty("EndDate")
    public double endDate;
    @JsonProperty("Feature")
    public double feature;
    @JsonProperty("Gallery")
    public double gallery;
    @JsonProperty("Listing")
    public double listing;
    @JsonProperty("Reserve")
    public double reserve;
    @JsonProperty("Subtitle")
    public double subtitle;
    @JsonProperty("TenDays")
    public double tenDays;
    @JsonProperty("ListingFeeTiers")
    public ArrayList<ListingFeeTier> listingFeeTiers;
    @JsonProperty("SecondCategory")
    public double secondCategory;
}
