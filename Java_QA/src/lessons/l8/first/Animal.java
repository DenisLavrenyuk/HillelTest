package lessons.l8.first;

public abstract class Animal {
    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    private String name;
    abstract void greeds();
    @Override
    public String toString() {
        return "{\"Name\":"+name+"}";
    }
    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        return (obj instanceof Animal animal)&&(this.getName().equals(animal.getName()));
    }
}
