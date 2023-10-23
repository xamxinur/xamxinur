package com.unitedcoder.datatype;

public class StringDemo2 {
    public static void main(String[] args) {
        //  String index and length
        String city="Amsterdam";
        String country="Nederland";
        String course="Java Selenium Test Automation";
        String space=" ";
        int l=city.length();
        System.out.println(l);
        int i1=country.indexOf("x");
        System.out.println(i1);
        System.out.println("Index of first e: "+country.indexOf("e"));
        System.out.println("Index of last e: "+country.lastIndexOf("e"));
        System.out.println(course.indexOf("Test"));
        System.out.println(space.length());

        // upper case lower case --- Java case-sensitive
        System.out.println(city.toUpperCase());
        System.out.println(country.toLowerCase());

        // replace
        course=course.replace("Java","Python");
        System.out.println(course);
        String data="03-09-2022"; // 03/09/2022
        data=data.replace("-","/");
        System.out.println(data);
        //15,000    25900,876
        String value="2345, 9876";// 2345.9876
        value=value.replace(",",".").replace(" ","");
        System.out.println(value);

        String result="About 18.760.000.000 results";
        //result=result.replace("About","").replace("results","").trim();
        System.out.println(result);
        // Sub String
        System.out.println(result.substring(5,10));// include begin index, exclude end index
        int beginIndex=result.indexOf("1");
        int endIndex=result.lastIndexOf("0");
        System.out.println("Begin index: "+beginIndex);
        System.out.println("End index: "+endIndex);
        System.out.println(result.substring(beginIndex,endIndex+1));
        //System.out.println(result.substring(6,20));

        // compare two String
        String s1="Java";
        String s2="java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //String concatenation
        int i3=100;
        int i2=200;
        System.out.println(i3+i2); // 300
        String v1="100";
        String v2="200";
        String v3="Hello";
        String v4="World";
        System.out.println(v3+v4); // HelloWorld
        System.out.println(v3+" "+v4); // Hello World
        System.out.println(v1+v2); // 100200




    }
}
