package crwaling;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {
   
   public static void main(String[] args) {
      
	   crawlingWeather();
      
   }
   
      
      public static void crawlingWeather() {
         
            Document doc;
            
         try {
            //connect : 매개변수로 넣은 주소로 요청을 보내 넘어오 ㄴ데이터를
            // Document 객체로 만들어 반환
            doc = Jsoup.connect("https://www.weather.go.kr/w/wnuri-fct/weather/today-vshortmid.do?code=1159068000&unit=km%2Fh").get();
//            System.out.println(doc);
            
            //select : css 선택자에 해당하는 HTML 태그를
            //Element의 리스트 (Elements)로 반환해주는 메소드
            Elements teamScores = doc.select("body > div.cont-box03 > div.weather-list.slick-wrapper.col05 > div.weather-item.now > div");
            System.out.println(teamScores);
            String[] columArr = {"", "rank", "teamName", "match", "win", "lose", "tie", "rate"};
            
            for(Element scores : teamScores) {
               
               Map<String,Object> scoreMap = new LinkedHashMap<>();
               //getAllElements : Element의 자식, 후손 태그들을
               //Elements(list)에 담아 반환
               //0번 인덱스에는 자기 자신을 담아서 반환
               Elements scoreList = scores.getAllElements();
               
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
}
}