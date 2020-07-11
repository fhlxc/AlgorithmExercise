package com.fhlxc.week21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* @author Xingchao Long
* @date 2020年7月8日 下午9:17:46
* @classname WaterBottle
* @description
* 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”
* 答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候
* 剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
*/

public class WaterBottle {

    public int result(int num) {
        int result = 0;
        while (num >= 2) {
            if (num == 2) {
                num = num + 1;
            }
            int tmp = 0;
            tmp = num / 3;
            num = num - tmp * 3 + tmp;
            result += tmp;
        }
        return result;
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println(new WaterBottle().result(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }

}