package jsouUitls;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HtmlJiexi {


    public static void main(String[] args) throws IOException {
        File input = new File("src\\main\\resources\\html.txt");
        Document doc = Jsoup.parse(input, "UTF-8", "www.sina.com");
        // System.out.println(doc);
//        Elements trs = doc.select("table").select("tr");
////       for (int i =0;i<trs.size();i++){
////           Elements tds = trs.get(i).select("td");
////           for (int j =0;j<tds.size();j++){
////               String text = tds.get(j).text();
////               Element test2 = tds.get(j);
////               System.out.println(test2);
////           }
////       }

        String tds = doc.select("td").html();
        System.out.println(tds);

        List<String> ls = new ArrayList<String>();
        String pattern = "name=\"outboundFlight\" .*?value=\"(.*?)\"";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(tds);
        while (m.find())
            ls.add(m.group());
        System.out.println(ls);





    }

}
