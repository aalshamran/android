package annotation.com.tour;

/**
 * Created by java- on 5/26/2017.
 */

public class City {
    private String mLocationName;
    private String mAbout;
    private int mImage = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public City(String mLocationName, String mAbout, int mImage) {
        this.mLocationName = mLocationName;
        this.mAbout = mAbout;
        this.mImage = mImage;
    }

    public City(String mLocationName, String mAbout) {
        this.mLocationName = mLocationName;
        this.mAbout = mAbout;
    }



    // Return name of the location
    public String getmLocationName() {
        return mLocationName;
    }

    // Return a description about the location
    public String getmAbout() {
        return mAbout;
    }

    // Return image ID
    public int getmImage() {
        return mImage;
    }

    // Return if there is an image for the location
    public boolean hasImage(){
        return mImage != NO_IMAGE_PROVIDED;
    }
}
