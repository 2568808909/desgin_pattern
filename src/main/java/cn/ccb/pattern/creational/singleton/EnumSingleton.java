package cn.ccb.pattern.creational.singleton;

public enum EnumSingleton {

    INSTANCE("Tom", 22),
    SECONDE("Jack", 21);

    private String name;
    private Integer age;

    EnumSingleton(String name, Integer age) {
        System.out.println("EnumSingleton");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "EnumSingleton{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
