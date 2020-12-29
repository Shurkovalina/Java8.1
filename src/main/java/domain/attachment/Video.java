package domain.attachment;

public class Video {
    private int id;
    private int ownerId;
    private String title;
    private String description;
    private int duration;
    private int data;
    private int addingData;
    private int views;
    private int localViews;
    private int comments;
    private String player;
    private String platform;
//    true, если пользователь может редактировать видео
    private boolean canAdd;
//    true, если видеозапись приватная
    private boolean isPrivate;
    private String accessKey;
//    true, если видео в процессе обработки
    private boolean processing;
//    true, если объект добавлен в закладки у текущего пользователя
    private boolean isFavorite;
//    true, если пользователь может комметировать видео
    private boolean canComment;
//    true, если пользователь может редактировать видео
    private boolean canEdit;
//    true, если пользователь может добавить видео в список "Мне нравится"
    private boolean canLike;
//    true, если пользователь может сделать репост видео
    private boolean canRepost;
//    true, если пользователь может подписаться на автора видео
    private boolean canSubscribe;
//    true, если пользователь может добавить автора в избранное
    private boolean canAddToFaves;
//    true, если пользователь может прикрепить кнопку действия к видео
    private boolean canAttachLink;
    private int width;
    private int height;
    private int userId;
//    true, если видео конвертируется
    private boolean converting;
//    true, есл видео добавлено в альбомы пользователя
    private boolean added;
//    true, если пользователь подписан на автора видео
    private boolean isSubscribed;
    private int repeat;
    private String type;
    private int balance;
    private String liveStatus;
    private int spectators;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getAddingData() {
        return addingData;
    }

    public void setAddingData(int addingData) {
        this.addingData = addingData;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLocalViews() {
        return localViews;
    }

    public void setLocalViews(int localViews) {
        this.localViews = localViews;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isCanAdd() {
        return canAdd;
    }

    public void setCanAdd(boolean canAdd) {
        this.canAdd = canAdd;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public boolean isProcessing() {
        return processing;
    }

    public void setProcessing(boolean processing) {
        this.processing = processing;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public boolean isCanSubscribe() {
        return canSubscribe;
    }

    public void setCanSubscribe(boolean canSubscribe) {
        this.canSubscribe = canSubscribe;
    }

    public boolean isCanAddToFaves() {
        return canAddToFaves;
    }

    public void setCanAddToFaves(boolean canAddToFaves) {
        this.canAddToFaves = canAddToFaves;
    }

    public boolean isCanAttachLink() {
        return canAttachLink;
    }

    public void setCanAttachLink(boolean canAttachLink) {
        this.canAttachLink = canAttachLink;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isConverting() {
        return converting;
    }

    public void setConverting(boolean converting) {
        this.converting = converting;
    }

    public boolean isAdded() {
        return added;
    }

    public void setAdded(boolean added) {
        this.added = added;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(boolean subscribed) {
        isSubscribed = subscribed;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(String liveStatus) {
        this.liveStatus = liveStatus;
    }

    public int getSpectators() {
        return spectators;
    }

    public void setSpectators(int spectators) {
        this.spectators = spectators;
    }
}
