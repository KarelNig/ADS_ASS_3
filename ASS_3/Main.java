package ASS_3;

public class Main {
    public static void main(String[] args) {
        RonnieColeman ronnieColeman = new RonnieColeman();
        TrainingMethod ronnieTraining = new RonnieColemanAdapter(ronnieColeman);
        ronnieTraining.performTraining();
    }
}
