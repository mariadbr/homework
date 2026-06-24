package hw_2.ex5;

class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public IChair createChair() {
        return new ClassicChair();
    }

    @Override
    public ITable createTable() {
        return new ClassicTable();
    }
}
