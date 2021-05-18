public class TestCheckup {
    public static void main(String[] args){
        Checkup Obj1 = new Checkup();
        Checkup Obj2 = new Checkup();
        Checkup Obj3 = new Checkup();
        Checkup Obj4 = new Checkup();

        int patient, patient2, patient3, patient4;
        String ExplainRatio1, ExplainRatio2, ExplainRatio3, ExplainRatio4;
        double ratio1HDL, ratio1LDL, BPs1, BPd1;
        double ratio2HDL, ratio2LDL;
        double ratio3HDL, ratioLDL;
        double ratio4HDL, ratio4LDL;

        //patient ids:
        patient = Obj1.setPatient_ID(1);
        patient2 = Obj2.setPatient_ID(2);
        patient3 = Obj3.setPatient_ID(3);
        patient4 = Obj4.setPatient_ID(4);

        System.out.println("The patient id is : " + patient + "\n");
        Obj1.setCholF_HDL(11);
        Obj1.setCholF_LDL(50);

        System.out.println("The patient id is : " + patient2 + "\n");
        Obj2.setCholF_HDL(12);
        Obj2.setCholF_HDL(22);

        BPs1 = Obj1.setBP_Dystolic(120);
        BPd1 = Obj1.setBP_Systolic(22);
        System.out.println(" Your combine BP is : " + BPs1 + " / " + BPd1);

        Obj1.ExplainRatio();
    }
}
