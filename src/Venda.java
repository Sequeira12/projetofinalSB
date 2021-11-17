import java.util.ArrayList;
import java.util.Scanner;
public class Venda extends Aplicacao{
    private Cliente cli;
    private ArrayList<Produto> prods = new ArrayList<>();

   public Venda(Cliente lint){
       this.cli = lint;
   }

    public double precoTotaldacompra(){

        double preco = 0.0;

        System.out.println("Quantos produtos diferentes necessita:");
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        for( int j = 0; j < k; j++) {

            for(int i = 0; i < l.size(); i++){
                System.out.printf("Posição %d, produto: %s \n",i+1,l.get(i));
            }
            s = new Scanner(System.in);
            int n = s.nextInt();
            System.out.print("Quantos produtos deseja: \n");
            int t = s.nextInt();
            preco += (double) t * l.get(n - 1).getPreco_unitario(); // adiciona o preco
            int g = l.get(n-1).getStock();      // recebe o stock q tinha
            l.get(n-1).setStock(g-t);   // coloca o novo stock depiis de lhe ter retirado t's produtos
        }
        return preco;


    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public ArrayList<Produto> getProds() {
        return prods;
    }

    public void setProds(ArrayList<Produto> prods) {
        this.prods = prods;
    }

    public Venda(Cliente nov, Produto novP) {
        this.cli = nov;
    }
}
