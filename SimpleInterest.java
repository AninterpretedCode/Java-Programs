class SimpleInterest{
    int p=23,r=4,t=1;
    public static void main(String args[]){
        SimpleInterest obj = new SimpleInterest();
        float SI = (float)(obj.p*obj.r*obj.t)/100;
        System.out.println("The simple interest calculated is: "+ SI);
    }
}