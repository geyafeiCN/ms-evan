package com.jyusun.evan.test;

import org.apache.commons.lang3.math.NumberUtils;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * 描述：
 *
 * @author JyuSun at 2018/12/12 17:49
 * @version 1.0.0
 */
public class Test {



    public static void main(String[] args) {

        String as= "aaa";
      List<String> a= Arrays.asList(as);
        for (String s: a
             ) {
            System.out.printf(s);
        }
       // 10000*{(1+5%)*[(1+5%)^20-1]}/5%;

    }
}
