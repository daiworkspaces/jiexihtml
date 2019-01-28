package jsouUitls;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class hangban {

    public String hagbanjiex(String html){
        Document doc = Jsoup.parse(html);
        //获取航班数据,转换为list
        List<String> ls = new ArrayList<String>();
        Elements radios = doc.select("input[type=radio]");
        for (Element a :radios)
            ls.add(a.val());

        //从list随机取值
        Random random = new Random();
        int index = random.nextInt(ls.size());
        System.out.println(ls.get(index));
        return ls.get(index);
    }

}
