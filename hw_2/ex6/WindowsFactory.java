package hw_2.ex6;

class WindowsFactory implements GUIFactory{
    @Override
    public IMenu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public IWindow createWindow() {
        return new WindowsWindow();
    }

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }
}
