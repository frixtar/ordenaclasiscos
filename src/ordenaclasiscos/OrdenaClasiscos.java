package ordenaclasiscos;

import java.util.*;
import java.util.Collections;
import javax.swing.JOptionPane;
public class OrdenaClasiscos {

    public static void main(String[] args) {
        ArrayList<Estudiante> ae = new ArrayList<>();
        ae.add(new Estudiante("juanito", 6, 8));
        ae.add(new Estudiante("lolita", 2, 10));
        ae.add(new Estudiante("lupe", 4, 6));
        ae.add(new Estudiante("beto", 4, 9));
        ae.add(new Estudiante("rubi", 2, 10));
        ae.add(new Estudiante("juancho", 2, 7));
        ae.add(new Estudiante("pedro", 6, 5));
        ae.add(new Estudiante("shari", 4, 8));
        ae.add(new Estudiante("pablo", 3, 10));

        
        int en=-1;
        while(en !=0){
            en= Integer.parseInt(JOptionPane.showInputDialog("0.- Salir\n"+
                    "1.-ordenar por semestre y nombre\n"+
                    "2.-ordenar por semestres y calififcación;"));
            switch(en){
                case 1: 
                    Collections.sort(ae, new Comparator<Estudiante>() {
                        @Override
                        public int compare(Estudiante t, Estudiante t1) {
                            if (t.semestre == t1.semestre) {
                                return t.nombre.compareTo(t1.nombre);
                            }
                            return t.semestre - t1.semestre;
                        }
        });
              System.out.println(ae);
                    break;
                case 2:
                    Collections.sort(ae, new Comparator<Estudiante>() {
                        @Override
                        public int compare(Estudiante t, Estudiante t1) {
                            if (t.semestre == t1.semestre) {
                                return t.calificacion - t1.calificacion;
                            }
                            return t.semestre - t1.semestre;
                        }
                    });
                        System.out.println(ae);
                    }
                    break;
            }
        }
    }
}