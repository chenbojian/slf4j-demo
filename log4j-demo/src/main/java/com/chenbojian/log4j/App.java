package com.chenbojian.log4j;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger("slf4j logger");
        logger.error("this is error logged by slf4j using log4j");

        org.apache.logging.log4j.Logger log4jLogger = LogManager.getLogger("log4j logger");
        log4jLogger.error("this is error logged by log4j");

        System.out.println( "Hello World!" );
    }
}
