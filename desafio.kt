enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(var nome: String, val nivel: Nivel, val duracao: Int = 50)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println("Matrícula de ${usuario.nome} no curso $nome realizada com sucesso!")
        println("Conteudos:")
        conteudos.forEach {
            i -> println("- ${i.nome}")
        }
    }
}

fun getFormacaoKotlin(): Formacao {
    
    val conteudoKotlin = listOf(ConteudoEducacional("Introdução ao Kotlin", Nivel.BASICO), ConteudoEducacional("Documentacao do Kotlin", Nivel.BASICO), ConteudoEducacional("Orientação a Objeto com Kotlin", Nivel.AVANCADO, 200))
    
    return Formacao("Kotlin para Iniciantes", conteudoKotlin)
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val aluno1 = Usuario("Joao Maria", "joaomaria@email.eml")

    val formacaoKotlin = getFormacaoKotlin()
    formacaoKotlin.matricular(aluno1)
}
