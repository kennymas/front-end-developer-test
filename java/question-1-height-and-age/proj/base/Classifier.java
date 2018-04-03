package com.proj.base;

public class Classifier {

    public String getClassification(int age, double height){
        return getAgeDescription(age)+" & "+getHeightDescription(height);
    }

    public String getAgeDescription(int age){
        String ageDescription = "Child";

        if ((age > 12)&&(age < 20))
            ageDescription = "Teenager";

        if ((age >= 20)&&(age < 60))
            ageDescription = "Adult";

        if (age >= 60)
            ageDescription = "Senior";

        return ageDescription;
    }

    public String getHeightDescription(double height){

        String heightDescription = "Short";

        if ((height > 1.4)&&(height<=1.8))
            heightDescription = "Average";
        if (height > 1.8)
            heightDescription = "Tall";

        return heightDescription;
    }
}
