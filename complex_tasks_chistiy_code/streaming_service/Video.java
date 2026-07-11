package complex_tasks_chistiy_code.streaming_service;

public class Video {
    private int videoID;
    private String videoPath;
    private VideoFormat videoFormat;

    public Video(int videoID, String videoPath, VideoFormat videoFormat) {
        this.videoID = videoID;
        this.videoPath = videoPath;
        this.videoFormat = videoFormat;
    }

    public int getVideoID() {
        return videoID;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public VideoFormat getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(VideoFormat videoFormat) {
        this.videoFormat = videoFormat;
    }
}
