import java.util.Scanner;

public class Evc{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dial= "*770#"; // qaabka aad u galaysid
        int pin=2469; // Lambarka sirta ah
        double haraa=480;

        System.out.println("Garaac dial:");
        String dial2=input.next();
        // Xaqiijinta in dial-ama-Garaaca uu sax yahay

        if (dial.equals(dial2)){
            System.out.println("-EVCPLUS-");
            System.out.println("Fadlan gali Pin kaga");
            int pin2= input.nextInt();

            // Xaqiijinta PIN-kaga Evc-Ga

            if (pin==pin2){

                // Menu-gaan weyn ee adeega EvcPluska

                System.out.println("Evc-plus");
                System.out.println("1. Itus Haraaga");
                System.out.println("2. Kaarka Hadalka");
                System.out.println("3. Bixi Bill");
                System.out.println("4. U wareeji Evc-pus");
                System.out.println("5. warbixin Kooban");
                System.out.println("6. Salaam Bank");
                System.out.println("7. Maaraynta");
                System.out.println("8. Taaj");
                System.out.println("9. Bill Payment\n");

                System.out.println("Fadlan dooro number");
                int num= input.nextInt();

                // Waxan isticmale Switch si loo doorto adeegada

                switch (num){

                    // Haraaga Sida loo so Muujiyo

                    case 1:
                        System.out.println("Evc-plus haraagagu waa $"+haraa);
                        break;

                    // Kaarka Hadalka sub menu
                    case 2:
                        System.out.println("Kaarka Hadalka");
                        System.out.println("1. Ku shubo airtime");
                        System.out.println("2. Ugu shub airtime qof kale");
                        System.out.println("3. Ku shubo internet");
                        System.out.println("4. Ugu shub qof kale (MMT)");
                        System.out.print("Dooro mid: ");
                        int dooronumber = input.nextInt();
                        System.out.println("Fadlan gali pinkaaga");

                        // Confirm PIN | Hubinta Biinka
                        int comfirmPin=input.nextInt();

                        if (comfirmPin!=pin) {
                            System.out.println("Fadlan hubi numberkaga sirta ah");

                        }
                        // Ku shub airtime ama adeegyo kale

                        if (dooronumber == 1) {
                            System.out.print("Geli qadarka: ");
                            double amount = input.nextDouble();
                            if (amount <= haraa) {
                                haraa -= amount;
                                System.out.println("Waxaad ugu shubtay $" + amount + " Airtime.");
                                System.out.println("Haraagaaga cusub waa: $" + haraa);
                            } else {
                                System.out.println("Haraagaagu kuguma filna.");
                            }
                        } else if (dooronumber == 2) {
                            System.out.print("Geli numberka qofka: ");
                            String number = input.next();
                            System.out.print("Geli qadarka: ");
                            double amount = input.nextDouble();
                            if (amount <= haraa) {
                                haraa -= amount;
                                System.out.println("Waxaad $" + amount + " ugu shubtay " + number + ".");
                                System.out.println("Haraagaaga cusub waa: $" + haraa);
                            } else {
                                System.out.println("Haraagaagu kuguma filna.");
                            }
                        } else if (dooronumber == 3) {
                            System.out.print("Geli qadarka internet: ");
                            double amount = input.nextDouble();
                            if (amount <= haraa) {
                                haraa -= amount;
                                System.out.println("Waxaad si guul leh ugu shubtay $" + amount + " internet.");
                                System.out.println("Haraagaaga cusub waa: $" + haraa);
                            } else {
                                System.out.println("Haraagaagu kuguma filna.");
                            }
                        } else if (dooronumber == 4) {
                            System.out.print("Geli numberka qofka: ");
                            String number = input.next();
                            System.out.print("Geli qadarka internet: ");
                            double amount = input.nextDouble();
                            if (amount <= haraa) {
                                haraa -= amount;
                                System.out.println("Waxaad ugu shubtay internet qofka " + number + " lacag dhan $" + amount);
                                System.out.println("Haraagaaga cusub waa: $" + haraa);
                            } else {
                                System.out.println("Haraagaagu kuguma filna.");
                            }
                        } else {
                            System.out.println("Doorasho khaldan.");
                        }
                        break;
                    // Habka Bixinta Bill
                    case 3:
                        System.out.println("Bixi Bill");
                        System.out.println("1. Post Paid");
                        System.out.println("2. Ku iibso");

                        break;

                    // U wareejinta Evcplus

                    case 4:
                        System.out.println("U wareeji Evc-plus");

                        System.out.print("Fadlan geli mobile-ka: ");
                        String loodiraha= input.next();

                        System.out.print("Fadlan geli lacagta aad rabto inaad dirto: ");
                        double lacagtaladirayo = input.nextDouble();


                        if (lacagtaladirayo <= haraa) {

                            System.out.print("Fadlan soo geli numberka sirta ah: ");
                            int confirmPin = input.nextInt();

                            if (confirmPin == pin) {

                                haraa -= lacagtaladirayo;
                                System.out.println("Waxaad $"+lacagtaladirayo + " u dirtay " + loodiraha);
                                System.out.println("Haraagaaga cusub waa $" + haraa);
                            } else {
                                System.out.println("PIN-kaagu waa khalad.");
                            }
                        } else {
                            System.out.println("Haraga xisaabtadu kuguma filna.");
                        }
                        break;

                    // Warbixin Kooban submenu

                    case 5:
                        System.out.println("Warbixin Kooban:");
                        System.out.println("1. Last Action");
                        System.out.println("2. Wareejintii u danbeysay");
                        System.out.println("3. Iibsashadii u danbeysay");
                        System.out.println("4. Last 3 Actions");
                        System.out.println("5. Email me My Activity");
                        System.out.print("Fadlan dooro mid: ");

                        int dooroWarbixin = input.nextInt(); // input cusub
                        if (dooroWarbixin == 1) {
                            System.out.println("Last Action: Waxaad lacag $100 ku shubtay numberka.");
                        } else if (dooroWarbixin == 2) {
                            System.out.println("Wareejintii u danbeysay: Waxaad u wareejisay $50 account kale.");
                        } else if (dooroWarbixin == 3) {
                            System.out.println("Iibsashadii u danbeysay: Waxaad iibsatay adeeg internet $10.");
                        } else if (dooroWarbixin == 4) {
                            System.out.println("Last 3 Actions: \n- Lacag dhigasho $100\n- Wareejin $50\n- Iibsasho internet $10");
                        } else if (dooroWarbixin == 5) {
                            System.out.println("Waxaan kuu soo diri doonaa email-kaaga warbixintaada.");
                        } else {
                            System.out.println("Doorasho khaldan.");
                        }
                        break;



                    case 6:
                        // Salaam Bank submenu
                        System.out.println("Salaam Bank");
                        System.out.println("1. Itus Haraaga");
                        System.out.println("2.Lacag Dhigasho");
                        System.out.println("3. Lacag Qaadasho");
                        System.out.println("4.Kawareeji Evcplus");
                        System.out.println("5. Ka wareeji Account-kaga");
                        System.out.println("6. Maareynta Bankiga");
                        System.out.println("7. Kala Bax");
                        System.out.println("Dooro adeega aad rabto");
                        int piSalaam = 123456;
                        double harasalaambank = 1800;
                        int doorohoSlaama = input.nextInt();
                        switch (doorohoSlaama){
                            case 1:
                                System.out.println("Fadlan Geli Numberka Sirta Ee Bangiga");
                                int WeydinPin = input.nextInt();
                                if (WeydinPin == piSalaam){
                                    System.out.println("haraagaagu waa: $"+harasalaambank);
                                    break;
                                }
                                else {
                                    System.out.println("Waa qalad numberka sirta bangiga");
                                }
                                break;

                            case 2:
                                System.out.println("Fadlan Geli Numberka Sirta Ee Bangiga");
                                int PinLacagDhigasho = input.nextInt();

                                if (PinLacagDhigasho == piSalaam){
                                    System.out.println("Fadlan Soo Geli Lacagta");
                                    double LacagDhigasho = input.nextDouble();
                                    if (LacagDhigasho<= haraa){
                                        haraa-=LacagDhigasho;
                                        harasalaambank+=LacagDhigasho;
                                        System.out.println("Waxaad Dhigtay Koontadaada Salaam Bank lacag Dhan $"+LacagDhigasho+"Haraaga Koontadaada Waa $"+harasalaambank);
                                    }
                                    else {
                                        System.out.println("Haraaga Xisaabtaada Kuguma Filno");
                                    }                                }
                                else {
                                    System.out.println("Waa qalad numberka sirta bangiga");
                                }
                                break;

                            case 3:
                                System.out.println("Fadlan geli numberka sirta ee Bangiga:");
                                int PinLacagQaado = input.nextInt();

                                if (PinLacagQaado == piSalaam) {
                                    System.out.println("Fadlan geli lacagta aad rabto inaad ka qaadato:");
                                    double LacagQaado = input.nextDouble();

                                    if (LacagQaado <= harasalaambank) {
                                        harasalaambank -= LacagQaado;
                                        haraa += LacagQaado;
                                        System.out.println("Waxaad kala baxday koontadaada salaam bank $"+LacagQaado);
                                        System.out.println("Haraaga cusub ee Salaam Bank waa: $" + harasalaambank);
                                    } else {
                                        System.out.println("Haraaga Salaam Bank kuma filna.");
                                    }
                                } else {
                                    System.out.println("Waa qalad numberka sirta bangiga!");
                                }
                                break;

                            case 4:
                                System.out.println("Fadlan gei numberka sirta salaam");
                                int pinwarejinEvc=input.nextInt();
                                if (pinwarejinEvc==piSalaam){
                                    System.out.println("Fadlan geli lacagta aad rabto inaad wareejiso");
                                    double lacagwarejinEvc=input.nextDouble();
                                    if (lacagwarejinEvc<=haraa){
                                        haraa-=lacagwarejinEvc;
                                        harasalaambank+=lacagwarejinEvc;
                                        System.out.println("Waxaad ka wareejisay $"+lacagwarejinEvc + " una wareejisay Salaam bank");
                                        System.out.println("Haraagaaga Evcplus hada waa $"+haraa);
                                        System.out.println("Haraagaaga Salaam bank waa $"+harasalaambank);

                                    } else {
                                        System.out.println("haraaga xisaabtada kuguma filna");
                                    }
                                } else {
                                    System.out.println("Numberka sirta waa qalad fdlan iska sax");
                                }
                                break;

                            case 5:
                                System.out.println("Fadlan geli numberka sirta salaam");
                                int pinwarejinaccount= input.nextInt();
                                if (pinwarejinaccount==piSalaam){
                                    System.out.println("Fadlan geli lcagta aad rabto inaad wareejiso");
                                    double lacagwrejinaccount=input.nextDouble();
                                    if (lacagwrejinaccount<=harasalaambank){
                                        harasalaambank-=lacagwrejinaccount;
                                        System.out.println("Waxaad u wareejisay lacag dhan $"+lacagwrejinaccount + " Acount kale.");
                                        System.out.println("Haraagaga cusub ee salaam bank waa $"+ harasalaambank);
                                    } else {
                                        System.out.println("Lacagta aad wareejisy waa khalad");
                                    }

                                } else {
                                    System.out.println("Numberka sirta ah waa qalad");
                                }
                                break;

                            case 6:
                                System.out.println("Maareynta Bankiga");
                                System.out.println("1. Bedel PIN");
                                System.out.println("0. Ka bax menu-ga");

                                int maareynta = input.nextInt();

                                if (maareynta == 1) {
                                    System.out.println("Fadlan geli PIN-kii hore:");
                                    //soo gelinta pinka cusub ee aad ku bedaleso kii hore
                                    int oldPin = input.nextInt();

                                    if (oldPin == piSalaam) {
                                        System.out.println("Fadlan geli PIN cusub:");
                                        piSalaam = input.nextInt();
                                        System.out.println("PIN-kaaga waa la beddelay si guul ah!");
                                    } else {
                                        System.out.println("PIN-kii hore waa qalad!");
                                    }
                                } else if (maareynta == 0) {
                                    System.out.println("Waad ka baxday Maareynta Bankiga.");
                                } else {
                                    System.out.println("Doorasho aan sax ahayn.");
                                }
                                break;

                            case 7:
                                System.out.println("Fadlan geli numberka sirta ee Bangiga:");

                                //pinka lugu hbinaayo inaad lacag kala baxday salaam
                                int pinKalaBax = input.nextInt();

                                if (pinKalaBax == piSalaam) {
                                    System.out.println("Fadlan geli lacagta aad rabto inaad kala baxdo:");
                                    double lacagKalaBax = input.nextDouble();

                                    if (lacagKalaBax <= harasalaambank) {
                                        harasalaambank -= lacagKalaBax;
                                        haraa += lacagKalaBax;
                                        System.out.println("Waad kala baxday $" + lacagKalaBax + ". Haraaga Salaam Bank: $" + harasalaambank + ", Haraaga EVC: $" + haraa);
                                    } else {
                                        System.out.println("Haraaga Salaam Bank kuma filna!");
                                    }
                                } else {
                                    System.out.println("Numberka sirta bangiga waa qalad!");
                                }
                                break;

                            default:
                                System.out.println("Fadlan dooro number sax ah");

                        }



                        break;

                    // Maareynta submenu

                    case 7:
                        System.out.println("Maareynta");
                        System.out.println("1. Bedel lambarka sirta ah");
                        System.out.println("2.Bedel Luqadda");
                        System.out.println("3. Wargelin Mobile lumay");
                        System.out.println("4. Lacag Xirasho");
                        System.out.println("5. U celin lacag qaldantay");

                        int manageoption=input.nextInt();

                        if (manageoption== 1){
                            System.out.println("Fadlan geli numberka sirta ah:");
                            int oldpin=input.nextInt();
                            if (oldpin==pin){
                                System.out.println("Geli pinka cusub");
                                pin=input.nextInt();
                                System.out.println("Waala badalay numberkaga sirta ah mahadsanid:");

                            } else {
                                System.out.println("Pinka aad galisay ma ahan mid sax ah");
                            }
                        } else if (manageoption==2){
                            System.out.println("Dooro luqada aad rabto");
                            System.out.println("1. Soomali");
                            System.out.println("2. English");
                            int lang=input.nextInt();
                            if (lang==1){
                                System.out.println("Luuqadaadu waa soomali");
                            } else if (lang==2) {
                                System.out.println("Your language has been set to English ");

                            }else{
                                System.out.println("Doorasho Khaldan");
                            }
                        } else if (manageoption==3) {
                            System.out.println("Fadlan la xariir xafiiska kuu dhaw si mobilekaga loo xayiro");
                            System.out.println("Ama wac 141 si laguu caawiyo");

                        } else if (manageoption == 4) {
                            System.out.print("Fadlan xaqiiji in aad rabto inaad xirto lacagtaada (Haa = 1, Maya = 0): ");
                            //pinka lugu xqiijinayo iaan lacag xirato
                            int confirm = input.nextInt();
                            if (confirm == 1) {
                                System.out.println("Lacagtaada waa la xiray. Waxaad kala xiriiri kartaa 141 si aad dib u furto.");
                            } else {
                                System.out.println("Hawlgalka waa la joojiyay.");
                            }

                        } else if (manageoption == 5) {
                            System.out.println("Fadlan la xiriir 141 si aad ugu celiso lacag si khalad ah loo diray.");
                        } else {
                            System.out.println("Doorasho khaldan.");
                        }


                        break;

                    case 8:
                        System.out.println("TAAJ");
                        System.out.println("1.Gudaha");
                        System.out.println("2.Dibadda");
                        System.out.println("3. Ogoow Khidmada");
                        System.out.println("4.Macluumaadka Xwaladda");
                        System.out.println("5. Jooji Xawaaladda");
                        System.out.println("6. Fur Xawaaladda ");

                        System.out.println("Fadlan dooro adeeg aad rabto");

                        int TaajOptions=input.nextInt();

                        switch (TaajOptions){
                            case 1:

                                System.out.println("Fadlan dooro shirkada");
                                System.out.println("1. E-KAAFI");
                                System.out.println("2. E-SAHAL");
                                int doroshoshirkad=input.nextInt();
                                if (doroshoshirkad==1){
                                    System.out.println("Fadlan Geli Numberka loo diraha");

                                    String number=input.next();

                                    System.out.println("Fadlan Geli magaca qaataha oo seddexan");
                                    input.nextLine();
                                    String magac= input.nextLine();

                                    System.out.println("Fadlan Geli qadarka lacagta");
                                    double lacag= input.nextDouble();
                                    System.out.println("Waxaad u dirtay $" + lacag + " magac: " + magac + " number: " + number + " adigoo adeegsanaya E-KAAFI.");

                                } else if (doroshoshirkad == 2) {
                                    System.out.println("Fadlan geli numberka loo dirayo:");
                                    String number = input.next();

                                    System.out.println("Fadlan geli magaca qofka loo dirayo:");
                                    input.nextLine(); // To clear the newline character
                                    String magac = input.nextLine();

                                    System.out.println("Fadlan geli qadarka lacagta:");
                                    double lacag = input.nextDouble();

                                    System.out.println("Waxaad u dirtay $" + lacag + " magac: " + magac + "  number: " + number + " adigoo adeegsanaya E-SAHAL.");
                                }
                                break;

                            case 2:
                                System.out.println("Fadlan geli Taleefanka qaataha");
                                String numberqaataha= input.next();

                                System.out.println("Fadlan Geli Magaca Qaataha o seddexan");
                                input.nextLine();
                                String magacaqataha=input.nextLine();

                                System.out.println("Fadlan geli magaalada uu joogo");
                                String magalo=input.next();

                                System.out.println("Fadlan Geli qadarka lacagta");
                                double money=input.nextDouble();

                                System.out.println("Waxaad u dirtay $" + money + " magac: " + magacaqataha + " number: " + numberqaataha + " oo joogo magalada " + magalo);

                                break;

                            case 3:
                                System.out.println("Fadlan dooro shirkada");
                                System.out.println("1. PAY to EVCPlus TMT");
                                System.out.println("2. TAAJ");
                                System.out.println("3. TaajPay");
                                System.out.println("4. New Etaaj");
                                System.out.println("5. TAAJ IPS");

                                int dooro=input.nextInt();

                                if (dooro==1){
                                    System.out.println("Fadlan Geli taleefanka qaataha");
                                    String numberkaqofka=input.next();

                                    System.out.println("Fadlan geli qadarka lacagta");
                                    double sendigmoney=input.nextDouble();

                                    System.out.println("Waxaad u warejisay lacag dhan $"+sendigmoney + " Numberka " + numberkaqofka);
                                }
                                break;

                            default:
                                System.out.println("Doorashadaadu waa mid khaldan");
                        }



                        break;

                    // BILL PAYMENT
                    case 9:
                        System.out.println("Bill Payment");
                        System.out.println("1. Itus Haraaga Billka");
                        System.out.println("2. Wada bixi Bill-ka");
                        System.out.println("3. Qayb ka bixi Bill-ka");
                        break;


                    default:
                        System.out.println("Fadlan dooro tiro sax ah (1 ilaa 9)");



                }


            }else{
                System.out.println("pinkaagu waa qalad fadlan isku hubi");
            }
        }else{
            System.out.println("fadlan iska sax numberka aad gelisay ama  Fadlan geli *770#.\"");
  }
    }
}