import java.awt.geom.Arc2D.Double;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class LaptopBuilder{
  private static DecimalFormat df2 = new DecimalFormat("#.##");

  static int price(String selection) {
    if(selection.equals("1920 x 1080")){
        return 300;
    }
    if(selection.equals("2560 x 1440")){
        return 600;
    }
    if(selection.equals("3280 x 1680")){
        return 900;
    }

    if(selection.equals("nVdia")){
        return 600;
    }
    if(selection.equals("AMDRadeon")){
        return 550;
    }
    if(selection.equals("Intel")){
        return 500;
    }

    if(selection.equals("i3")){
        return 100;
    }
    if(selection.equals("i5")){
        return 300;
    }
    if(selection.equals("i7")){
        return 500;
    }

    if(selection.equals("128GB")){
        return 100;
    }
    if(selection.equals("256GB")){
        return 200;
    }
    if(selection.equals("1TB")){
        return 300;
    }
    return 0;
}

// static double discount(String promoCode){
//     Double discount = 0.00;
//     if(promoCode.equals("ILOVEDISCOUNT5")){
//         discount = 0.05; 
//         return discount;
//     }
//     if(promoCode.equals("ILOVEDISCOUNT10")){
//         discount = 0.10; 
//         return discount;
//     }
//     return 0;
// }
    public static void main(String[] args) {
        String[] resolution = {"1920 x 1080","2560 x 1440","3280 x 1680"};
        
        String[] videoCard = {"nVdia","AMDRadeon","Intel"};
        Scanner userInput = new Scanner(System.in);

        //String[] promoCode = {"ILOVEDISCOUNT5","ILOVEDISCOUNT10"};


         String[] processor = {"i3","i5","i7"};

         String[] hardDisk = {"128GB","256GB","1TB"};
        // Integer[] hardDiskPrice = {100, 200, 300};

        System.out.println("Choose your Resolution");
        for (int i = 0; i < resolution.length; i++) {
            
            System.out.println(i + ". " + resolution[i] + " Price: RM" + price(resolution[i]));
        } 

        Integer selectedResolutionIndex = Integer.parseInt(userInput.nextLine());
    
        System.out.println("Choose your video card");
        for (int i = 0; i < videoCard.length; i++) {
            System.out.println(i + ". " + videoCard[i] + " Price: RM" + price(videoCard[i]));
        
        } 

        Integer selectedVideoCardIndex = Integer.parseInt(userInput.nextLine());

        System.out.println("Choose your processor");
        for (int i = 0; i < processor.length; i++) {
            System.out.println(i + ". " + processor[i] + " Price: RM" + price(processor[i]));
        
        } 

        Integer selectedProcessorIndex = Integer.parseInt(userInput.nextLine());

        System.out.println("Choose your hard disk");
        for (int i = 0; i < hardDisk.length; i++) {
            
            System.out.println(i + ". " + hardDisk[i] + " Price: RM" + price(hardDisk[i]));
        } 

        Integer selectedHardDiskIndex = Integer.parseInt(userInput.nextLine());

        System.out.println("You Have Chosen the following options: ");
        System.out.println(resolution[selectedResolutionIndex]);
        System.out.println(videoCard[selectedVideoCardIndex]);
        System.out.println(processor[selectedProcessorIndex]);
        System.out.println(hardDisk[selectedHardDiskIndex]);

        //choose resolution
        //choose video card
        //choose processor
        //choose hard disk
        //choosen item
        //show the total price  
        Integer totalPrice = 0;
        double discount = 0.00;
       

        Integer resolutionPrice = 0;
        Integer videoCardPrice = 0;
        Integer processorPrice = 0;
        Integer hardDiskPrice = 0;

        resolutionPrice = price(resolution[selectedResolutionIndex]);
        videoCardPrice = price(videoCard[selectedVideoCardIndex]);
        processorPrice = price(processor[selectedProcessorIndex]);
        hardDiskPrice = price(hardDisk[selectedHardDiskIndex]);
       
        totalPrice = resolutionPrice + videoCardPrice + processorPrice + hardDiskPrice;

        System.out.println("Total: RM" + totalPrice);

        //asking for promo code
        System.out.println("Do you have a promo code? Y/N ?");
        String codeInput = userInput.nextLine();

        //discount for promo code
        if(codeInput.equals("Y")){

            System.out.println("Enter your promo code for discount: ");
            String discountInput = userInput.nextLine();

                if(discountInput.equals("ILOVEDISCOUNT5")){
                    discount = 0.05;
                    System.out.println("Valid promocode. This promo code will discount 5%.");
                }
                if(discountInput.equals("ILOVEDISCOUNT10")){
                    discount = 0.10; 
                    System.out.println("Valid promocode. This promo code will discount 10%.");
                }else{
                    discount = 0.00; 
                    System.out.println("Invalid promo code, not entitled for discount.");

                }
        }

        if(codeInput.equals("N")){
                    System.out.println("That's sad, no discount.");
            
        }
        
        double sum = 0.00;
        sum = totalPrice - (totalPrice * discount);
        System.out.println("TOTAL: RM" + sum);
    }
}