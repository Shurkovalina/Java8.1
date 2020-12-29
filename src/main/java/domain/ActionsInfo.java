package domain;

public class ActionsInfo {
    //    "Это не интересно"
    private boolean interesting;
    //    "Сохранить в закладках"
    private boolean save;
    //    "Пожаловаться"
    private boolean report;
    //    "Уведомлять о записях"
    private boolean notification;

    public boolean isInteresting() {
        return interesting;
    }

    public void setInteresting(boolean interesting) {
        this.interesting = interesting;
    }

    public boolean isSave() {
        return save;
    }

    public void setSave(boolean save) {
        this.save = save;
    }

    public boolean isReport() {
        return report;
    }

    public void setReport(boolean report) {
        this.report = report;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }
}
