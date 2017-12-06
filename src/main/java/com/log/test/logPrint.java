package com.log.test;

import org.apache.log4j.Logger;

/**
 * @author yuanxin.zhang@siemens.com
 * Created by zhangyuanxin on 2017/12/6.
 */
public class logPrint {

    private static final Logger log = Logger.getLogger(logPrint.class);

    public static void main(String[] args) throws InterruptedException {
        int i = 10000;
        while (true) {
            log.info("*** *** *** *** print *** *** *** *** " + i + "");
            if (i % 3 == 0) {
                log.error("*** *** *** *** print *** *** *** *** " + i + "");
            }
            i++;
            Thread.sleep(1000);
        }
    }
}
