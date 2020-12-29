package domain;

public class Post {
    private int id;
    //    текст записи
    private String text;
    //    вложения к записи
    private InvestmentInfo investmentInfo;
    //    количество просмотров записи
    private int numberViews;
    //    дата размещения записи
    private int data;
    //    id того, кто добавил запись
    private int idFrom;
    //    информация о репостах
    private RepostsInfo repostsInfo;
    //    информация об отметке "Мне нравится"
    private LikesInfo likesInfo;
    //    информация о комментариях
    private CommentsInfo commentsInfo;
    //    информация о дополнительных действиях с записью
    private ActionsInfo actionsInfo;
    //    id источника, из которого добавлена запись
    private int idSource;
    //    id пользователя, на стене которого размещена запись
    private int idWhere;
    //    закреплена ли запись
    private boolean fix;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public InvestmentInfo getInvestmentInfo() {
        return investmentInfo;
    }

    public void setInvestmentInfo(InvestmentInfo investmentInfo) {
        this.investmentInfo = investmentInfo;
    }

    public int getNumberViews() {
        return numberViews;
    }

    public void setNumberViews(int numberViews) {
        this.numberViews = numberViews;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getIdFrom() {
        return idFrom;
    }

    public void setIdFrom(int idFrom) {
        this.idFrom = idFrom;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public ActionsInfo getActionsInfo() {
        return actionsInfo;
    }

    public void setActionsInfo(ActionsInfo actionsInfo) {
        this.actionsInfo = actionsInfo;
    }

    public int getIdSource() {
        return idSource;
    }

    public void setIdSource(int idSource) {
        this.idSource = idSource;
    }

    public int getIdWhere() {
        return idWhere;
    }

    public void setIdWhere(int idWhere) {
        this.idWhere = idWhere;
    }

    public boolean isFix() {
        return fix;
    }

    public void setFix(boolean fix) {
        this.fix = fix;
    }
}
