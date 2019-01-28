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


public class flightID {

    public static void main(String[] args) throws IOException {
        File file = new File("src\\main\\resources\\html2.txt");
        Document doc = Jsoup.parse(file,"utf-8");


        Elements rows = doc.select("input");
        for (Element checkbox :rows){
           String b= checkbox.attr("name");
            System.out.println(b);
        }
        System.out.println(rows);






        //System.out.println(doc);
//        String tds = doc.select("td").html();
//        List<String> ls = new ArrayList<String>();
//        //String pattern = "name=\"flightID\"\\s+value=\"([^\"]*)\"";
//        String pattern1 ="<input type=\"checkbox\" name=\"([^\"]*)\"\\s+ value=\"on\"></label></b> <input type=\"hidden\"\\s+ name=\"flightID\"\\s+ value=\"([^\"]*)\"";
//
//
//       // String pattern = "name=\"outboundFlight\"\\s+value=\"([^\"]*)\"";
//
//
//        Pattern r = Pattern.compile(pattern1);
//        Matcher m = r.matcher(tds);
//        while (m.find())
//            ls.add(m.group(1));
//
//        System.out.println(ls);
//
////        int index = (int) (Math.random()* ls.size());
////        System.out.println(ls.get(index));

    }





}
