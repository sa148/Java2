class Cast{
  public static void main(String[] args){
    int price = Integer.parseInt(args[0]);
    double rate = 0.08;       //消費税率８％
    int amount;

    amount = (int) (price * (1 + rate));
    System.out.println("税込み金額: " + amount + "円");
  }
}
