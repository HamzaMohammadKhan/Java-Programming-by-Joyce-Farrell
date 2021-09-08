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
        
         obj1.displayPricingInfo();
        obj2.displayPricingInfo();
        System.exit(0);
    }
    }
}
