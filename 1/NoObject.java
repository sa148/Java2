class NoObject{
 public static void main(String[] args){
  //データ代入
  int[] score = {80, 100, 75};
  String[] name = {"菅原", "村山", "寺島"};

  //データ表示
  for(int i = 0; i < score.length; i++){
    System.out.println(name[i] + "さん" + score[i] + "点");
  }
 } 
}
