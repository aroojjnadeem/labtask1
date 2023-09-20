import java.util.Objects;

public class Music {
    private String title;
    private String duration;
    private String genre;
    private Date releasedate;
    private Singer singer;
    Music(String title,String duration,String genre,Date releasedate,Singer singer){
        this.title=title;
        this.duration=duration;
        this.genre=genre;
        this.releasedate=releasedate;
        this.singer=singer;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }


    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", genre='" + genre + '\'' +
                ", releasedate=" + releasedate +
                ", singer=" + singer +
                '}';

    }

    //    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Music music)) return false;
//        return Objects.equals(getTittle(), music.getTittle());
//    }

    public boolean equals(Music m){

        return this.title.equals(m.title)?true:false;
    }


}
