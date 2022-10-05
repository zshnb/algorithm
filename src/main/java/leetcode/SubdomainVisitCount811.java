package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 思路1：模拟，把输入的域名从开头用.不断取子字符串后放入map中计数，最后要记得把剩下不带.的根域名也放入map
 * */
public class SubdomainVisitCount811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> domainWithCount = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] countAndDomain = cpdomain.split(" ");
            int visitCount = Integer.parseInt(countAndDomain[0]);
            String domain = countAndDomain[1];
            while (domain.contains(".")) {
                domainWithCount.put(domain, domainWithCount.getOrDefault(domain, 0) + visitCount);
                domain = domain.substring(domain.indexOf(".") + 1);
            }
            domainWithCount.put(domain, domainWithCount.getOrDefault(domain, 0) + visitCount);
        }
        List<String> result = new ArrayList<>();
        for (Entry<String, Integer> stringIntegerEntry : domainWithCount.entrySet()) {
            result.add(String.format("%d %s", stringIntegerEntry.getValue(), stringIntegerEntry.getKey()));
        }
        return result;
    }
}
