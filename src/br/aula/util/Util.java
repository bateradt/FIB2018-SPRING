package br.aula.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Util {
	
	public Date somaData(String data, int somaDias)
	{           
	        String dataVerificada = data; //converteDataBrasil(verificaMascaraData(data));
	      
	        int dia = Integer.parseInt(dataVerificada.substring(0, 2));
	        int mes = Integer.parseInt(dataVerificada.substring(3, 5));
	        int ano = Integer.parseInt(dataVerificada.substring(6, 10));
	         
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	         
	        Calendar calendar = new GregorianCalendar(ano, mes, dia);
	        Date dt = new Date();
	        try
	        {             
	            dt = sdf.parse(dataVerificada);
	             calendar.setTime(dt);
	           calendar.add(calendar.DATE, somaDias);                 
	         }
	         catch(ParseException e)
	         {
	            System.out.println(e.getMessage());
	         }
	               	         
	        //return sdf.format(calendar.getTime());
	        return calendar.getTime();
	}

}
