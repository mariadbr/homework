package practice_6.task_8;

public class Main {
    /**
     * 1 сущности
     *экспонат: манускрипт, скульптура, музей
     *
     * 2 действия
     *
     * 3 связи
     *наследование, полимофризм
     *
     * 4 классы и свойства(поля) и действия(методы)
     *Exhibit -
     *history(), storageConditions()
     * Sculpture
     *history(), storageConditions()
     * Manuscript
     *history(), storageConditions()
     * Museum - exhibit
     * setExhibit(), showInfo()
     *
     */
    public static void main(String[] args) {
        Museum myMuseum = new Museum();

        Exhibit mySculpture = new Sculpture();
        Exhibit myManuscript = new Manuscript();

        myMuseum.setExhibit(myManuscript);
        myMuseum.showInfo();
    }
}
