import java.util.HashMap;
import java.util.Map;

public class VotingService {
    private Question question;
    private Map<String, Integer> answerCounts;

    public VotingService(Question question) {
        this.question = question;
        this.answerCounts = new HashMap<>();
    }

    public void submitAnswer(Student student, String answer) {

        if (!question.isMultipleChoice()) {
            answerCounts.remove(student.getId());
        }

        answerCounts.put(answer, answerCounts.getOrDefault(answer, 0) + 1);
    }

    public void displayResults() {
        System.out.println("Results for question: " + question.getQuestionText());
        for (String answer : question.getCandidateAnswers()) {
            int count = answerCounts.getOrDefault(answer, 0);
            System.out.println(answer + " : " + count);
        }
    }
}