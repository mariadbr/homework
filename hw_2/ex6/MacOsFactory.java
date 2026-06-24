package hw_2.ex6;

class MacOsFactory implements GUIFactory{
    @Override
    public IMenu createMenu() {
        return new MacOSMenu();
    }

    @Override
    public IWindow createWindow() {
        return new MacOSWindow();
    }

    @Override
    public IButton createButton() {
        return new MacOSButton();
    }
}
