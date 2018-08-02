package com.ftx;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /* //创建日志记录器
        Logger logger = Logger.getLogger(App.class);
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");*/

       // org.slf4j.Logger logger = LoggerFactory.getLogger(App.class);
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.error("error111");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");


    }
}
