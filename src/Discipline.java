import java.util.ArrayList;

class Discipline {

  private String title;
  private ArrayList<Subject> subject = new ArrayList<Subject>();

  public Discipline(String title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return this.title;
  }

  public void setSubject(Subject subject) {
    this.subject.add(subject);
  }

  public ArrayList<Subject> getSubject() {
    return this.subject;
  }

}