package Exam.Exam2018.Oppgava4;

import javax.xml.crypto.Data;
import java.util.Date;

public class Ansatt {
    //	opprett	3	attributter
//	navn,	født	og	tiltrådt,	de	to	siste	skal	være	av	type	Dato.
//	opprett	også	en	konstruktør	for	disse
//	lag	også	en	toString-metode	for	klassens	attributter

    String navn;
    Dato født;
    Dato tiltrådt;


    public Ansatt(String navn, Dato født, Dato tiltrådt) {
        this.navn = navn;
        this.født = født;
        this.tiltrådt = tiltrådt;
    }

    @Override
    public String toString() {
        return "Ansatt{" +
                "navn='" + navn + '\'' +
                ", født=" + født +
                ", tiltrådt=" + tiltrådt +
                '}';
    }
}
