package com.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        String  test="https://vanitacpi";
        OutputStream output = new FileOutputStream("C:\\Users\\i349024\\demo\\config.properties");
        Properties prop = new Properties();

            // set the properties value
        prop.setProperty("cpi.url", test);
        prop.store(output, null);

            System.out.println(prop);
    }
}
