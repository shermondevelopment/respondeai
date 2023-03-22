import java.util.ArrayList;

public class Subject {
  private String title;
  private ArrayList<Questions> questions = new ArrayList<Questions>();

  public Subject(String title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return this.title;
  }

  public void addQuestion(Questions question) {
    this.questions.add(question);
  }

  public ArrayList<Questions> getQuestions() {
    return this.questions;
  }

}
