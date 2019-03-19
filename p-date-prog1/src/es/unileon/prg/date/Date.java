package es.unileon.prg.date;
/*
*Clase Date para la practica7
*author
*
*/
public class Date {

	private int _day;
	private int _month;
	private int _year;

	public Date(int day, int month, int year) throws DateException{
		this._year = year;
		this.setMonth(month);
		this.setDay(day);
		}
private int getDaysOfMonth(int month)
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
	default:
	number = -1;
	}
	return number;
	}
public void setMonth(int month) throws DateException
	{
	if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} 
		else{
			this._month = month;
		}
}
public void setDay(int day) throws DateException
	{
	if (day < 1 || day > getDaysOfMonth(_month)) {
			throw new DateException("Dia " + day + " no valido" +
					" Valores posibles entre 1 y" + getDaysOfMonth(_month) 						+ ".");
		} else {
			this._day = day;
		}
/*
*Boolean para is same tal
*return (this._month == month)
*/
}



/**
 *Clase setMonth, setea el atributo de clase_month
*@param month
*return void
*/
@Override
	public String toString() {
		return this._day + "/" + this._month + "/" + this._year;
}
}

