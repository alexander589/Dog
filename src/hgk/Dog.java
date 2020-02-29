package hgk;

public class Dog {
    String name;
    String color;
    int weight;
    int age;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Dog(String name, String color, int weight, int age){
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Тузик", "Белый", 40, 7);
        System.out.println(dog);
    }

    @Override
    public String toString(){
        return "Dog имя " + this.name + ", цвет " + this.color + ", вес " + this.weight + ", возрост " + this.age;
    }
}
