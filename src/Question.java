import java.util.List;

public class Question {
    private String questionText;
    private List<String> candidateAnswers;
    private boolean multipleChoice;

    public Question(String questionText, List<String> candidateAnswers, boolean multipleChoice) {
        this.questionText = questionText;
        this.candidateAnswers = candidateAnswers;
        this.multipleChoice = multipleChoice;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getCandidateAnswers() {
        return candidateAnswers;
    }

    public boolean isMultipleChoice() {
        return multipleChoice;
    }
}