public class Bus extends Vehicle implements Stopable{
  public Bus(int crewNum){
    this.crewNum = crewNum;
  }

  public void showcrewNum(){
    System.out.println("バスの乗客:" + crewNum + "名");
  }

  public void stop(){
    System.out.println("次止まります");
  }
}
