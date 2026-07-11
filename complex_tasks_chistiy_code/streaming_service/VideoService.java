package complex_tasks_chistiy_code.streaming_service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class VideoService {
    //Facade
    private AviVideoAdapter aviVideoAdapter;
    private MovVideoAdapter movVideoAdapter;
    private WmvVideoAdapter wmvVideoAdapter;

    private List<Video> videos = new ArrayList<>();

    public VideoService(AviVideoAdapter aviVideoAdapter, MovVideoAdapter movVideoAdapter, WmvVideoAdapter wmvVideoAdapter) {
        this.aviVideoAdapter = aviVideoAdapter;
        this.movVideoAdapter = movVideoAdapter;
        this.wmvVideoAdapter = wmvVideoAdapter;
    }

    public void uploadVideo(Video video) {
        System.out.println("Uploading video");

        VideoAdapter videoAdapter = Stream.of(aviVideoAdapter, movVideoAdapter, wmvVideoAdapter)
                .filter(adapter -> adapter.getSupportedVideoFormat() == video.getVideoFormat())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No adapter supporting this format found"));

        videoAdapter.convertToMp4(video);

        videos.add(video);
    }

    public void streamVideo(int videoId) {
        Video found = videos.stream()
                .filter(video -> video.getVideoID() == videoId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No video with such id found"));

        if (found.getVideoFormat() != VideoFormat.MP4) {
            throw new IllegalArgumentException("Unsupported video format");
        }

        System.out.println("Streaming video in MP4 format, Video ID: " + videoId);
    }
}
