public class taxi3 extends Vehicle{
  public taxi3(int crewNum){
    this.crewNum = crewNum;
  }

  public void showcrewNum(){
    System.out.println("タクシーの乗客:" + crewNum + "名");
  }
}
