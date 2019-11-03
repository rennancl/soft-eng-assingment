class Dollar  extends Money{
        int amount;

        Dollar(int amount, String currency)  {
            super(amount, currency);
        }    
        Money times(int multiplier)  {
            return Money.dollar(amount * multiplier);
        }        
}