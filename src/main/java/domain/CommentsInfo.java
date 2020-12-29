package domain;

public class CommentsInfo {
    //    количество комментариев
    private int count;
    //    может ли данный пользователь комментировать запись
    private boolean canPost;
    //    показывать ли сначала наиболее интересные комментарии
    private boolean popularComment;
    //    показывать ли следующий комментарий
    private boolean nextComment;
    //    количество отметок "Мне нравится" на комментариях
    private int countLike;

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
