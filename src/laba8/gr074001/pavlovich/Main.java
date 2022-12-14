package laba8.gr074001.pavlovich;

import laba8.gr074001.pavlovich.string_array.*;

public class Main {
    public static void main(String[] args) {
        StaticStringArray stringArray = new StaticStringArray(3);

        stringArray.add("ВИП");
        stringArray.add("казахи");
        stringArray.add("лошадью");
        stringArray.add("питаЮтся");
        stringArray.add("запиваются");
        stringArray.add("жесткий хавчик");

        stringArray.print();
    }
}