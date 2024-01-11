import entities.*;
import models.AlunoModel;
import models.CursoModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestaoCursosMain {

    public static void main(String[] args) {

        CursoModel cursoModel = new CursoModel();
        AlunoModel alunoModel = new AlunoModel();
        List<Aluno> alunos;
        List<Curso> cursos;

        Telefone tel1 = new Telefone();
        tel1.setDdd("34");
        tel1.setNumero("99169-99169");

        Telefone tel2 = new Telefone();
        tel2.setDdd("34");
        tel2.setNumero("3233-3233");

        Telefone tel3 = new Telefone();
        tel3.setDdd("34");
        tel3.setNumero("98813-98813");

        Endereco end1 = new Endereco();
        end1.setLogradouro("Rua");
        end1.setEndereco("Jose Miguel");
        end1.setNumero("101");
        end1.setBairro("Santa Monica");
        end1.setCidade("Uberlandia");
        end1.setEstado("Minas Gerais");
        end1.setCep(38408000);

        Endereco end2 = new Endereco();
        end2.setLogradouro("Avenida");
        end2.setEndereco("Lourdes");
        end2.setNumero("90");
        end2.setBairro("Centro");
        end2.setCidade("Uberlandia");
        end2.setEstado("Minas Gerais");
        end2.setCep(35300111);

        // 1: Criando um Aluno-1 com Telefone-1 Telefone-2 Endereco-1 e Aluno-2 com Telefone-3 Endereco-2
        System.out.println("::::: Criando dois Alunos -> Aluno-1 com Telefone-1 Telefone-2 Endereco-1 e Aluno-2 com Telefone-3 Endereco-2");
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        aluno1.setNomeCompleto("Guilherme Castilho");
        aluno1.setMatricula("ALUNO-01");
        aluno1.setNascimento(LocalDate.of(1991,12,10));
        aluno1.setEmail("guilherme@aluno.com");
        aluno1.setTelefones(new ArrayList<Telefone>(List.of(tel1, tel2)));
        aluno1.setEnderecos(new ArrayList<Endereco>(List.of(end1)));
        aluno2.setNomeCompleto("Filipe Barbosa");
        aluno2.setMatricula("ALUNO-02");
        aluno2.setNascimento(LocalDate.of(1993,1,25));
        aluno2.setEmail("filipe@aluno.com");
        aluno2.setTelefones(new ArrayList<Telefone>(List.of(tel3)));
        aluno2.setEnderecos(new ArrayList<Endereco>(List.of(end2)));
        alunoModel.create(aluno1);
        alunoModel.create(aluno2);

        // 2: Buscando Aluno-1 e Aluno-2
        System.out.println("::::: Buscando Aluno-1 e Aluno-2");
        Aluno searchAlunoId1 = new Aluno();
        Aluno searchAlunoId2 = new Aluno();
        searchAlunoId1.setId(1L);
        searchAlunoId1 = alunoModel.findById(searchAlunoId1);
        searchAlunoId2.setId(2L);
        searchAlunoId2 = alunoModel.findById(searchAlunoId2);
        System.out.println(searchAlunoId1);
        System.out.println(searchAlunoId2);

        // 3: Deletando Aluno-2
        System.out.println("::::: Deletando Aluno-1");
        Aluno deleteAlunoId1 = new Aluno();
        deleteAlunoId1.setId(2L);
        alunoModel.delete(deleteAlunoId1);

        // 4: Buscando Todos os Alunos
        System.out.println("::::: Buscando Todos os Alunos");
        alunos = alunoModel.findAll();
        System.out.println(alunos);

        // 4: Autalizando Nome do Aluno-1 e mudando o numero do Telefone-1
        System.out.println("::::: Autalizando Nome do Aluno-1 e mudando o numero do Telefone-1");
        Aluno updateAlunoId1 = new Aluno();
        updateAlunoId1.setId(1L);
        updateAlunoId1 = alunoModel.findById(updateAlunoId1);
        updateAlunoId1.setNomeCompleto("Guilherme Castilho Casassanta");
        updateAlunoId1.getTelefones().forEach(telefone -> {
            if(telefone.getId() == 1L)
                telefone.setNumero("9999-9999");
        });
        alunoModel.update(updateAlunoId1);

        // 5: Buscando Todos os Alunos
        System.out.println("::::: Buscando Todos os Alunos");
        alunos = alunoModel.findAll();
        System.out.println(alunos);

        Professor prof1 = new Professor();
        prof1.setNomeCompleto("Autran");
        prof1.setMatricula("PROF-01");
        prof1.setEmail("Autran@prof.com");
        Professor prof2 = new Professor();
        prof2.setId(1L);

        MaterialCurso material1 = new MaterialCurso();
        material1.setUrl("www.google.com");

        MaterialCurso material2 = new MaterialCurso();
        material2.setUrl("www.ciandt.com");

        // 6: Criando Curso-1 e Curso-2 com o mesmo Professor-1 e MaterialCurso-1 / MaterialCurso-2
        System.out.println("::::: Criando Curso-1 e Curso-2 com o mesmo Professor-1 e MaterialCurso-1 / MaterialCurso-2");
        Curso curso1 = new Curso();
        curso1.setNome("Ciencia da Computacao");
        curso1.setSigla("CC");
        curso1.setProfessor(prof1);
        curso1.setMaterialCurso(material1);
        Curso curso2 = new Curso();
        curso2.setNome("Sistema de Informacao");
        curso2.setSigla("SI");
        curso2.setProfessor(prof2);
        curso2.setMaterialCurso(material2);
        cursoModel.create(curso1);
        cursoModel.create(curso2);

        // 7: Buscando Curso-1 e Curso-2
        System.out.println("::::: Buscando Curso-1 e Curso-2");
        Curso searchCursoId1 = new Curso();
        Curso searchCursoId2 = new Curso();
        searchCursoId1.setId(1L);
        searchCursoId2.setId(2L);
        searchCursoId1 = cursoModel.findById(searchCursoId1);
        searchCursoId2 = cursoModel.findById(searchCursoId2);
        System.out.println(searchCursoId1);
        System.out.println(searchCursoId2);

        // 9: Deletando Curso-1
        System.out.println("::::: Deletando Curso-1");
        Curso deleteCursoId1 = new Curso();
        deleteCursoId1.setId(1L);
        cursoModel.delete(deleteCursoId1);

        Professor prof3 = new Professor();
        prof3.setNomeCompleto("Marcia Aparecida");
        prof3.setMatricula("PROF-2");
        prof3.setEmail("marcia@prof.com");

        // 9: Autalizando Nome do Curso-2 e mudando o professor para Professor-2 e mudando a URL do MaterialCurso-2
        System.out.println("::::: Autalizando Nome do Curso-2 e mudando o professor para Professor-2 e mudando a URL do MaterialCurso-2");
        Curso updateCursoId2 = new Curso();
        updateCursoId2.setId(2L);
        updateCursoId2 = cursoModel.findById(updateCursoId2);
        updateCursoId2.setNome("Sistema da Infomacao Atualizado");
        updateCursoId2.setProfessor(prof3);
        updateCursoId2.getMaterialCurso().setUrl("www.ciandt.com/courses");
        cursoModel.update(updateCursoId2);

        // 10: Buscando Todos os Cursos
        System.out.println("::::: Buscando Todos os Cursos");
        cursos = cursoModel.findAll();
        System.out.println(cursos);

        // 9: Atualizando o Curso-2 adicionando o Aluno-1
        System.out.println("::::: Atualizando o Curso-2 adicionando o Aluno-1");
        updateCursoId2 = cursoModel.findById(updateCursoId2);
        searchAlunoId1 = alunoModel.findById(searchAlunoId1);
        updateCursoId2.setAlunos(new ArrayList<Aluno>(List.of(searchAlunoId1)));
        cursoModel.update(updateCursoId2);

        // 11: Buscando Todos os Cursos
        System.out.println("::::: Buscando Todos os Cursos");
        cursos = cursoModel.findAll();
        System.out.println(cursos);
    }
}