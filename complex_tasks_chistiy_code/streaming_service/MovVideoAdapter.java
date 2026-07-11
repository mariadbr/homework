package complex_tasks_chistiy_code.streaming_service;

public class MovVideoAdapter implements VideoAdapter{
    @Override
    public void convertToMp4(Video video) {
        video.setVideoFormat(VideoFormat.MP4);
        System.out.println("Converting video from MOV format into MP4 format");
    }

    @Override
    public VideoFormat getSupportedVideoFormat() {
        return VideoFormat.MOV;
    }
}
