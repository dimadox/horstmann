package chapter9_inheritance_and_interfaces.examples;

public class Question3 {
    /**
     * A question with a text and an answer.
     */
    private String text;
    private String answer;

    /**
     * Constructs a question with empty question and answer.
     */
    public Question3() {
        text = "";
        answer = "";
    }

    /**
     * Sets the question text.
     *
     * @param questionText the text of this question
     */
    public void setText(String questionText) {
        text = questionText;
    }

    /**
     * Sets the answer for this question.
     *
     * @param correctResponse the answer
     */
    public void setAnswer(String correctResponse) {
        answer = correctResponse;
    }

    public String getAnswer(){
        return answer;
    }

    /**
     * Checks a given response for correctness.
     *
     * @param response the response to check
     * @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }



    /**
     * Displays this question.
     */
    public void display() {
        System.out.println(text);
    }

    public String toString(){
        return text;
    }
}



