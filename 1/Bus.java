public class Bus extends Vehicle{
  public Bus(int crewNum){
    this.crewNum = crewNum;
  }

  public void showcrewNum(){
    System.out.println("バスの乗客:" + crewNum + "名");
  }
}
