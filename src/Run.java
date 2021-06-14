public class Run {
    public static void main(String[] args) {

        Employee developer1 = new Developer("John", 1, 100L);
        Employee developer2 = new Developer("Jack", 2, 200L);
        Employee developer3 = new Developer("Mike", 3, 300L);
        Employee developer4 = new Developer("Teddy", 4, 400L);
        Employee developer5 = new Developer("Kenny", 5, 500L);

        Employee lead1 = new Lead("Jordan", 6, 5000L);
        Employee lead2 = new Lead("Kris", 7, 5000L);

        Employee manager = new Manager("Donald", 8, 10000L);

        lead1.add(developer1);
        lead1.add(developer2);
        lead1.add(developer3);
        System.out.println("Lead_1: " + lead1.toString());


        lead2.add(developer4);
        System.out.println("Lead_2: " + lead2.toString());

        manager.add(lead1);
        manager.add(lead2);
        manager.add(developer5);
        System.out.println("Manager: " + manager.toString());
    }
}
