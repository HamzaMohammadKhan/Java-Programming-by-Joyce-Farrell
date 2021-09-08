public class UseSimpleEvent {
        public static void main(String[] args){
        Event obj1 = new Event();
        JOptionPane.showMessageDialog(null,"Creating an event");
        obj1.setEventGuests();
        obj1.displayGuestsEvents();

        DinnerEvent obj2 = new DinnerEvent();
        obj2.setEventGuests();
        obj2.setDinnerChoice();

        obj2.displayDinnerChoice();
        obj2.displayGuestsEvents();
        System.exit(0);
    }
    }
}
