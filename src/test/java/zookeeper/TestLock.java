package zookeeper;

/**
 * @author tim
 * @date 2022/9/17 12:11 上午
 */
public class TestLock {
    public static void main(String[] args) {
        Ticket12306 ticket12306 = new Ticket12306();

        //创建客户端
        Thread t1 = new Thread(ticket12306, "携程");
        Thread t2 = new Thread(ticket12306, "飞猪");

        t1.start();
        t2.start();
    }
}
