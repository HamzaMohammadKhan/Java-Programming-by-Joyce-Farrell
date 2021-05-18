public class Checkup {
    //Systolic blood pressure measures the pressure in your arteries when your heart beats.
    //Diastolic blood pressure measures the pressure in your arteries when your heart rests between beats.
    private int patient_ID;
    private double BP_Systolic;
    private double BP_Dystolic;
    private double CholF_LDL;
    private double CholF_HDL;

    int getPatient_ID(){
        return patient_ID;
    }
    int setPatient_ID(int ID){
        patient_ID = ID;
        return patient_ID;
    }
    double getBP_Systolic(){
        return BP_Systolic;
    }
    double setBP_Systolic(double BPS){
        BP_Systolic = BPS;
        return BP_Systolic;
    }
    double getBP_Dystolic(){
        return BP_Dystolic;
    }
    double setBP_Dystolic(double BPD){
        BP_Dystolic = BPD;
        return BP_Dystolic;
    }
    double getCholF_LDL(){
        return CholF_LDL;
    }
    double setCholF_LDL(double LDL){
        CholF_LDL = LDL;
        return CholF_LDL;
    }
    double getCholF_HDL(){
        return CholF_HDL;
    }
    double setCholF_HDL(double HDL){
        CholF_HDL = HDL;
        return CholF_HDL;
    }
    public double computeRatio(){
     double ratio = CholF_LDL / CholF_HDL;
     System.out.println(" Your Ratio is = " + ratio);
     return ratio;
    }
    public void ExplainRatio(){
        System.out.println("\n HDL is known as good Cholestrol and that of ratio of 3.5 or lower is considered optimum \n");
        if(computeRatio()<=3.5){
            System.out.println("Your cholesterol is optimum");
        }
        else {
            System.out.println(" Your cholesterol is not optimum ");
        }
    }
}
