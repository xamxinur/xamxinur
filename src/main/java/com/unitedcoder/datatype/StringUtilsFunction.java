package com.unitedcoder.datatype;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsFunction {
    public static void main(String[] args) {
        String s1="Learn java is fun";
        String s2="Selenium,Test,Automation";
        String name="alim";
        String s="lkdsjlhjfkhdkjgfsdyrgjsbfkjhdskjh";
        String s3="100 ";


        System.out.println(StringUtils.reverse(s1));
        System.out.println(StringUtils.reverseDelimited(s1,' '));
        System.out.println(StringUtils.reverseDelimited(s2,','));
        System.out.println(StringUtils.capitalize(name));
        System.out.println(StringUtils.isEmpty(name));
        System.out.println(StringUtils.countMatches(s,"j"));
        System.out.println(StringUtils.isNumeric(s));
        System.out.println(StringUtils.isNumeric(s3));







    }
}
