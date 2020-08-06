package com.example.designpattern.abstractfactory;

import com.example.designpattern.abstractfactory.factory.Factory;
import com.example.designpattern.abstractfactory.factory.Link;
import com.example.designpattern.abstractfactory.factory.Page;
import com.example.designpattern.abstractfactory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);
        Link asahi = factory.createLink("asahi", "http://www.asahi.com/");
        Link yomiuri = factory.createLink("yomiuri", "http://www.yomiuri.co.jp/");

        Link us_yahoo = factory.createLink("Yahoo", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray trayNews = factory.createTray("news");
        trayNews.add(asahi);
        trayNews.add(yomiuri);

        Tray trayYahoo = factory.createTray("yahoo");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("search");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "takigawa daichi");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}
