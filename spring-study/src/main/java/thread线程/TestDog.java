package thread线程;

/**
 * @ClassName: TestDog
 * @Date: Created in 2022/8/9 11:10
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: TODO
 **/
public class TestDog {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        a.move();
        b.move();
//        b.bark();
    }
}

class Animal{
    public void move(){
        System.out.println("Animal move");
    }
}


class Dog extends Animal {
    public void move() {
        System.out.println("dog move");
    }
    public void bark() {
        System.out.println("dog bark");
    }


}