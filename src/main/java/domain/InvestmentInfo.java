package domain;

public class InvestmentInfo {
    //    ссылка на вложение
    private String link;
    //    название вложения
    private String name;
    //    id вложения
    private int id;
    //    тип вложения
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
