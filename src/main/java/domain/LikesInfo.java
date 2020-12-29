package domain;

public class LikesInfo {
    //    количество отметок "Мне нравится"
    private int count;
    //    наличие отметки "Мне нравится" от данного пользователя
    private boolean availabilityLike;
    //    наличие отметки "Мне нравится" от друга/друзей данного пользователя
    private boolean friendLikes;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isAvailabilityLike() {
        return availabilityLike;
    }

    public void setAvailabilityLike(boolean availabilityLike) {
        this.availabilityLike = availabilityLike;
    }

    public boolean isFriendLikes() {
        return friendLikes;
    }

    public void setFriendLikes(boolean friendLikes) {
        this.friendLikes = friendLikes;
    }
}
