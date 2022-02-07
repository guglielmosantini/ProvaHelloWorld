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
=======
    //private static Scanner sca;

	
>>>>>>> feature/myfeat
    private static Scanner sca;

	public static void main( String[] args )
    {
<<<<<<< HEAD
=======
		
>>>>>>> feature/myfeat
        sca = new Scanner(System.in);
        System.out.println( "Hello World!" );
        String string= sca.next();
        if (!StringUtils.isEmpty(string)) {
			System.out.println("Hello "+string);
		}else {
			System.out.println("NADA");
		}
        
        
        
        
        
    }
}
