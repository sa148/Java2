public class Student extends Person{
  
  private int stuNo;

  public void stuNo(int s){
    stuNo = s;
  }

  public void displayStuNo(){
    System.out.println("学籍番号" + stuNo);
  }
}
