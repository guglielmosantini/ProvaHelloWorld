package it.prometeia;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
<<<<<<< HEAD
    //private static Scanner sca;

	public static void main( String[] args )
    {
        Scanner sca = new Scanner(System.in);
=======
    private static Scanner sca;

	public static void main( String[] args )
    {
        sca = new Scanner(System.in);
>>>>>>> b45f238c5358ef5e06815d0ef476f2ba889a8139
        System.out.println( "Hello World!" );
        String string= sca.next();
        if (!StringUtils.isEmpty(string)) {
			System.out.println("Hello "+string);
		}else {
			System.out.println("NADA");
		}
        
        
        
        
        
    }
}
