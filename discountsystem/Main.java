package discountsystem;
import java.util.Date;

public class Main{
    public static void main(String[] args) {
        Date now = new Date();
        Visit amane = new Visit("Yugi Amane", now);
        amane.setMember(true);
        amane.setMemberType("Premium");
        amane.setProductExpense(200);
        amane.setServiceExpense(300);
        System.out.println(amane.toString());
        System.out.println("----------------------------------------------------------------");

        Visit nene = new Visit("Yashiro Nene", now);
        nene.setMember(true);
        nene.setMemberType("Gold");
        nene.setProductExpense(200);
        nene.setServiceExpense(300);
        System.out.println(nene.toString());
        System.out.println("----------------------------------------------------------------");

        Visit kou = new Visit("Minamoto Kou", now);
        kou.setMember(true);
        kou.setMemberType("Silver");
        kou.setProductExpense(200);
        kou.setServiceExpense(300);
        System.out.println(kou.toString());
        System.out.println("----------------------------------------------------------------");

        Visit tsukasa = new Visit("Yugi Tsukasa", now);
        tsukasa.setMember(false);
        tsukasa.setProductExpense(200);
        tsukasa.setServiceExpense(300);
        System.out.println(tsukasa.toString());


    }
}