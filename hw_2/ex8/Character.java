package hw_2.ex8;

class Character {
    private int health;
    private int harm;
    private int armor;
    private int magic;

    public Character(int health, int harm, int armor, int magic) {
        this.health = health;
        this.harm = harm;
        this.armor = armor;
        this.magic = magic;
    }

    public Character(Builder builder) {
        this.health = builder.health;
        this.harm = builder.harm;
        this.armor = builder.armor;
        this.magic = builder.magic;
    }

    @Override
    public String toString() {
        return "Character with " + health +
                " health, " + harm +
                " harm, " + armor +
                " armor, " + magic +
                " magic";
    }

    static class Builder {
        private int health;
        private int harm;
        private int armor;
        private int magic;

        public Builder setHealth(int health) {
            this.health = health;
            return this;
        }

        public Builder setHarm(int harm) {
            this.harm = harm;
            return this;
        }

        public Builder setArmor(int armor) {
            this.armor = armor;
            return this;
        }

        public Builder setMagic(int magic) {
            this.magic = magic;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}
