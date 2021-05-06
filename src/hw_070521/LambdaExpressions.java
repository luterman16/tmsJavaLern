package hw_070521;

import java.util.ArrayList;
public class LambdaExpressions {
    public static void main(String[] args) {
        String[] strings1 = {"строка1"};
        String[] strings2 = {"строка1", "строка2", "строка3"};
        String[] strings3 = {"строка1", "строка2"};

        ArrayList<String[]> stringArrayList = new ArrayList<>();
        stringArrayList.add(strings1);
        stringArrayList.add(strings2);
        stringArrayList.add(strings3);

        stringArrayList.sort((s1,s2) -> s1.length - s2.length);

        stringArrayList.sort((s1,s2) -> s2.length - s1.length);




    }
}
