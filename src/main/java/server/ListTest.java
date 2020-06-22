package server;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @ClassName ListTest
 * @Description: TODO
 * @Author lxc
 * @Date 2020/6/22 18:32
 * @Version V1.0
 **/
public class ListTest {
    public static void main(String[] args)throws Exception {
        Thread thread = new Thread(()->{
            addArraylist();

        });
        Thread thread2 = new Thread(()->{
            addLinkedList();
        });
        thread.start();
        thread.join();
        thread2.start();
        thread2.join();
    }
    private static void addArraylist(){
        ArrayList<String > arrayList = new ArrayList();
        long begin2 = System.currentTimeMillis();
        for(int j= 0 ;j<1000000;j++){
            arrayList.add(j+"===");
        }
        System.out.println("arraylist花费了："+(System.currentTimeMillis()-begin2)+"毫秒");
        System.out.println(arrayList.size());

    }

    private static void addLinkedList(){
        LinkedList<String > linkedList = new LinkedList();
        long begin = System.currentTimeMillis();
        for( int i=0 ;i<1000000;i++){
            linkedList.add(i+"===");
        }
        System.out.println("linkedList花费了："+(System.currentTimeMillis()-begin)+"毫秒");
        System.out.println(linkedList.size());
    }
}
