package complex_tasks_chistiy_code.streaming_service;

public enum VideoFormat {
    AVI(".avi"),
    MOV(".mov"),
    WMV(".wmv"),
    MP4(".mp4");

    private String fileExtension;

    VideoFormat(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getFileExtension() {
        return fileExtension;
    }
}
