public class BioDataHomeWorkClass {
    //20/06/2020
    //with variable practice
    //Writing title on the top middle of the sheet(class or static variable)
    //i am adding this project in to the git hub
    //done some changes
    static String title="Bio-Data";

    //Writing Applicant sex in instance variable
    String sex = "Male";

    //Writing Applicant profession in instance variable
    String profession ="Q.A.";

    //Writing date of birth in Constant variable
    static final String DOB = "01/05/1980";

    //Writing height in Class or Static variable
    static String height = " 5\'1\"";

    //Writing marital status in Static variable
    static String maritalStatus = "Married";

    //Writing Address in Static variable
    static String firstLine = "9 Park Road";
    static String secondLine = "Maruti Nagar";
    static String thirdLine = "London";
    static String forthLine = "UB5 8RS";


    public static void main(String[] args) {
        //Printing  boarder line on top of the page
        System.out.println("____________________________________________________________________ ");

        /* printing title in middle of the page and draw a border line underneath it              */
        System.out.println("|\t\t\t\t\t\t\t"+title+"\t\t\t\t\t\t\t\t|");
        System.out.println("____________________________________________________________________ ");


        //Writing and printing applicant name in front Name of sub heading in cv
        //local variable
        String name = "John Miller";
        System.out.println("| Name\t\t\t:\t\t"+name+"\t\t\t\t\t\t\t\t\t|"+"\n|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");




        //Printing applicant address in front of subheading Address(static variable)
        System.out.println("| Address \t\t:\t\t" + firstLine
                + "\t\t\t\t\t\t\t\t\t|\t\n" +"|\t\t\t\t\t\t" +secondLine
                + "\t\t\t\t\t\t\t\t|\t\n" +"|\t\t\t\t\t\t" +thirdLine
                + "\t\t\t\t\t\t\t\t\t\t|\t\n"+"|\t\t\t\t\t\t" + forthLine+"\t\t\t\t\t\t\t\t\t\t|"+"\n|\t\t\t\t\t\t\t\t" +
                "\t\t\t\t\t\t\t\t\t|");


        //Writing and printing an e-mail address in front of subheading e-mail(local variable)
        String email = "abc@gmail.com";
        System.out.println("| E-mail\t\t:\t\t"+email+"\t\t\t\t\t\t\t\t|"+"\n|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");



        //Writing  and printing a phone number in front of subheading Phone(local variable)
        String phone = "+44 789 9999";
        System.out.println("| Phone\t\t\t:\t\t"+phone+"\t\t\t\t\t\t\t\t|"+"\n|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");

        //Printing applicant sex in front of subheading Sex(instance variable)
        BioDataHomeWorkClass obj = new BioDataHomeWorkClass();
        System.out.println("| Sex\t\t\t:\t\t"+obj.sex+"\t\t\t\t\t\t\t\t\t\t|"+"\n|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");

        //printing applicant height in front of subheading Height(Static variable)
        System.out.println("| Height\t\t:\t   "+height+"\t\t\t\t\t\t\t\t\t\t|"+"\n|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        //printing applicant sex in front of subheading Sex(Instance variable)
        System.out.println("| Sex\t\t\t:\t\t"+obj.sex+"\t\t\t\t\t\t\t\t\t\t|"+"\n|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");

        //printing applicant DOB in front of subheading DOB(constant variable)
        System.out.println("| DOB\t\t\t:\t\t"+DOB+"\t\t\t\t\t\t\t\t\t|"+"\n|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");

        //printing applicant marital status in front of subheading Marital Status(Static variable)
        System.out.println("| Marital Status:\t\t"+maritalStatus+"\t\t\t\t\t\t\t\t\t\t|"+"\n|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");


        //Writing and printing a degree in front of subheading Qualification
        String qualification1 ="BCA";
        String qualification2 ="MCA";
        System.out.println("| Qualification :\t\t"+qualification1+"\t\t\t\t\t\t\t\t\t\t\t|\n"+"|\t\t\t\t\t\t"+
                qualification2+"\t\t\t\t\t\t\t\t\t\t\t|"+"\n|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");


        //printing  applicant profession in front of subheading Profession(instance variable)
        System.out.println("| Profession\t:\t\t"+obj. profession+"\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("_____________________________________________________________________");






    }
}
