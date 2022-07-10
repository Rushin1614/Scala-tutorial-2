import scala.io.StdIn.readInt

object Question5b extends App {

  def attendees(Price:Int):Int = 120+(15-Price)/5*20;

  def revenue(Price:Int):Int = Price*attendees(Price);

  def cost(Price:Int):Int = 3*attendees(Price) + 500;

  def profit(Price:Int):Int = revenue(Price) - cost(Price);

  var bestPrice:Int = 0;

  println("Enter Maximum Ticket Price : ");
  var maxPrice = readInt();

  var profit:Int = 0;

  for(Price <- 5 to maxPrice;if Price%5 == 0){

    profit = if(profit < profit(Price)) {bestPrice = Price;profit(Price)} else profit(Price);
    printf("\nTicket Price = Rs. %d   Profit = %d", Price,profit);

  }

  printf("\n\nBest Ticket Price = Rs.%d    Profit = Rs. %d",bestPrice,profit(bestPrice));

}
