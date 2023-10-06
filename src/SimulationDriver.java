
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationDriver {
    public static void main(String[] args) {
        // Configure the question
        List<String> candidateAnswers = List.of("Red", "Green", "Blue", "Yellow");
        Question question = new Question("What is your favorite color?", candidateAnswers, true);

        // Initialize the VotingService
        VotingService votingService = new VotingService(question);
 
        // Simulate students and their answers
        Random random = new Random();
        int numStudents = random.nextInt(50) + 1; // Randomly generate the number of students
        List<Student> students = new ArrayList<>();

        // Prints out the student ids and their answers
        System.out.println("Simulated Answers:");
        for (int i = 1; i <= numStudents; i++) {
            Student student = new Student("Student" + i);
            String randomAnswer = candidateAnswers.get(random.nextInt(candidateAnswers.size()));
            students.add(student);
            votingService.submitAnswer(student, randomAnswer);
            
            // Print the student ids and their chosen answer
            System.out.println(student.getId() + " chose: " + randomAnswer);
        }

        // Display the results
        votingService.displayResults();
    }
}