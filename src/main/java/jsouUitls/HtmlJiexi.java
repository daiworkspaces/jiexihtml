package jsouUitls;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HtmlJiexi {

    public  String jiexi(String html,String pattern){
        Document doc = Jsoup.parse(html);
        String tds = doc.select("td").html();
        List<String> ls = new ArrayList<String>();
       // String pattern ="name=\"outboundFlight\"\\s+value=\"([^\"]*)\"";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(tds);
        while (m.find())
            ls.add(m.group(1));

        //随机取值
        int index = (int) (Math.random()* ls.size());
        return  ls.get(index);
    }


    public static void main(String[] args) {
        String html ="<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en-US\" xml:lang=\"en-US\">\n" +
                " <head> \n" +
                "  <title>Flight Selections</title> \n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\"> \n" +
                " </head> \n" +
                " <body bgcolor=\"#E0E7F1\"> \n" +
                "  <style>blockquote {font-family: tahoma; font-size : 10pt}H1 {font-family: tahoma; font-size : 22pt; color: #993333}small {font-family: tahoma; font-size : 8pt}H3 {font-family: tahoma; font-size : 10pt; color: black}TD {font-family: tahoma; font-size : 10pt; color: black}</style>\n" +
                "  <br>\n" +
                "  <br>\n" +
                "  <h1><font color=\"#003366\">&nbsp;&nbsp;<b>Find Flight</b></font></h1>\n" +
                "  <blockquote> \n" +
                "   <!-- JSVerification Server Option --> \n" +
                "   <script src=\"/WebTours/chooseFlightValidate.js\">document.write(\"Included JS file not found\")</script>\n" +
                "   <form method=\"post\" action=\"reservations.pl\" enctype=\"application/x-www-form-urlencoded\"> \n" +
                "    <center> \n" +
                "     <!-- From Denver (0) To Paris (4) --> \n" +
                "     <blockquote>\n" +
                "      Flight departing from \n" +
                "      <b>Denver</b> to \n" +
                "      <b>Paris</b> on \n" +
                "      <b>01/26/2019</b>\n" +
                "      <br>\n" +
                "      <br>\n" +
                "     </blockquote>\n" +
                "     <table cellspacing=\"2\" border=\"0\" width=\"50%\"> \n" +
                "      <tbody>\n" +
                "       <tr bgcolor=\"#5E7884\">\n" +
                "        <td align=\"center\"><font color=\"white\"><b>Flight</b></font> </td>\n" +
                "        <td align=\"center\"><font color=\"white\"><b>Departure time</b> </font></td>\n" +
                "        <td align=\"center\"><font color=\"white\"><b>Cost</b> </font></td>\n" +
                "       </tr>\n" +
                "       <tr bgcolor=\"#EFF2F7\">\n" +
                "        <td align=\"center\"><input type=\"radio\" name=\"outboundFlight\" value=\"040;350;01/26/2019\" checked>Blue Sky Air 040</td>\n" +
                "        <td align=\"center\">8am</td>\n" +
                "        <td align=\"center\">$ 350</td>\n" +
                "       </tr>\n" +
                "       <tr bgcolor=\"#EFF2F7\">\n" +
                "        <td align=\"center\"><input type=\"radio\" name=\"outboundFlight\" value=\"041;312;01/26/2019\">Blue Sky Air 041</td>\n" +
                "        <td align=\"center\">1pm</td>\n" +
                "        <td align=\"center\">$ 312</td>\n" +
                "       </tr>\n" +
                "       <tr bgcolor=\"#EFF2F7\">\n" +
                "        <td align=\"center\"><input type=\"radio\" name=\"outboundFlight\" value=\"042;331;01/26/2019\">Blue Sky Air 042</td>\n" +
                "        <td align=\"center\">5pm</td>\n" +
                "        <td align=\"center\">$ 331</td>\n" +
                "       </tr>\n" +
                "       <tr bgcolor=\"#EFF2F7\">\n" +
                "        <td align=\"center\"><input type=\"radio\" name=\"outboundFlight\" value=\"043;287;01/26/2019\">Blue Sky Air 043</td>\n" +
                "        <td align=\"center\">11pm</td>\n" +
                "        <td align=\"center\">$ 287</td>\n" +
                "       </tr>\n" +
                "      </tbody>\n" +
                "     </table> \n" +
                "     <input type=\"hidden\" name=\"numPassengers\" value=\"1\">\n" +
                "     <input type=\"hidden\" name=\"advanceDiscount\" value=\"0\">\n" +
                "     <input type=\"hidden\" name=\"seatType\" value=\"Coach\">\n" +
                "     <input type=\"hidden\" name=\"seatPref\" value=\"None\"> \n" +
                "     <p></p>\n" +
                "     <center>\n" +
                "      <table width=\"80%\" cellspacing=\"1\">\n" +
                "       <tbody>\n" +
                "        <tr>\n" +
                "         <td align=\"center\"> <input type=\"image\" name=\"reserveFlights\" src=\"/WebTours/images/button_next.gif\" border=\"0\"> </td>\n" +
                "         <td>&nbsp;</td>\n" +
                "         <td align=\"center\"></td>\n" +
                "        </tr>\n" +
                "       </tbody>\n" +
                "      </table>\n" +
                "     </center>\n" +
                "    </center>\n" +
                "   </form> \n" +
                "  </blockquote>  \n" +
                " </body>\n" +
                "</html>";

        String pattern = "name=\"outboundFlight\"\\s+value=\"([^\"]*)\"";
        HtmlJiexi aa = new HtmlJiexi();
        String a = aa.jiexi(html,pattern);

        System.out.println(a);
    }

}
