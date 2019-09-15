package cn.ccb.pattern.creational.simplefactory;

import java.util.Calendar;

/**
 * 定义：由一个工厂对象决定创建出哪一种产品类型
 * 类型：创建型，但并不列入于GOF23种设计模式中
 * 抽象工厂和工厂方法一步步演进的
 * <p>
 * 使用场景：
 * 1.工厂类负责创建的对象比较少
 * 2.客户端(应用层)只知道传入工厂类的参数，对于如何创建对象(逻辑)并不关心
 * <p>
 * 优点:只需传入正确的参数，就可以获取你所需要的对象而无需知道其创建细节
 * 缺点：工厂的职责相对过重，增加新的产品需要修改工厂类的判断逻辑，违背了开闭原则
 * <p>
 * 该类也可以写成静态工厂，但是静态工厂方法不能被重写，也就失去了扩展性。所以如果在没有继承需求的情况下，
 * 可以选择写成静态。
 *
 * JDK中使用了简单工厂的例子:
 * 1.{@link Calendar#getInstance()} 这个方法调用了一个私有的方法createCalender这个方法跟{@link VideoFactory#getInstance(String)}方法有异曲同工的地方，也是通过传入不同的参数来返回不同类型的实例
 * 2.我们在使用jdbc时，一开始都要写这么一句代码，Class.forName("com.mysql.jdbc.Driver");以获取到DriverManager。
 *
 * 扩展：
 * 1.LogBack中的loggerFactory中的getLogger方法也是使用了简单工厂
 */
public class VideoFactory {

    public Video getInstance(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        } else {
            throw new IllegalArgumentException("还没有这种类型的视频哦");
        }
    }

    /**
     * 使用反射创建对象，当有新的对象要创建时，基本不需要更改工厂方法的代码，
     * 在一定程度上可以满足开闭原则。
     *
     * @param cls
     * @return
     */
    public Video getInstance(Class<? extends Video> cls) {
        if (cls != null) {
            try {
                return (Video) Class.forName(cls.getName()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
