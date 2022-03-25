package org.jaroso.proyecmaven;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String mensaje = "Hola mundo";
        System.out.println( DigestUtils.sha256Hex(mensaje) );
    }
}
