package com.log.test;

/**
 * @author yuanxin.zhang@siemens.com
 * Created by zhangyuanxin on 2017/12/6.
 */
public class LogPrint {

    public static void main(String[] args) throws InterruptedException {
        PrintService printService = new PrintService();
        printService.print();
    }
}
