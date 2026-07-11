package complex_tasks_chistiy_code.streaming_service;

public class Main {
    public static void main(String[] args) {
        // Инициализация сервиса с адаптерами для поддерживаемых форматов
        VideoService videoService = new VideoService(new AviVideoAdapter (),
                new MovVideoAdapter(), new WmvVideoAdapter ());

        // Загрузка видео файла в формате AVI
        Video video1 = new Video(123,"path/to/example.avi", VideoFormat.AVI);
        System.out.println("Video format: " + video1.getVideoFormat().getFileExtension());
        videoService.uploadVideo(video1);

        // Стриминг видео в формате МР4
        videoService.streamVideo(video1.getVideoID());


    }
}
