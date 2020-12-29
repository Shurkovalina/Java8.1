package domain;

public class RepostsInfo {
    //    количество репостов записи
    private int count;
    //    наличие репоста от данного пользователя
    private boolean availabilityRepost;

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
