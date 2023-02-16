public class Scholarship {

    public static String check_eligibility(Student s){
        if(s.getAge() >= 18 && s.getAge() <= 24){
            if(s.getResidencyYears() >= 2){
                return "1";
            }
            else if(s.getWorkMonths() >= 6){
                return "1";
            }
            else if(s.getParentsResidencyYears() >=1){
                return "1";
            }
            else if(s.isVolunteered()){
                return "1";
            }
            else if(s.getHouseholdIncome() < 5000){
                return "Dean for consideration";
            }
            else{
                return "0";
            }
        }
        else{
            return "0";
        }
    }
}
