import java.util.ArrayList;

public class Aplicacao {
    ArrayList<Cliente> nd = new ArrayList<>();
    ArrayList<Produto> l = new ArrayList<>();
    public Aplicacao(){
        Data n = new Data(12,14,12);
        Cliente a = new Cliente("bruno","brunoadasd","dadadad",91313313,n);
        nd.add(a);
        Data j = new Data(15,12,12);
        Cliente b = new Cliente("samu","samid","ddasdad",911233113,j);
        nd.add(b);
        for( int i = 0; i < nd.size(); i++){
            System.out.println(nd.get(i));
        }


        Produto q = new Produto("a123iasdadv3","Bolachas Maria",  1.3,230);
        l.add(q);
        Produto g = new Produto("dv3","Arroz Agulha",  0.65,20);
        l.add(g);
        for( int i = 0; i < l.size(); i++){
            System.out.println(l.get(i));
        }


    }
}
