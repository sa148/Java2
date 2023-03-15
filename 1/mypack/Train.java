package mypack;

public class Train extends Vehicle{
  public Train(int crewNum){
    this.crewNum = crewNum;
  }

  public void showcrewNum(){
    System.out.println("電車の乗客:" + crewNum + "名");
  }
}
