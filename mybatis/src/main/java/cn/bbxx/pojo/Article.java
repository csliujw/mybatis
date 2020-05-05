package cn.bbxx.pojo;

public class Article {
    private String title;
    private String username;
    private Integer readcount;
    private String date;

    public Article() {
    }

    public Article(String title, String username, Integer readcount, String date) {
        this.title = title;
        this.username = username;
        this.readcount = readcount;
        this.date = date;
    }

    public Article(String username) {
        this.username = username;
    }

    public Integer getReadcount() {
        return readcount;
    }

    public void setReadcount(Integer readcount) {
        this.readcount = readcount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}