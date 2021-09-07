import java.util.*;

public class FrequencySortUrls {
    public static void main(String[] args) {

        /*
        *
        * Given a list of urls
"https://www.youtube.com/",
"https://www.google.com/",
"https://www.netflix.com/",
"https://www.netflix.com/",
"https://www.youtube.com/",
"https://www.jadeblack.co/",
"https://www.google.com/"
Sort Urls by most visited at top.
If two urls visited same number of times, sort alphabetically.
        *
        * */

        List<String> urlList = Arrays.asList("https://www.youtube.com/",
                "https://www.google.com/",
                "https://www.netflix.com/",
                "https://www.netflix.com/",
                "https://www.youtube.com/",
                "https://www.jadeblack.co/",
                "https://www.google.com/");

        Map<String, Integer> map = new TreeMap<>();

        urlList.forEach(url -> {
            if (map.containsKey(url)) {
                map.put(url, map.get(url) + 1);
            } else {
                map.put(url, 1);
            }
        });



        Map<Integer, Set<String>> resultMap = new TreeMap<>(Collections.reverseOrder());

        map.forEach((url, visit) -> {
            if (resultMap.containsKey(visit)) {
                Set<String> set = resultMap.get(visit);
                set.add(url);
                resultMap.put(visit, set);
            } else {
                Set<String> urls = new TreeSet<>();
                urls.add(url);
                resultMap.put(visit, urls);
            }
        });

        resultMap.forEach((k, v) -> System.out.println(k + " " +v));


    }
}
