package domain;

public class CommentsInfo {
    //    количество комментариев
    private int count;
    //    true, если данный пользователь может комментировать запись
    private boolean canPost;
    //    true, если показывать сначала наиболее интересные комментарии
    private boolean popularComment;
    //     true, если показывать следующий комментарий
    private boolean nextComment;
    //    количество отметок "Мне нравится" на комментариях
    private int countLike;

    //     true, если текущий пользователь может комментировать запись
    private boolean groupsCanPost;
    //     true, если текущий пользователь может закрыть комментарии к записи
    private boolean canClose;
    //     true, если текущий пользователь может открыть комментарии к записи
    private boolean canOpen;

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isPopularComment() {
        return popularComment;
    }

    public void setPopularComment(boolean popularComment) {
        this.popularComment = popularComment;
    }

    public boolean isNextComment() {
        return nextComment;
    }

    public void setNextComment(boolean nextComment) {
        this.nextComment = nextComment;
    }

    public int getCountLike() {
        return countLike;
    }

    public void setCountLike(int countLike) {
        this.countLike = countLike;
    }
}
