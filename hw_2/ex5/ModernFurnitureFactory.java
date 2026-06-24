package hw_2.ex5;

class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public IChair createChair() {
        return new ModernChair();
    }

    @Override
    public ITable createTable() {
        return new ModernTable();
    }
}
