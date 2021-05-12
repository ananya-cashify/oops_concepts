package in.cashify.switchExample;

public class Example1 {
    public static void main (String[] args){
        int number =44;
        String size;

    switch (number) {

            case 42:
size = "Small";
    break;
            case 28:
        size = "medium";

        break;
        case 44:
        case 45:
        size = "Large";
        break;
        default:
            size = "Unknown";
            break;
        }
        System.out.println ("Size:" +size);

    }
}
