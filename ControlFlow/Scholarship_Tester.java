public class Scholarship_Tester {

// TESTING FOR INVALID STUDENTS
    //ACDSU path
    public void testInvalidStudent1(){
        Student s = new Student(30, 2,6,1,true, 5000);
        String e = Scholarship.check_eligibility(s);
        if(e.equals("0")){
            System.out.println("testInvalidStudent1: Passed");
        }
        else{
            System.out.println("testInvalidStudent1: Failed");
        }
    }
    //ABVSU Path
    public void testInvalidStudent2(){
        Student s = new Student(14, 2,6,1,true ,5000);
        String e = Scholarship.check_eligibility(s);
        if(e.equals("0")){
            System.out.println("testInvalidStudent2: Passed");
        }
        else{
            System.out.println("testInvalidStudent2: Failed");
        }
    }

    //acegjmptu
    public void testInvalidStudent3(){
        Student s = new Student(18, 1,2,0,false,6000);
        String e = Scholarship.check_eligibility(s);
        if(e.equals("0")){
            System.out.println("testInvalidStudent3: Passed");
        }
        else{
            System.out.println("testInvalidStudent3: Failed");
        }
    }

    // TESTING DEAN STUDENT
    //acegjmpr
    public void testDeanStudent(){
        Student s = new Student(19, 1,3, 0,false,2000);
        String e = Scholarship.check_eligibility(s);
        if(e.equals("Dean for consideration")){
            System.out.println("testDeanStudent: Passed");
        }
        else{
            System.out.println("testDeanStudent: Failed");
        }
    }

    // TESTING FOR VALID STUDENTS
    //acefhknq
    public void testValidStudent1(){
        Student s = new Student(18,2,3,1,false,2000);
        String e = Scholarship.check_eligibility(s);
        if(e.equals("1")){
            System.out.println("testValidStudent1: Passed");
        }
        else{
            System.out.println("testValidStudent1: Failed");
        }
    }

    //acegiknq
    public void testValidStudent2(){
        Student s = new Student(24, 1, 6, 1 , true, 5000);
        String e = Scholarship.check_eligibility(s);
        if(e.equals("1")){
            System.out.println("testValidStudent2: Passed");
        }
        else{
            System.out.println("testValidStudent2: Failed");
        }
    }

    //acegjlnq
    public void testValidStudent3(){
        Student s = new Student(23, 1,4,1, true, 5000);
        String e = Scholarship.check_eligibility(s);
        if(e.equals("1")){
            System.out.println("testValidStudent3: Passed");
        }
        else{
            System.out.println("testValidStudent3: Failed");
        }
    }

    //acegjmoq
    public void testValidStudent4(){
        Student s = new Student(18, 1, 3, 0, true, 5000);
        String e = Scholarship.check_eligibility(s);
        if(e.equals("1")){
            System.out.println("testValidStudent4: Passed");
        }
        else{
            System.out.println("testValidStudent4: Failed");
        }
    }

    public static void main(String args[]){
        Scholarship_Tester s = new Scholarship_Tester();
        System.out.println("TESTING INVALID STUDENTS");
        s.testInvalidStudent1();
        s.testInvalidStudent2();
        s.testInvalidStudent3();

        System.out.println("TESTING VALID STUDENTS");
        s.testValidStudent1();
        s.testValidStudent2();
        s.testValidStudent3();
        s.testValidStudent4();

        System.out.println("TESTING DEAN STUDENT");
        s.testDeanStudent();
    }
}
