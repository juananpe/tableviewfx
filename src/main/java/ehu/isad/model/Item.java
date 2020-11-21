package ehu.isad.model;

import javafx.scene.control.Hyperlink;

public class Item {
    private String websiteName;
    private Hyperlink hyperlink;

    public Item(String websiteName, String websiteUrl) {
        this.websiteName = websiteName;
        this.hyperlink = new Hyperlink(websiteUrl);
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public Hyperlink getHyperlink() {
        return hyperlink;
    }

    public void setHyperlink(String websiteUrl) {
        this.hyperlink = new Hyperlink(websiteUrl);
    }
}
