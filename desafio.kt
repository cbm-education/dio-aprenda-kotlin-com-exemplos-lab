enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println("Matrícula de ${usuario.nome} realizada com sucesso!")
        println("Conteudos:")
        conteudos.forEach {
            i -> println("- ${i.nome}")
        }
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val conteudoKotlin = mutableListOf<ConteudoEducacional>()

    val aluno1 = Usuario("Joao Maria")
    val conteudo = ConteudoEducacional("Introdução ao Kotlin")
    conteudoKotlin.add(conteudo)

        val formacao1 = Formacao(aluno1.nome, conteudoKotlin)
        formacao1.matricular(aluno1)
}
