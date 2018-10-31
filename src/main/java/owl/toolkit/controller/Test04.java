package owl.toolkit.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LINJIYANG
 * @date 2018-10-31 10:37
 */
public class Test04 {
    public static void main(String[] args){
        System.out.println("1");
        System.out.println();
        int x=0;
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        for (String s : list) {
            System.out.println(s);
        }

    }

    

}
