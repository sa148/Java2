public class taxi3 extends Vehicle implements Stopable{
  public taxi3(int crewNum){
    this.crewNum = crewNum;
  }

  public void showcrewNum(){
    System.out.println("タクシーの乗客:" + crewNum + "名");
  }

  public void stop(){
    System.out.println("ここで降ります");
  }
}
