package com.gy.java;

import java.awt.*;
/**
 * 二分查找
 */
public class erfenchazhao {
    //定义一个数组
    public static void main(String[] args) {


        int[] arr = new int[]{4,5,12, 25, 45, 98,233, 1574};

        int cha = 45;
        int tou = 0;
        int wei = arr.length - 1;

        boolean isFlag = true;
        while (tou <= wei) {
            int m = (tou + wei) / 2;
            if (arr[m] == cha){
                System.out.println("该字符位置在 ：" + m);
                isFlag = false;
                break;
            }
            else if (arr[m] > cha) {
                wei = m - 1;
            } else {
                tou = m + 1;
            }
        }
        if(isFlag == true){
         System.out.println("没找到。");
        }
    }
}

