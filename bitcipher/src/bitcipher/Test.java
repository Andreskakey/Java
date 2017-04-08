package bitcipher;

import java.util.Scanner;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String message,answer;
        int choice,shuffle,shift;

        MessageEncoder chiper=new SubstitutionCipher(1);
        System.out.println(chiper.encode("abcdefghijklmn"));
        MessageDecoder ch=new SubstitutionCipher(1);
        System.out.println(ch.decode("bcdefghijklmno"));
        MessageEncoder shchiper=new ShuffleCipher(1);
        System.out.println(shchiper.encode("abcdefghi"));
        MessageDecoder sh1=new ShuffleCipher(1);
        System.out.println(sh1.decode("afbgchdie")+"\n");

        do{
            System.out.println("Enter the message to be encode or decode: ");
            Scanner inkey= new Scanner(System.in);       
            message=inkey.nextLine();
            menu();

            choice=inkey.nextInt();
            if(choice<1&&choice>6){
                System.out.println("Wrong Entery try again.\n");
                menu();
            }
            switch(choice){

            case 1:
                System.out.println("How many shufles you want to prefom on message: ");
                shuffle=inkey.nextInt();
                MessageDecoder decoder1=new ShuffleCipher(shuffle);
                System.out.println(decoder1.decode(message)+"\n");
                break;

            case 2:
                System.out.println("How many shifts you want to prefom on message: ");
                shift=inkey.nextInt();
                MessageDecoder decoder2=new SubstitutionCipher(shift);
                System.out.println(decoder2.decode(message)+"\n");
                break;

            case 3:
                System.out.println("How many shufles you want to prefom on message: ");
                shuffle=inkey.nextInt();
                MessageEncoder encoder1=new ShuffleCipher(shuffle);
                System.out.println(encoder1.encode(message)+"\n");
                break;
            case 4:
                System.out.println("How many shifts you want to prefom on message: ");
                shift=inkey.nextInt();
                MessageEncoder encoder2=new SubstitutionCipher(shift);
                System.out.println(encoder2.encode(message)+"\n");
                break;
            case 5:
                System.out.println("Please enter a character for the mask");
                shift=inkey.nextByte();
                MessageEncoder encoder3=new BitCipher((char)shift);
                System.out.println(encoder3.encode(message)+"\n");
                break;
            case 6:
                System.out.println("Please enter same character for the mask");
                shift=inkey.nextByte();
                MessageEncoder decoder3=new BitCipher((char)shift);
                System.out.println(decoder3.encode(message)+"\n");
                break;
            }
            System.out.println("Do you want to decode or encode more messages? ");
            System.out.println("Enter yes or no.");
            answer=inkey.next();

        }while(answer.equalsIgnoreCase("yes"));


    }
    public static void menu(){
        System.out.println("Select from the options below: ");
        System.out.println("1.Decode by Shufle.");
        System.out.println("2.Decode by Substitution.");
        System.out.println("3.Encode by Shufle.");
        System.out.println("4.Encode by Substitution.");
        System.out.println("5.Encode by Exclusive Or.");
        System.out.println("6.Decode by Exclusive Or.");
    }

}