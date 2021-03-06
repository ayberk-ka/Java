//* kale class  ArrayList
import java.util.ArrayList;
public class Klasse
{
    public static void main(String[] args){
        //* Ny object gruppe1 fra class ArrayList 
     ArrayList gruppe1=new ArrayList<>();
     //* her er elementer 
     gruppe1.add("Samer");
     gruppe1.add("Mahmoud");
     gruppe1.add("Isabella");
     gruppe1.add("Kvilhaug-Kasem");
     System.out.println("Print Gruppe1 >"+gruppe1); //*printe gruppe1 elementer
     System.out.println("size Gruppe1: "+gruppe1.size()); //* viser antal elementer for gruppe1
     System.out.println("Contains Gruppe1: "+gruppe1.contains("Ali")); //skjekke om  Ali er medlem i gruppe1
     System.out.println("Contains Gruppe1: "+gruppe1.contains("Mahmoud")); //skjekke om Mahmoud er medlem i gruppe1
     
     
     ArrayList gruppe2 =(ArrayList<String>)gruppe1.clone(); // kopiere medlemmene fra gruppe1 til gruppe2, lage et nytt medlem og fjerne to medlem 
     gruppe2.add("Khaled");
     gruppe2.remove(0);
     gruppe2.remove("Isabella");
     System.out.println("Print Gruppe2>"+gruppe2);
     System.out.println("size Gruppe2>"+gruppe2.size());
     
     ArrayList gruppe3= new ArrayList<String>(); // lage ny gruppe
     gruppe3.add("Stein");
     gruppe3.add("Robert");
     gruppe3.add("Angeline");
     gruppe3.add("Ysmin");
     
     System.out.println("første medlemm : "+gruppe3.get(0)); // printe første medlemm
     System.out.println("Last medlemm : " +gruppe3.get(gruppe3.size()-1) + "\n");
     System.out.println("Første index fra gruppe3 'Stein': " + gruppe3.indexOf("Stein"));
     System.out.println("Siste index fra  gruppe3 'Ysmin':  " + gruppe3.lastIndexOf("Ysmin") + "\n");
     
     Object[] all = new Object[gruppe3.size()]; //ny  array  (Object): type 
     gruppe3.toArray(all);
     for(int i=0; i<all.length; i++){
         System.out.println("all[" +i+ "] = " +all[i]);
        }

    }
} 
