package 카카오_기출;

import java.util.ArrayList;
import java.util.List;

public class 뉴스_클러스터링 {
    public int solution(String str1, String str2) {
        List<String> list1 = makeSet(str1);
        List<String> list2 = makeSet(str2);

        if(list1.isEmpty() && list2.isEmpty()) return 65536;

        List<String> intersection = new ArrayList<>();
        List<String> copyList2 = new ArrayList<>(list2);

        for(String s : list1){
            if(copyList2.contains(s)){
                intersection.add(s);
                copyList2.remove(s);
            }
        }
        int unionSize = list1.size() + list2.size() - intersection.size();

        double jaccard = (double) intersection.size() / unionSize;
        return (int) Math.floor(jaccard * 65536);
    }

    private List<String> makeSet(String str){
        List<String> list = new ArrayList<>();
        str = str.toUpperCase();

        for(int i=0; i<str.length()-1; i++){
            char a = str.charAt(i);
            char b = str.charAt(i+1);

            if(Character.isLetter(a) && Character.isLetter(b)){
                list.add("" + a + b);
            }
        }
        return list;
    }
}
