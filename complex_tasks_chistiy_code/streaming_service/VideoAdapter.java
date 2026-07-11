package complex_tasks_chistiy_code.streaming_service;

public interface VideoAdapter {
    void convertToMp4(Video video);
    VideoFormat getSupportedVideoFormat();
}
