public class Student {
  private int id;
  private String name;
  private int grade;
  private int feesPaid;
  private int feesTotal;

  public Student(int id, String name, int grade) {
    this.id = id;
    this.name = name;
    this.grade = grade;
    feesPaid = 0;
    feesTotal = 30000;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public int getFeesPaid() {
    return feesPaid;
  }

  public void payFees(int fees) {
    feesPaid += fees;
    School.updateTotalMoneyEarned(fees);
  }

  public int getFeesTotal() {
    return feesTotal;
  }

  public int getRemainingFees() {
    return feesTotal - feesPaid;
  }

  @Override
  public String toString() {
    return "Student's name: %s, Total fees paid so far: $%d"
      .formatted(name, feesPaid);
  }
}
