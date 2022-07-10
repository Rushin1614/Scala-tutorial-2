import scala.io.StdIn.readInt

object Question04a extends App {

  def wage(hours:Int):Int=hours*250;

  def ot(hours:Int):Int=hours*85;

  def income(n_hours:Int,ot_hours:Int):Int=wage(n_hours)+ot(ot_hours);

  def tax(income:Int):Double=income*.12;

  
  def takeHome(n_hours:Int,ot_hours:Int):Double=income(n_hours,ot_hours) - tax(income(n_hours,ot_hours));

  println("Enter Normal Working Hours : ");
  var n_hours = readInt();

  println("Enter OT Working Hours : ");
  var ot_hours = readInt();

  printf("Take Home Salary is = Rs %.2f", takeHome(n_hours,ot_hours));

}
