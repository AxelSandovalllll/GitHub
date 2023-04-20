package edu.guilford;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    //instantiate 3 dice objects
    Dice d1 = new Dice();
    Dice d2 = new Dice(20);
    Dice d3 = new Dice(100);
    public Dice getD1() {
        return d1;
    }
    public void setD1(Dice d1) {
        this.d1 = d1;
    }
    public Dice getD2() {
        return d2;
    }
    public void setD2(Dice d2) {
        this.d2 = d2;
    }
    public Dice getD3() {
        return d3;
    }
    public void setD3(Dice d3) {
        this.d3 = d3;
    }

    //roll the dice
    d1.roll();
    d2.roll();
    d3.roll();

    //print out value of the dice
    System.out.println("d1: " + d1.getValue());
    System.out.println("d2: " + d2.getValue());
    System.out.println("d3: " + d3.getValue());
}
