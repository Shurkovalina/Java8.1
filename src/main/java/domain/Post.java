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
    //    id источника, из которого добавлена запись
    private int idSource;
    //    id пользователя, на стене которого размещена запись
    private int idWhere;
    //    true, если запись закреплена
    private boolean fix;

    //    информация о местоположении
    private Geo geo;
    //    true, если текущий пользователь может удалить запись
    private boolean canDelete;
    //    true, если текущий пользователь может редактировать запись
    private boolean canEdit;
    //        true, если текущий пользователь может закрепить запись
    private boolean canPin;
    //    true, если запись содержит отметку "реклама"
    private boolean markedAsAds;
    //    true, если объект добавлен в закладки у текущего пользователя
    private boolean isFavorite;
    // идентификатор администратора, который опубликовал запись
    private int createdBy;
    //    идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyOwnerId;
    //    идентификатор записи, в ответ на которую была оставлена текущая
    private int replyPostId;
    //    true, если запись была создана с опцией «Только для друзей»
    private boolean friendsOnly;
    //    информация о записи VK Donut
    private Donut donut;
    //    идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере
    private int postponedId;

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

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
