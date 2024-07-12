abstract class PCComponent {
    String name;
    double price;

    //constructor
    PCComponent(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract double getPrice();

    //override convert name of the component to string
    @Override
    public String toString() {
        return name;
    }
}

//inheritance
class CPU extends PCComponent {
    CPU(String name, double price) {
        super(name, price);
    }
    //getter for CPU
    @Override
    double getPrice() {
        return price;
    }
}

class GPU extends PCComponent {
    GPU(String name, double price) {
        super(name, price);
    }

    //getter for GPU
    @Override
    double getPrice() {
        return price;
    }
}

class RAM extends PCComponent {
    RAM(String name, double price) {
        super(name, price);
    }

    //getter for RAM
    @Override
    double getPrice() {
        return price;
    }
}

class Storage extends PCComponent {
    Storage(String name, double price) {
        super(name, price);
    }

    //getter for Storage
    @Override
    double getPrice() {
        return price;
    }
}

