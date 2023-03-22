public class Questions {
  private String statement;
  private String response;

  public Questions(String statement, String response) {
    this.statement = statement;
    this.response = response;
  }

  public void setStatement(String statement) {
    this.statement = statement;
  }

  public String getStatement() {
    return this.statement;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public String getResponse() {
    return this.response;
  }
}
