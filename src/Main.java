import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    var lizzy = new Teacher(1, "Lizzy", 500);
    var melissa = new Teacher(2, "Melissa", 700);
    var vanderhorn = new Teacher(3, "Vanderhorn", 600);

    var teachers = new ArrayList<Teacher>();
    teachers.add(lizzy);
    teachers.add(melissa);
    teachers.add(vanderhorn);

    var tamasha = new Student(1, "Tamasha", 4);
    var rakshith = new Student(2, "Rakshith Vasudev", 12);
    var rabbi = new Student(3, "Rabbi", 5);

    var students = new ArrayList<Student>();
    students.add(tamasha);
    students.add(rakshith);
    students.add(rabbi);

    var ghs = new School(teachers, students);
    var megan = new Teacher(6, "Megan", 900);
    ghs.addTeacher(megan);
    
    tamasha.payFees(5000);
    rakshith.payFees(6000);
    System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

    System.out.println("Making GHS pay salaries...");
    lizzy.receiveSalary(lizzy.getSalary());
    System.out.println("GHS has paid salary to %s and now has $%d"
      .formatted(lizzy.getName(), ghs.getTotalMoneyEarned()));
    vanderhorn.receiveSalary(vanderhorn.getSalary());
    System.out.println("GHS has paid salary to %s and now has $%d"
      .formatted(vanderhorn.getName(), ghs.getTotalMoneyEarned()));
    melissa.receiveSalary(melissa.getSalary());

    System.out.println(rakshith);
    System.out.println(melissa);
  }
}
