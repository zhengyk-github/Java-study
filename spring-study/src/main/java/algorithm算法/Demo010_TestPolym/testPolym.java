package algorithm算法.Demo010_TestPolym;

/**
 * @ClassName: testPolym
 * @Date: Created in 2022/8/8 14:48
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: 测试多态
 **/
public class testPolym {
    public static void main(String[] args) {
        Animal animal = new Animal();
        AnimalCry(animal);
        Dog dog = new Dog();
        AnimalCry(dog);
    }

    public static void AnimalCry(Animal a){
        a.shout();
    }
}
class Animal{
    public void shout(){
        System.out.println("叫了一声");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("汪汪");
    }
}