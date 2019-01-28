package jsouUitls;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class address {

    /**
     * 使用jsoup解析HTML，获取城市list
     * @param html html文档传入
     * @param count 从城市列表中取count个不同值
     * @return 新的值的列表list
     */

    public List addjiexi(String html,int count){
        Document doc = Jsoup.parse(html);
        //获取城市数据text
        String rows = doc.select("select").first().text();
        //转换为list
        String[] str =rows.split(" ");
        List ls = Arrays.asList(str);

        //随机取两个不同的数据返回newList
        List newList = getRandomList(ls,count);
        return newList;

    }




    /**
     * 从list中抽取若干个不重复的元素
     * @param ls 被抽取的list
     * @param count 抽取元素个数
     * @return 由抽取元素的新list
     */
    public static List getRandomList(List ls,int count){
        if (ls.size()<count){
            return ls;
        }

        Random random = new Random();
        List<Integer> tempList = new ArrayList<Integer>();
        List<Object> newList = new ArrayList<Object>();
        int temp =0;
        for (int i =0;i<count;i++){
            temp = random.nextInt(ls.size());
            if (!tempList.contains(temp)){
                tempList.add(temp);
                newList.add(ls.get(temp));
            }
            else {
                i--;
            }
        }

        return newList;

    }

}
