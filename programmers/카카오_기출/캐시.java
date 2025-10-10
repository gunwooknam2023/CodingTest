package 카카오_기출;

import java.util.ArrayList;
import java.util.List;

public class 캐시 {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return cities.length * 5;

        List<String> cache = new ArrayList<>();
        int time = 0;

        for(String city : cities){
            city = city.toLowerCase();

            if(cache.contains(city)){
                time += 1;
                cache.remove(city);
                cache.add(city);
            } else{
                time += 5;
                if(cache.size() >= cacheSize){
                    cache.remove(0);
                }
                cache.add(city);
            }
        }
        return time;
    }
}
