class Student4 {
  String name;
  static int couter;
  
  Student4(String n){
    name = n;
    couter++;
    System.out.println(nmae + "さんをインスタンス化しました");
  }
  static void display(){
    System.out.println(couter + "人です");
  }
}
