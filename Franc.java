class Franc extends Money {   
    private int amount;					
	
    Franc(int amount, String currency) {
        super(amount, currency);
     }
       
     Money times(int multiplier)  {
        return Money.franc(amount * multiplier);
     }
 }