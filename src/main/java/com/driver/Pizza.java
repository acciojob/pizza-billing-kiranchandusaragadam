package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        isCheeseAdded = false;
        isToppingsAdded = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            isCheeseAdded = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            if(isVeg){
                this.price += 70;
            }
            else{
                this.price += 120;
            }
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            isPaperBagAdded = true;
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            bill = "Base Price Of The Pizza: 300 \n";
        }
        else{
            bill = "Base Price Of The Pizza: 400 \n";
        }

        if(isCheeseAdded){
            bill += "Extra Cheese Added: 80 \n";
        }

        if(isToppingsAdded){
            if(isVeg){
                bill += "Extra Toppings Added: 70 \n";
            }
            else{
                bill += "Extra Toppings Added: 120 \n";
            }
        }

        if(isPaperBagAdded){
            bill += "Paperbag Added: 20 \n";
        }

        bill += "Total Price: " + this.price;
        return this.bill;
    }
}
