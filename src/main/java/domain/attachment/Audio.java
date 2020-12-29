package domain.attachment;

public class Audio {
    private int id;
    private int ownerId;
    private String title;
    private String artist;
    private int duration;
    private String url;
    private int lyricsId;
    private int albumId;
    private int genreId;
    private int data;
//    true, если включена опция "Не выводить при поиске"
    private boolean noSearch;
//    true, если аудио в высоком качестве
    private boolean isHq;

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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(int lyricsId) {
        this.lyricsId = lyricsId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isNoSearch() {
        return noSearch;
    }

    public void setNoSearch(boolean noSearch) {
        this.noSearch = noSearch;
    }

    public boolean isHq() {
        return isHq;
    }

    public void setHq(boolean hq) {
        isHq = hq;
    }
}
