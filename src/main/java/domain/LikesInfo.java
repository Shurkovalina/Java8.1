package domain;

public class LikesInfo {
    //    количество отметок "Мне нравится"
    private int count;
    //    наличие отметки "Мне нравится" от данного пользователя
    private boolean availabilityLike;
    //     true, если есть наличие отметки "Мне нравится" от друга/друзей данного пользователя
    private boolean friendLikes;
//      true, если текущий пользователь может поставить отметку «Мне нравится»
    private boolean canLike;

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

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
