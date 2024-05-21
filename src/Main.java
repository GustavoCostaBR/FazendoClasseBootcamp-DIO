import com.allogica.Bootcamp.entities.Atividade;
import com.allogica.Bootcamp.entities.Bootcamp;
import com.allogica.Bootcamp.entities.Dev;
import com.allogica.Bootcamp.entities.Mentoria;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bootcamp bootcampJava = new Bootcamp(LocalDateTime.of(2024, 10, 12, 0, 0), LocalDateTime.of(2024, 11, 12, 0, 0), "JavaBootcamp", "Bootcamp de Java para programadores juniores");

        Atividade atividade1 = new Atividade("Introdução a Java", "Um curso introdutório ao java");
        atividade1.setCargaHoraria(15);
        bootcampJava.addAtividade(atividade1);
        Mentoria mentoria1 = new Mentoria("Dúvidas iniciais", "Mentoria sobre o curso introdutório ao Java");
        bootcampJava.addMentoria(mentoria1);

        Dev gustavo = new Dev("Gustavo");
        gustavo.inscreverNoBootcamp(bootcampJava);
        gustavo.exibirCursos();
        gustavo.progredir(gustavo.getBootcamps().get(0).getAtividades().get(0));
        gustavo.progredir(gustavo.getBootcamps().get(0).getMentorias().get(0));

        gustavo.exibirCursos();
        System.out.println(gustavo.calcularTotalXp());
    }
}
