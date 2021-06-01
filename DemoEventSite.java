public class DemoEventSite {
    public static void main(String[] args){
        EventSite ES = new EventSite(123);
        EventSite ES2 = new EventSite("Robin");

        System.out.println("Site number is "+ ES.getSiteNumber() + " Manager is " + ES.getManagerName());
        System.out.println("Another site number is "  + ES2.getSiteNumber() + " Manager is " + ES2.getManagerName());
    }
}
