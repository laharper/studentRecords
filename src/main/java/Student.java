public class Student {
    private String fname;
    private String lname;
    private String email;
    private String level;
    private int[] testScores = {0};

    //constructor
    public Student (String firstName, String lastName, String emailAddress) {
        this.fname = firstName;
        this.lname = lastName;
        this.email = emailAddress;
        this.level = "Unknown";
    }

    //getter
    public String getFname() {return fname;}
    public String getLname() {return lname;}
    public String getEmail() {return email;}
    public String getLevel() {return level;}
    public double getAverageScore() {
        double average = -1.0; //this is an error condition
        int sum = 0;
        for (int i = 0; i < testScores.length; i++){
            sum = sum + testScores[i];
        }
        average = sum / testScores.length;
        return average;
    }

    //setter
    public void setFname(String firstName) {this.fname = firstName;}
    public void setLname(String lastName) {this.lname = lastName;}
    public void setEmail(String email) {this.email = email;}
    public void setLevel(String newlevel) {
        if (newlevel == "Freshman" || newlevel == "Sophomore" || newlevel == "Junior" || newlevel == "Senior") {
            this.level = newlevel;
        } else {
            System.out.println("Invalid entry, so level is unchanged at " + this.level);
        }
    }
    public void setTestScores(int[] testScores) {
        this.testScores = testScores;
    }
}


