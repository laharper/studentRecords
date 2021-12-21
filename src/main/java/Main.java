public class Main {
    public static void main(String[] args) {

        String x = "Hello Leslie";
        Student st1 = new Student("Bob", "Smith", "bob@bob.com");
        Student st2 = new Student("Jane", "Jones", "jane@jane.com");
        System.out.println("Student 1 is: "+ st1.getFname() + " " + st1.getLname());
        System.out.println("Student 2 is: "+ st2.getFname() + " " + st2.getLname());
        System.out.println("But wait...there is a wedding!");
        st2.setLname("Smith");
        System.out.println("Student 2 is now: "+ st2.getFname() + " " + st2.getLname());
        System.out.println("Student 1 level before: " + st1.getLevel());
        System.out.println("Student 2 level before: " + st2.getLevel());
        st2.setLevel("Freshman");
        System.out.println("Student 2 level is now: "+ st2.getLevel());

        //Assign scores to Bob Smith of 92, 87, 91)
        int[] bobScores = {92, 87, 61};
        st1.setTestScores(bobScores);
        System.out.println("Here's the average: " + st1.getAverageScore());

    }


}
