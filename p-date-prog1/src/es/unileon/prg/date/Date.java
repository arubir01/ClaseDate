package es.unileon.prg.date;
/*
*Clase Date para la practica7
*author
*
*/
public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException
		{
		this.year = year;
		this.setMonth(month);
		this.setDay(day);
		}

private String getMonthsLeftOfYear(int month)
{
	StringBuilder string = new StringBuilder();
	string.append("\nMeses restantes del año: ");
	string.append(getNameOfMonth(this.month));
	string.append("\n");
	
	for(int n = this.month + 1; n <= 12; n++)
	{
	string.append(getNameOfMonth(n));
	string.append(" ");
}
return string.toString();	
}

private String getDaysUntilMonth()
{
	StringBuilder string2 = new StringBuilder();
	string2.append("\nDias restantes del mes: ");
	string2.append("\n");
	
	for(int m = this.day + 1; m <= getDaysOfMonth(month); m++)
	{
	
	string2.append(m);
	string2.append("/");
	string2.append(month);
	string2.append("/");
	string2.append(year);
	string2.append(" ");
}
return string2.toString();
}


private String getMonthsWithSameDays()
{
	StringBuilder string3 = new StringBuilder();
	string3.append("\nMeses con los mismos dias: ");
	string3.append("\n");

	for(int m = 0; m <= 12; m++)
	{
	if(getDaysOfMonth(month) == getDaysOfMonth(m))
{
	string3.append(getNameOfMonth(m));
	string3.append(" ");
}
}
	return string3.toString();
}

private int getDaysUntilYear()
{

	int daysNumbers = this.day;
	for(int n = 0; n < this.month; n++)
{
	daysNumbers += getDaysOfMonth(this.month);
}	
	return daysNumbers;
}
private String getWeek(int getDaysOfMonth)
{
	String week = " ";
	switch(getDaysOfMonth)
{
	case 1: //next
	case 8: //next
	case 15: //next
	case 22: //next
	case 30: 
	week = "Martes";
	break;
	case 2: //next
	case 9: //next
	case 16: //next
	case 23: //next
	case 31:
	week = "Miercoles";
	break;
	case 3: //next
	case 10: //next
	case 17:  //next
	case 24: 
	week = "Jueves";
	break;
	case 4: //next
	case 11: //next
	case 18: //next
	case 25:
	week = "Viernes";
	break;
	case 5: //next
	case 12: //next
	case 19: //next
	case 26:
	week = "Sabado";
	break;
	case 6: //next
	case 13: //next
	case 20: //next
	case 27:
	week = "Domingo";
	break;
	case 7: //next
	case 14: //next
	case 21: //next
	case 28:
	week = "Lunes";
	break;
}
	return week;
}	
public boolean isSameDate(Date anotherDate)
{
	return ((isSameDay(anotherDate)) && (isSameMonth(anotherDate)) && (isSameYear(anotherDate)));
}

public boolean isSameDay(Date anotherDate)
{
	return (this.day == anotherDate.getDay());
}

public boolean isSameMonth(Date anotherDate)
{
	return (this.month == anotherDate.getMonth());
}

public boolean isSameYear(Date anotherDate)
{
	return (this.year == anotherDate.getYear());
}


public int getDaysOfMonth(int month)
	{
	int number = 0;
	switch (month) {
	case 1: //next
	case 3: //next
	case 5: //next
	case 7://next
	case 8: //next
	case 10: //next
	case 12: 
	number = 31;
	break;
	case 4: //next
	case 6: //next
	case 9: //next
	case 11: number = 30;
	break;
	case 2:
	number = 28;
	break;
	}
	return number;
	}

private String getNameOfMonth(int month)
	{
	String mes = "";
	switch (month) {
	case 1: mes = "Enero";
	break;
	case 3: mes = "Marzo";
	break;
	case 5: mes = "Mayo";
	break;
	case 7: mes = "Julio";
	break;
	case 8: mes = "Agosto";
	break;
	case 10: mes = "Octubre";
	break;
	case 12: mes = "Diciembre";
	break;
	case 4: mes = "Abril";
	break;
	case 6: mes = "Junio";
	break;
	case 9: mes = "Septiembre";
	break;
	case 11: mes = "Noviembre";
	break;
	case 2: mes = "Febrero";
	break;

	}
	return mes;
	}

private String getSeasonOfMonth(int month)
	{
	String estacion = "";
	switch (month) {
	case 12://next
	case 1: //next
	case 2: estacion = "Invierno";
	break;
	case 3: //next
	case 4: //next
	case 5: estacion = "Primavera";
	break;
	case 6: //next
	case 7: //next
	case 8: estacion = "Verano";
	break;
	case 9: //next 
	case 10: //next
	case 11: estacion = "Otoño";
	break;
	}
	return estacion;
	}

public int getDay()
{
	return this.day;
}

public int getMonth()
{
	return this.month;
}

public int getYear()
{
	return this.year;
}

public void setMonth(int month) throws DateException
	{
	if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y" + getMonth() + ".");
		} 
		else{
			this.month = month;
		}
}

public void setDay(int day) throws DateException
	{
	if (day < 1 || day > getDaysOfMonth(month)) {
			throw new DateException("Dia " + day + " no valido" +
					" Valores posibles entre 1 y" + getDaysOfMonth(month) + ".");
		} else {
			this.day = day;
		}
}
/*
*Boolean para is same tal
*return (this._month == month)
*/




/**
 *Clase setMonth, setea el atributo de clase_month
*@param month
*return void
*/
@Override
	public String toString() {
		return this.day + "/" + this.month + "|" + this.getNameOfMonth(month) + "/" + this.year + "\nEstación: " + this.getSeasonOfMonth(month) + this.getMonthsLeftOfYear(month) + this.getDaysUntilMonth() + this.getMonthsWithSameDays() + "\nDias hasta la fecha: " + getDaysUntilYear() + "\nDia de la semana: " + getWeek(day);
}
}
