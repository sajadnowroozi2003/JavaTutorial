package Exam.Exam2018.Oppgava4;

import java.util.ArrayList;

public class Main {
    public	static	void	main(String[]	args)	{
//	opprett	en	ArrayListe	og	legg	to	ansatte	inn	i	denne
//	skriv	så	alt	innholdet	i	arrraylisten	ut	på	system.out.

//        Dato  dato1  = new Dato(3,7,1992);
//        Dato dato2 = new Dato(1,1,2020);

        ArrayList<Ansatt> AnsattList = new ArrayList<>();

        Ansatt ansatt1  = new Ansatt("Ali",new Dato(3,5,1990), new Dato(1,1,2020));
        AnsattList.add(ansatt1);
        Ansatt ansatt2  = new Ansatt("Sajad",new Dato(25,5,2003), new Dato(1,1,2022));
        AnsattList.add(ansatt2);

//        for (Ansatt num : AnsattList){
//            System.out.println(num);
//
//        }
        for (int i =0 ; i<AnsattList.size() ; i++){
            System.out.println(AnsattList.get(i));
        }
    }
}
