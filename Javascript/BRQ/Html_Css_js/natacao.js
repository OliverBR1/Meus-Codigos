function calcularCategoria() {
    idade = parseInt(document.getElementById('idade').value)
    if (idade < 10) {
        categoria = "Mirim"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    }else if(idade >=10 && idade <25){
        categoria = "Juvenil"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    }else if(idade >=25 && idade <50){
        categoria = "Adulto"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    }else if(idade >=50){
        categoria = "Senior"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    }else
    document.getElementById('mensagem').innerHTML = "Você não possui categoria."
}       

