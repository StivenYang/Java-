package top.hengshare.interview.pattern.flyweight.gc;

/**
 * @program: Java-Interview
 * @description:
 * @author: StivenYang
 * @create: 2019-10-22 11:54
 **/
public interface Flyweight {
    boolean match(String entity, String permit);

    void add(Flyweight flyweight);
}
