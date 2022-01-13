package com.sun.scrap.core.temp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TempService {

    public List<String> doSomething() throws Exception {

        List<String> result = new ArrayList<>();

        Document doc =  Jsoup.connect("https://finance.naver.com/item/sise_day.naver?code=263750").get();

        Elements select = doc.select(".num .p11");

        select.forEach(ele -> result.add(ele.text()));

        return result;
    }

}
