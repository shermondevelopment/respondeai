
public class App {
    public static void main(String[] args) throws Exception {

        /* Questão */
        Questions questionOne = new Questions("what is biochemistry",
                "Biochemistry is the science that lies between chemistry and biology.");

        Questions questionTwo = new Questions("what is cytoplasm",
                "Cytoplasm is the name given to the inner region of the cell");

        Questions questionThree = new Questions("Digestive system",
                "The digestive tract or digestive system is the system responsible for obtaining the nutrients needed for the different functions of the body from ingested food.");

        /* assunto */
        Subject biochemistry = new Subject("Bioquímica");
        Subject cytoplasm = new Subject("Citoplasma");
        Subject digestiveSystem = new Subject("Digestive system");

        biochemistry.addQuestion(questionOne);

        cytoplasm.addQuestion(questionTwo);

        digestiveSystem.addQuestion(questionThree);

        /* Disciplina */
        Discipline discipline = new Discipline("Biologia");
        discipline.setSubject(biochemistry);
        discipline.setSubject(cytoplasm);
        discipline.setSubject(digestiveSystem);

        for (Subject subject : discipline.getSubject()) {
            System.out.println(discipline.getTitle());
            System.out.println("------- " + subject.getTitle());
        }
    }
}
