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
                "   <form method=\"post\" action=\"reservations.pl\" enctype=\"application/x-www-form-urlencoded\" onsubmit=\" return validateForm(this);\" name=\"DestForm\"> \n" +
                "    <input type=\"hidden\" name=\"advanceDiscount\" value=\"0\">\n" +
                "    <table border=\"0\" cellspacing=\"5\">\n" +
                "     <tbody>\n" +
                "      <tr>\n" +
                "       <td align=\"left\">Departure City :</td> \n" +
                "       <td><select name=\"depart\"> <option selected value=\"Denver\">Denver</option> <option value=\"Frankfurt\">Frankfurt</option> <option value=\"London\">London</option> <option value=\"Los Angeles\">Los Angeles</option> <option value=\"Paris\">Paris</option> <option value=\"Portland\">Portland</option> <option value=\"San Francisco\">San Francisco</option> <option value=\"Seattle\">Seattle</option> <option value=\"Sydney\">Sydney</option> <option value=\"Zurich\">Zurich</option> </select></td> \n" +
                "       <td align=\"left\">Departure Date :</td> \n" +
                "       <td><input type=\"text\" name=\"departDate\" value=\"01/29/2019\" size=\"10\" maxlength=\"10\"> \n" +
                "        <!-- Departure Date Applet --> \n" +
                "        <applet code=\"FormDateUpdate.class\" mayscript width=\"26\" height=\"28\" border=\"0\"> \n" +
                "         <param NAME=\"CalenderTitle\" VALUE=\"Select Departure Date\"> \n" +
                "         <param NAME=\"HtmlFormIndex\" VALUE=\"0\"> \n" +
                "         <param NAME=\"HtmlEditIndex\" VALUE=\"2\"> \n" +
                "         <param NAME=\"AutoClose\" VALUE=\"1\"> \n" +
                "         <param NAME=\"Label\" VALUE=\"...\"> \n" +
                "        </applet> </td>\n" +
                "      </tr> \n" +
                "      <tr>\n" +
                "       <td align=\"left\">Arrival City :</td> \n" +
                "       <td><select name=\"arrive\"> <option selected value=\"Denver\">Denver</option> <option value=\"Frankfurt\">Frankfurt</option> <option value=\"London\">London</option> <option value=\"Los Angeles\">Los Angeles</option> <option value=\"Paris\">Paris</option> <option value=\"Portland\">Portland</option> <option value=\"San Francisco\">San Francisco</option> <option value=\"Seattle\">Seattle</option> <option value=\"Sydney\">Sydney</option> <option value=\"Zurich\">Zurich</option> </select></td> \n" +
                "       <td align=\"left\">Return Date :</td> \n" +
                "       <td><input type=\"text\" name=\"returnDate\" value=\"01/30/2019\" size=\"10\" maxlength=\"10\"> \n" +
                "        <!-- Return Date Applet --> \n" +
                "        <applet code=\"FormDateUpdate.class\" mayscript width=\"26\" height=\"28\" border=\"0\"> \n" +
                "         <param NAME=\"CalenderTitle\" VALUE=\"Select Return Date\"> \n" +
                "         <param NAME=\"HtmlFormIndex\" VALUE=\"0\"> \n" +
                "         <param NAME=\"HtmlEditIndex\" VALUE=\"4\"> \n" +
                "         <param NAME=\"AutoClose\" VALUE=\"1\"> \n" +
                "         <param NAME=\"Label\" VALUE=\"...\"> \n" +
                "        </applet> </td>\n" +
                "      </tr> \n" +
                "      <tr>\n" +
                "       <td align=\"left\">No. of Passengers : </td> \n" +
                "       <td><input type=\"text\" name=\"numPassengers\" value=\"1\" size=\"3\" maxlength=\"8\"></td> \n" +
                "       <td colspan=\"2\"><label><input type=\"checkbox\" name=\"roundtrip\" value=\"on\">Roundtrip ticket</label></td>\n" +
                "      </tr> \n" +
                "      <tr>\n" +
                "       <td>Seating Preference</td> \n" +
                "       <td></td> \n" +
                "       <td>Type of Seat</td>\n" +
                "      </tr> \n" +
                "      <tr>\n" +
                "       <td><label><input type=\"radio\" name=\"seatPref\" value=\"Aisle\">Aisle</label><br> <label><input type=\"radio\" name=\"seatPref\" value=\"Window\">Window</label><br> <label><input type=\"radio\" name=\"seatPref\" value=\"None\" checked>None</label><br></td> \n" +
                "       <td></td> \n" +
                "       <td><label><input type=\"radio\" name=\"seatType\" value=\"First\">First</label><br> <label><input type=\"radio\" name=\"seatType\" value=\"Business\">Business</label><br> <label><input type=\"radio\" name=\"seatType\" value=\"Coach\" checked>Coach</label><br></td>\n" +
                "      </tr> \n" +
                "      <tr>\n" +
                "       <td height=\"10\"></td>\n" +
                "      </tr> \n" +
                "      <tr>\n" +
                "       <td align=\"center\" colspan=\"4\"><input type=\"image\" name=\"findFlights\" src=\"/WebTours/images/button_next.gif\" border=\"0\"></td>\n" +
                "      </tr>\n" +
                "     </tbody>\n" +
                "    </table>\n" +
                "    <div>\n" +
                "     <input type=\"hidden\" name=\".cgifields\" value=\"roundtrip\">\n" +
                "     <input type=\"hidden\" name=\".cgifields\" value=\"seatType\">\n" +
                "     <input type=\"hidden\" name=\".cgifields\" value=\"seatPref\">\n" +
                "    </div>\n" +
                "   </form> \n" +
                "  </blockquote>   \n" +
                " </body>\n" +
                "</html>";

        String pattern = "name=\"outboundFlight\"\\s+value=\"([^\"]*)\"";
       // String pattern ="option selected value="Denver">";
        HtmlJiexi aa = new HtmlJiexi();
        String a = aa.jiexi(html,pattern);

        System.out.println(a);
    }

}
