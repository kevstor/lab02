package ca.bcit.a00843681.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.displaytag.decorator.TableDecorator;

import ca.bcit.a00843681.entity.Employee;

public class DateDecorator extends TableDecorator{

	public String getDob(){
		DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		try{
			return formatter.format(((Employee) getCurrentRowObject()).getDob());
		} catch(NullPointerException e){
			return "";
		}
		
	}
}
