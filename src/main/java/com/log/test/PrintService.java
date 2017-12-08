package com.log.test;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

/**
 * yuanxin.zhang@siemens.com
 * Created by zhangyuanxin on 2017/12/8.
 */
public class PrintService {

    private final Logger log = Logger.getLogger(this.getClass());
    public void print() throws InterruptedException {
        NDC.push("four");
        int i = 10000;
        while (true) {
            log.info("*** *** *** *** print *** *** *** *** " + i + "");
            log.info("你好");
            if (i % 3 == 0) {
                log.error("*** *** *** *** print *** *** *** *** " + i + "");
            }
            i++;
            Thread.sleep(1000);
        }
    }
}
