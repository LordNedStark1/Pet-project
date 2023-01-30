package Game;

public class ProductPurchase {
    Human human = new Human();
//    public int[] cartIndex;
    private int localDogFood;
    private final int localDogFoodSingleQuantityPrice = 5;
    private final int foreignDogFoodSinglePrice =8;
    private int foreignDogFood;

    public int localDogFoodPurchase(int quantity) {
//       int localDogFoodPrice = localDogFoodSingleQuantityPrice * quantity;
//       if(human.getToken()>= localDogFoodPrice){
//           int next = human.getToken() -localDogFoodPrice;
          return localDogFood =quantity;
//       }else
//          return 0;
    }

    public int foreignDogFoodPurchase(int quantity) {
//        int foreignDogFoodPrice = foreignDogFoodSinglePrice * quantity;
//        if (human.getToken()>= foreignDogFoodPrice){
//            int next = human.getToken() - foreignDogFoodPrice;
        return foreignDogFood = quantity;
//    }else
//        return 09;
    }
}
