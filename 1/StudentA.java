class StudentA {
  //メンバ変数
  String name;
  int engscore;
  int mathscore;
  
  //メソッド
  void display(){
    System.out.println(name + "さん");
    System.out.println("英語" + engscore + "点・数学" + mathscore);
  }

  void setScore(int eng, int math){
    engscore = eng;
    mathscore = math;
  }

  double getAvg(){
    double avg = getAvg(engscore + mathscore) / 2.0;
    return avg;
  }
}
