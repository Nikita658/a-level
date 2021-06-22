package HW16;

public class Packer {

    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();
        Box<Pie> pieBox = new Box<>();
        packer.repackage(foodBox, cakeBox);

    }

    public<T extends Goods> void repackage(Box<? super T> to, Box<T> from) {
        to.put(from.get());
    }

}

class Box<T extends  Goods> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}

class Goods {
}

class Food extends Goods{
}

class Bakery extends Food{
}

class Cake extends Bakery {
}

class Pie extends Bakery {
}

class Tart extends Bakery {
}
