package senghuot.github.com.kakuna.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TinyURL {
    @Id
    private String tinyUrl;
    private String url;

    public TinyURL(String tinyUrl, String url) {
        this.tinyUrl = tinyUrl;
        this.url = url;
    }

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
