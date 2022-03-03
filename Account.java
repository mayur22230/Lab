package oops;

import java.util.Date;
public interface Account {
	public int accNo =1223923929;
	public double balance =50000;
	String date = "1/01/2022";
	abstract void MakeDeposite();
	abstract void MakeWithDraw();
}
