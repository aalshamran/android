package annotation.com.newsapp;

/**
 * Created by java- on 5/5/2017.
 */

public class News {

    private String title;
    private String url;
    private String publishDate;
    private String category;

    public News(String title, String publishDate, String category, String url) {
        this.title = title;
        this.url = url;
        this.publishDate = publishDate;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getCategory() {
        return category;
    }
}
