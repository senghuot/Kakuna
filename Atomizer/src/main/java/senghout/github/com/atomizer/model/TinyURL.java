package senghout.github.com.atomizer.model;

import org.springframework.data.annotation.Id;

public class TinyURL {
    @Id
    private String tinyUrl;
    private String url;

    public String getTinyUrl() {
        return tinyUrl;
    }

    public void setTinyUrl(String tinyUrl) {
        this.tinyUrl = tinyUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
