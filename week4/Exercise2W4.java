import java.util.Scanner;

public class Exercise2W4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message:");
        String message = input.next();
        System.out.println("Enter your type:");
        String type = input.next();

        try {
            System.out.println(convertMessage(message, type));
        } catch (NumberFormatException e) {
            System.out.println("This message cannot be cast to type "
                    + type);
            System.out.println(e.getMessage());
        }
    }

    public static Object convertMessage(String message, String type) {
        switch (type.toLowerCase()) {
            case "char":
                return message.charAt(0);
            case "byte":
                return Byte.parseByte(message);
            case "short":
                return Short.parseShort(message);
            case "int", "Integer":
                return Integer.parseInt(message);
            case "long":
                return Long.parseLong(message);
            case "float":
                return Float.parseFloat(message);
            case "double":
                return Double.parseDouble(message);
            case "boolean":
                return Boolean.parseBoolean(message);
            default:
                return message;
        }
    }
}
