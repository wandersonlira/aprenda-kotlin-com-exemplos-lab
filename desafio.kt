enum class Nivel { EASY, MEDIUM, ADVANCED }
enum class Sexo { MASCULINO, FEMENINO }

data class Usuario(val name: String, val sexo: Sexo, var idade: Int )

data class ConteudoEducacional(val nome: String, val nivel: Nivel, var duracao: Int)

data class Formacao(val nome: String, var conteudos: ConteudoEducacional, val aluno: Usuario) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(aluno: Usuario){
        inscritos.add(aluno)
    }
}


fun main() {
    
	val variosConteudos = mutableListOf<ConteudoEducacional>()
       variosConteudos.add(ConteudoEducacional("Geometria Plana", Nivel.EASY, 40))
       variosConteudos.add(ConteudoEducacional("Função aritmética", Nivel.MEDIUM, 20))
       variosConteudos.add(ConteudoEducacional("Plano Cartesiano", Nivel.EASY, 60))
       variosConteudos.add(ConteudoEducacional("Progreção aritmética", Nivel.ADVANCED, 30))
       
       println("* -------- Lista de Cursos --------- *")
        var cont = 0
    
        for (i in variosConteudos){
           println("Conteúdo [$cont]: ${i.nome}, ${i.nivel}, ${i.duracao}")
           cont++
        }
        
        println("--------------------------------------------")
    
    val usuario1 = Usuario("Zezinho Panda", Sexo.MASCULINO, 20)
    val formacaoUsuario1 = Formacao("Matemática", variosConteudos[2], usuario1)
    
    println("\n* ====== Formação ======= *")
    println("Disciplina: ${formacaoUsuario1.nome} \nConteúdo: ${formacaoUsuario1.conteudos.nome}, ${formacaoUsuario1.conteudos.nivel}, ${formacaoUsuario1.conteudos.duracao} minutos \nAluno: ${formacaoUsuario1.aluno.name}, ${formacaoUsuario1.aluno.sexo}, ${formacaoUsuario1.aluno.idade}")
      
    val usuario2 = Usuario("Tai Tigresa", Sexo.FEMENINO, 24)
    val formacaoUsuario2 = Formacao("Matemática", variosConteudos[3], usuario2)
    
    println("\n* ====== Formação ======= *")
    println("Disciplina: ${formacaoUsuario2.nome} \nConteúdo: ${formacaoUsuario2.conteudos.nome}, ${formacaoUsuario2.conteudos.nivel}, ${formacaoUsuario2.conteudos.duracao} minutos \nAluno: ${formacaoUsuario2.aluno.name}, ${formacaoUsuario2.aluno.sexo}, ${formacaoUsuario2.aluno.idade}")
   
      
}
