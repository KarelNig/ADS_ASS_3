package ASS_3;

import java.util.Scanner;


class RonnieColemanAdapter implements TrainingMethod {
    private RonnieColeman ronnieColeman;

    RonnieColemanAdapter(RonnieColeman ronnieColeman) {
        this.ronnieColeman = ronnieColeman;
    }

    @Override
    public void performTraining() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to adapt Ronnie Coleman's training for the average person? (yes/no): ");
        String response = scanner.nextLine().toLowerCase();

        if (response.equals("yes")) {
            System.out.println("Ronnie Coleman's training for the average man:");
            for (String exercise : ronnieColeman.getTrainingList()) {
                System.out.println(exercise);
            }
        } else {
            System.out.println("You suck : (");
        }
    }
}