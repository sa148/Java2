class MultiArray{
  public static void main(String[] args){
    int[][] allscore = new int[2][3];
    allscore[0][0] = 80;
    allscore[0][1] = 90;
    allscore[0][2] = 100;
    allscore[1][0] = 75;
    allscore[1][1] = 80;
    allscore[1][2] = 80;

    // 多次元配列の初期化
    // int[][] allscore = { {10, 20, 30,} {40, 50, 60} };
    
    System.out.println(allscore[0][0] + "点");
    System.out.println(allscore[0][1] + "点");
    System.out.println(allscore[0][2] + "点");
    System.out.println(allscore[1][0] + "点");
    System.out.println(allscore[1][1] + "点");
    System.out.println(allscore[1][2] + "点");

    System.out.println("allscore.length: " + allscore.length);
    System.out.println("allscore[0].length: " + allscore[0].length);
  }
}
