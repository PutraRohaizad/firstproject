package com.firstproject;

public class Exercise {

    int principal;
    float interestRate;
    byte period;

        Exercise(int principal, float interestRate, byte period){
            this.principal = principal;
            this.interestRate = interestRate;
            this.period = period;
        }

    double calMortgage(){
        float convertInterest = (this.interestRate / 100) / 12;
        int convertMonthPeriod = this.period * 12;
        double mortgage = this.principal *
                (convertInterest * Math.pow(1 + convertInterest, convertMonthPeriod) /
                        (Math.pow(1+convertInterest, convertMonthPeriod)-1));
        return mortgage;
    }
}
