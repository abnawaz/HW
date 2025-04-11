import javax.swing.JOptionPane;

public class PassFailExamDemo {
    public static void main(String[] args) {
        int questions;
        int missed;
        double minPassing;

        String input = JOptionPane.showInputDialog("How many questions are on the exam?");
        questions = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("How many questions did the student miss?");
        missed = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("What is the minimum passing score?");
        minPassing = Double.parseDouble(input);

        PassFailExam exam = new PassFailExam(questions, missed, minPassing);

        String message = String.format("Each question counts %.2f points.\n", exam.getPointsEach());
        message += String.format("The exam score is %.2f\n", exam.getScore());
        message += String.format("The exam grade is %s", exam.getGrade());

        JOptionPane.showMessageDialog(null, message);
        System.exit(0);
    }
}
