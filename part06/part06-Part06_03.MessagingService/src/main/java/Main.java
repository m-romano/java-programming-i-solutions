
public class Main {

    public static void main(String[] args) {

        // The Simpsons, Season 5, Episode 22
        Message firstMessage = new Message("Homer", "Awww Marge why do you keep making me learn things. Remember that time I learned how to make wine and forgot how to drive?");
        Message secondMessage = new Message("Marge", "That's because you were drunk.");
        Message thirdMessage = new Message("Homer", "And how.");

        MessagingService messagingService = new MessagingService();

        messagingService.add(firstMessage);
        messagingService.add(secondMessage);
        messagingService.add(thirdMessage);

        messagingService.getMessages();
    }
}
