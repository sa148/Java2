public class StuSample2 {
  public static void main(String[] args) {

    Student2 stu1 = new Student2();
    Student2 stu2 = new Student2();

    stu1.setData("菅原");
    stu1.setScore(98, 99);
    stu1.daiplay();

    stu2.setData("村山", 80, 75);
    stu2.daiplay();
  }
}
