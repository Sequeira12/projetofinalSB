import java.util.*;

public class Data{
    private int day, month, year;

    public Data(int dia,int mes, int ano) {
        this.day = dia;
        this.month = mes;
        this.year = ano;
        verifica(dia,mes,ano);



    }

    /** verifica se a data é valida ou nao, e inicializa o dia, mes e ano*/
    public void verifica(int dia, int mes, int ano){
        if (mes > 0 && mes <= 12) {
            this.month = mes;
        } else {
            System.out.println("ERRO,mês tem que ser entre 1 e 12 ");
            return;
        }
        if (ano > 0) {
            this.year = ano;
        }else{
            return;
        }
        if ((dia >= 1 && dia <= 31) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
            this.day = dia;
        else if ((dia >= 1 && dia <= 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
            this.day = dia;
        else if ((dia >= 1 && dia <= 28) )
            this.day = dia;
        else if (dia == 29  && (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)))
            this.day = dia;
        else
            System.out.print("ERRO, data inválida!!\n");
        this.day = checkDay(dia);

    }


    /** verifica se as datas são validas, se nao forem volta a pedir*/
    public int checkDay(int day){
        if( month == 2 && year % 4 != 0){
            while(day < 1 || day > 28) {
                System.out.print("Dia: ");
                Scanner sc = new Scanner(System.in);
                day = sc.nextInt();

            }
        }else if ( month == 2 ) {
            while( day < 1 || day > 29){
                System.out.print("Dia: ");
                Scanner sc = new Scanner(System.in);
                day = sc.nextInt();
            }

        }else{
            if(month < 7 && month % 2 == 0){
                while( day < 1 || day > 30){
                    System.out.print("Dia: ");
                    Scanner sc = new Scanner(System.in);
                    day = sc.nextInt();
                }
            }else if( month > 7 && month % 2 != 0){
                while ( day < 1 || day > 30) {
                    System.out.print("Dia: ");
                    Scanner sc = new Scanner(System.in);
                    day = sc.nextInt();

                }
            }else{
                while( day < 1 || day > 31){
                    System.out.print("Dia: ");
                    Scanner sc = new Scanner(System.in);
                    day = sc.nextInt();
                }
            }
        }
        return day;
    }

    @Override
    public String toString() {
        return "Data: "  + day + "-"  + month + "-" + year ;
    }

}