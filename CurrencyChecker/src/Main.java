import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main {
    public static void main(String[] args) {
        // names tables column
        String[] columnNames = {
                "Валюта",
                "Номинал"
        };

        //TODO: Create windows
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Currency Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
//        frame.setLayout(null);

        //TODO: parsing currency
        String[][] dataTable = null;
        try {
            Document doc = Jsoup.connect("https://www.alta.ru/currency/").get();

            Elements currencies = doc.select(".js_sortable > tbody:nth-child(2) > tr");
            dataTable = new String[currencies.size()][2];
            var i = 0;
            for (var currency : currencies) {

                Elements currencyName = currency.select("td.t-center > span");
                if (!currencyName.isEmpty()) {
                    String name = currencyName.getLast().text();

                    dataTable[i][0] = name;

                    // get currency value
                    Elements currencyValue = currency.select("td.t-right > span");
                    if (!currencyValue.isEmpty()) {
                        dataTable[i][1] = currencyValue.text();
//                        double value = Double.parseDouble(currencyValue.getFirst().text());

//                        System.out.println(value + " руб.");
                        i++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }


        //TODO: add tables with currency

        JTable table = new JTable(dataTable, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

//        frame.add(table);
        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450,200));

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}