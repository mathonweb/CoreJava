public class Trip_details extends Trip_description{
    static int i = 0;
    static int j = 0;
    public void language(String lang){
        System.out.println("The second official language is:"+lang);
    }

    public void count1(){
        i = i+1;
    }

    public void count2(){
        j = j+1;
    }

    public void print(){
        count1();
        System.out.println("i="+i);
        count2();
        System.out.println("j="+j);
    }


}