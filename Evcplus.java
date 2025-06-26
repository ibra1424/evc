import java.util.Scanner;

public class Evcplus{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pin = "1234"; // Lambarka sirta ah
        String number = "*770#"; // qaabka aad u galaysid
        double haraagaaga = 1000.0; // Haraagaaga hore

        System.out.println("Fadlan gali lambarka : ");
        String ussd = input.nextLine();

        if (ussd.equals("*770#")) {
            System.out.print("Fadlan geli lambarka sirta ah (PIN): ");
            String gelinPin = input.nextLine();

            if (gelinPin.equals(pin)) {
                int dooro;

                do {
                    System.out.println("\n--- ADEEGGA EVCPLUS ---");
                    System.out.println("1. Hubi Haraagaga");
                    System.out.println("2. U Dir Lacag");
                    System.out.println("3. Ku Shub Lacag (Ku hadal)");
                    System.out.println("4. Beddel PIN");
                    System.out.println("5. Ka Bax");
                    System.out.print("Dooro adeega (1-5): ");
                    dooro = input.nextInt();

                    switch (dooro) {
                        case 1:
                            System.out.println("Haraagaaga waa: $" + haraagaaga);
                            break;

                        case 2:
                            System.out.print("Geli lacagta aad dirayso: ");
                            double lacag = input.nextDouble();
                            if (lacag <= haraagaaga) {
                                haraagaaga-= lacag;
                                System.out.println("waad dirtay lacagta. Waxaad dirtay $" + lacag);
                            } else {
                                System.out.println("haraagaaga kuguma filna.");
                            }
                            break;

                        case 3:
                            System.out.print("fadlan Geli lacagta aad ku shubanayso: ");
                            double kuHadal = input.nextDouble();
                            if (kuHadal <= haraagaaga) {
                                haraagaaga -= kuHadal;
                                System.out.println("Waxaad ku shubatay $" + kuHadal + " ku hadal.");
                            } else {
                                System.out.println("Haragaaga kuguma filna.");
                            }
                            break;

                        case 4:
                            System.out.print("Geli PIN-kii hore: ");
                            input.nextLine(); // Clear buffer
                            String pinHore = input.nextLine();
                            if (pinHore.equals(pin)) {
                                System.out.print("Geli PIN cusub: ");
                                String pinCusub = input.nextLine();
                                System.out.print("Mar kale ku celi PIN cusub: ");
                                String pinMarKale = input.nextLine();

                                if (pinCusub.equals(pinMarKale)) {
                                    pin = pinCusub;
                                    System.out.println("PIN-kaaga si guul leh ayaa loo beddelay.");
                                } else {
                                    System.out.println("PIN-kii lama mid aha.");
                                }
                            } else {
                                System.out.println("PIN-kii hore waa khaldan yahay.");
                            }
                            break;

                        case 5:
                            System.out.println("Waad ka baxday EVCPlus. Mahadsanid!");
                            break;

                        default:
                            System.out.println("Fadlan dooro tiro sax ah (1 ilaa 5).");
                    }

                } while (dooro != 5);

            } else {
                System.out.println("PIN-ka aad gelisay waa khalad.");
            }

        } else {
            System.out.println("fadlan iska sax numberka aad gelisay ama  Fadlan geli *770#.");
        }

        input.close();
    }
}
