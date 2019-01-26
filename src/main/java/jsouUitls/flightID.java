package jsouUitls;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

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
        //System.out.println(doc);
        String tds = doc.select("td").html();
        List<String> ls = new ArrayList<String>();
        String pattern = "name=\"flightID\"\\s+value=\"([^\"]*)\"";

       // String pattern = "name=\"outboundFlight\"\\s+value=\"([^\"]*)\"";


        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(tds);
        while (m.find())
            ls.add(m.group(1));

        System.out.println(ls);

        int index = (int) (Math.random()* ls.size());
        System.out.println(ls.get(index));

    }





}
