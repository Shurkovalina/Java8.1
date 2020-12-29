package domain;

public class RepostsInfo {
    //    количество репостов записи
    private int count;
    //     true, если есть наличие репоста от данного пользователя
    private boolean availabilityRepost;
//     true, если текущий пользователь может сделать репост записи
    private boolean canPublish;

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isAvailabilityRepost() {
        return availabilityRepost;
    }

    public void setAvailabilityRepost(boolean availabilityRepost) {
        this.availabilityRepost = availabilityRepost;
    }
}
