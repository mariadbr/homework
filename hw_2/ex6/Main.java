package hw_2.ex6;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory;
        String osType = "MacOs";

        if (osType.equals("MacOs")) {
            guiFactory = new MacOsFactory();
        } else if (osType.equals("Windows")) {
            guiFactory = new WindowsFactory();
        } else {
            throw new IllegalArgumentException("This OS type is not supported");
        }

        guiFactory.createButton().paint();
        guiFactory.createMenu().make();
        guiFactory.createWindow().draw();
    }
}
