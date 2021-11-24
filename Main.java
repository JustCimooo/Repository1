import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

                int daysAway = Integer.parseInt(scan.nextLine());
                int givenFood = Integer.parseInt(scan.nextLine());
                double firstDeerFoodForADay = Double.parseDouble(scan.nextLine());
                double secondDeerFoodForADay = Double.parseDouble(scan.nextLine());
                double thirdDeerFoodForADay = Double.parseDouble(scan.nextLine());

                double food1 = daysAway * firstDeerFoodForADay;
                double food2 = daysAway * secondDeerFoodForADay;
                double food3 = daysAway * thirdDeerFoodForADay;

                double totalFood = food1 + food2 + food3;

                if(totalFood <= givenFood){
                    double foodLeft = givenFood - totalFood;
                    System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft));
                }
                else if(totalFood > givenFood){
                    double foodNeeded = totalFood - givenFood;
                    System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodNeeded));
                }
            }
        }