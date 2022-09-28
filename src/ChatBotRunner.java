public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot jason = new ChatBot("Jason", 12);
        jason.greeting("Kevin");
        jason.weather();
        jason.favoriteNumber(20);
        jason.favoriteFood("chicken");

        int sum = jason.addNumbers(24, 32, 65);
        System.out.println("The sum of your numbers is " + sum);
        double meters = jason.convertFeetToMeters(32);
        System.out.println("There are " + meters+ " in 32 feet");
        double avg = jason.avgNumbers(23, 12, 31);
        System.out.println("The average of the numbers 23, 12, and 31 is " + avg);
        String message = jason.goodbye();
        System.out.println(message);

    }
}
